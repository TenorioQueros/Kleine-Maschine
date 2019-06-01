
// configurações gerais, mexer com cautela
var express = require('express');
var router = express.Router();
var isNull = require('../script').isNull;
var Database = require('../Database');
const Cryptr = require('cryptr');
const config = require('../config');
const cryptr = new Cryptr(config.security.key);
const moment=require('moment-timezone');
// configurações gerais, mexer com cautela


// consulta que retorna as médias  transacao
router.get('/medias_transac', (req, res, next) => {

    Database.query(`SELECT avg(numeroTransacao) as media_transacao FROM tbTransacaoFake`).then(resultados => {
        var linha = resultados.recordsets[0][0];
        var numeroTransacao = linha.media_transacao.toFixed(2);
       res.json({numeroTransacao:numeroTransacao});
    }).catch(error => {
        console.log(error);
        res.status(400).json({"error": `erro na consulta junto ao banco de dados ${error}`});
    });

});


module.exports = router;