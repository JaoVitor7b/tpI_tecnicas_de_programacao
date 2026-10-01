CREATE DATABASE IF NOT EXISTS Clinica;
USE Clinica;

CREATE TABLE IF NOT EXISTS paciente (
    CodPaciente INT NOT NULL,
    Nome VARCHAR(100) NOT NULL,
    Endereco VARCHAR(150),
    Complemento VARCHAR(100),
    Rg VARCHAR(20),
    Cpf VARCHAR(20),
    Data VARCHAR(20),
    PRIMARY KEY (CodPaciente)
);

-- Exemplo:
-- INSERT INTO paciente (CodPaciente, Nome, Endereco, Complemento, Rg, Cpf, Data)
-- VALUES (1, 'João', 'Rua Exemplo', 'Casa', '123456', '12345678900', '01/01/2000');
