PROJETO CRUD - CORRIGIDO

Base do projeto original mantida.

Correções realizadas:
1. Driver MySQL atualizado para com.mysql.cj.jdbc.Driver.
2. URL do MySQL configurada com porta 3306 e parâmetros de conexão.
3. UPDATE corrigido de "usuarios" para "usuario".
4. Tratamento da consulta da JTable corrigido para evitar erro quando a tabela estiver vazia.
5. Execução de comandos SQL ajustada para executeUpdate().
6. Script BancoTPI.sql incluído para criar o banco e a tabela usada pelo projeto.

Banco:
- Nome: BancoTPI
- Tabela: usuario
- Usuário: root
- Senha: vazia (conforme o código original)

Observação:
O projeto continua dependendo do MySQL Connector/J 8.2.0 indicado no nbproject/project.properties.
