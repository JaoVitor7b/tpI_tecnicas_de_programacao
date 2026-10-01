CREATE DATABASE IF NOT EXISTS BancoTPI;
USE BancoTPI;

CREATE TABLE IF NOT EXISTS usuario (
    codigo INT NOT NULL PRIMARY KEY,
    login VARCHAR(30) NOT NULL,
    senha VARCHAR(25) NOT NULL,
    telefone VARCHAR(18)
);

-- Exemplo:
-- INSERT INTO usuario (codigo, login, senha, telefone)
-- VALUES (1, 'login123', 'senha123', '(13)99999-9999');

SELECT * FROM usuario;
