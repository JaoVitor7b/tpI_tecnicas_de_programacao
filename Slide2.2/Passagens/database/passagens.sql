CREATE DATABASE IF NOT EXISTS Passagens
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE Passagens;

CREATE TABLE IF NOT EXISTS passagem (
    Codigo INT NOT NULL PRIMARY KEY,
    NomePassageiro VARCHAR(120) NOT NULL,
    Telefone VARCHAR(30),
    RG VARCHAR(30),
    LocalViagem VARCHAR(120) NOT NULL,
    Data VARCHAR(20),
    Horario VARCHAR(20),
    NumPoltrona VARCHAR(20)
);

-- Exemplo opcional:
-- INSERT INTO passagem VALUES
-- (1, 'João da Silva', '(13) 99999-9999', '12.345.678-9', 'São Paulo - SP', '30/09/2026', '20:30', '12');
