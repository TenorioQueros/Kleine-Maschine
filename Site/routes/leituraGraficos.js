'use strict';

var express = require('express');
var router = express.Router();
var isNull = require('../script').isNull;
var Database = require('../Database');
const Cryptr = require('cryptr');
const config = require('../config');
const cryptr = new Cryptr(config.security.key);
const moment = require('moment-timezone');


// consulta que retorna os N últimos registros de leitura
router.get('/ultimas', (req, res, next) => {

    var limite_linhas = 5;
    var resposta = {};
    Database.query(`SELECT TOP ${limite_linhas} aceitas, timeouts, total,dataHoraTranc  FROM tbTransacao order by dataHoraTranc desc`).then(resultados => {
        resultados = resultados.recordsets[0];

        resposta.cols = [
				{id: 'aceitas', label: 'total', type: 'number'},
				{id: 'timeouts', label: 'total', type: 'number'},
				{id: 'total', label: 'total', type: 'number'},
            {id: 'dataHoraTranc', label: 'dataHoraTranc', type: 'time'},
           
            
        ];
        
        var linhas = [];
        
        for (var i = 1; i < resultados.length; i++) {
            var row = resultados[i];
            var momento = moment(row.dataHoraTempUmid).format('HH-mm-ss').split('-');
            var registro = {
                c: [
				{v: row.aceitas},
				{v: row.timeouts},
				{v: row.total},
				{v: momento},
                    
                   
                   ]
               };
            linhas.push(registro);
        }
        resposta.rows = linhas;
        
        res.json(resposta);
    }).catch(error => {
        console.log(error);
        res.status(400).json({"error": `erro na consulta junto ao banco de dados ${error}`});
    });

});





module.exports = router;
