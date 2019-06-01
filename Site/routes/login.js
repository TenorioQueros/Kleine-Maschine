var express = require('express');
var router = express.Router();
var isNull = require('../script').isNull;
var Database = require('../Database');
const Cryptr = require('cryptr');
const config = require('../config');
const cryptr = new Cryptr(config.security.key);

// rota de autenticação
console.log('ops');
router.post('/', (req, res, next) => {
    console.log('tentando autenticar...');
	
	try {
			
		// após o body, são os nomes dos campos no formulário	
		var emailFuncionario = req.body.emailFuncionario;
		var senhaFuncionario = req.body.senhaFuncionario;
		
		const msgErro = {'mensagem': 'Login e/ou senha inválidos!'};
		
		if (isNull(emailFuncionario) || isNull(senhaFuncionario)) {
			console.log('Login e/ou senha inválidos');
			res.render('emailFuncionario', msgErro);
		} else {
			console.log('tentando consulta no banco...');
				Database.query(`SELECT * FROM tbLogin WHERE emailFuncionario = '${emailFuncionario}';`).then(results => {
				console.log(`Linhas: ${results.recordsets[0].length}`);
				let linhas = results.recordsets[0];
				if (linhas.length > 0) {
					let senhaFuncionario = linhas[0].senhaFuncionario; 
					if (senhaFuncionario === senhaFuncionario) {
							console.log('senha ok...');
						let user = {
							//nomeUsuario: linhas[0].nomeUsuario, 
							emailFuncionario: linhas[0].emailFuncionario, 
						};
						req.session.user = user;
						res.status(200).send('ok');
							console.log('user ok...');
					} else {
						res.status(401).send(msgErro);
					}
				} else {
					res.status(401).send(msgErro);
				}
			}).catch(error => {
				res.status(401).send(msgErro);
			});
		}
    
	} catch (e) {
		console.error(`	Error ao logar usuario, tente novamente: ${e}`);
		res.send({'mensagem':`${e}`});
	}

});


router.get('/sessao', (req, res, next) => {
    if (req.session.user && req.session.user) {
		const usuario = req.session.user;
        res.json({
           // 'nome': tbUsuario.nomeUsuario,
            'login': tbLogin.loginFuncionario,
        });
    } else {
        res.status(401).json({
            'mensagem': 'Nenhum usuário na sessão'
        });
    }
});

module.exports = router;
