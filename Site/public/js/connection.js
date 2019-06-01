// configurações de acesso ao banco de dados
const cfg = {
        "host": "kmaschine.database.windows.net", // server name do banco de dados
        "user": "bandtec", // login ("bandtec")
        "pass": "@Bacons2", // senha do banco de dados
        "db": "KMaschine" // nome da base de dados
    };
    

// configurações da conexão com o banco de dados
const config = {
    server: cfg.host,
    userName: cfg.user,
    password: cfg.pass,
    options: {
        debug: {
            packet: true,
            data: true,
            payload: true,
            token: false,
            log: true
        },
        database: cfg.db,
        encrypt: true
    }
};