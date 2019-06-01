var nodemailer = require('nodemailer');

var transporter = nodemailer.createTransport({
  service: 'hotmail',
  auth: {
    user: 'kleine.maschine@hotmail.com.com',
    pass: '@Bacons2'
  }
});

var mailOptions = {
  from: 'kleine.maschine@hotmail.com',
  to: 'paulo.bertucci@hotmail.com',
  subject: 'Alerta de alterações!',
  text: 'Atenção! Ocorreu uma alteração nos parâmetros estabelecidos, verifique imediatamente!'
};

transporter.sendMail(mailOptions, function(error, info){
  if (error) {
    console.log(error);
  } else {
    console.log('Email enviado: ' + info.response);
  }
});