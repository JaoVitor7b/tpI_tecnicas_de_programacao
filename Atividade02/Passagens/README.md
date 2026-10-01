# Projeto PASSAGEM

Projeto Java Swing/NetBeans baseado no projeto `Clinica.zip` fornecido, adaptado para o exercício PASSAGEM.

## Funcionalidades
- Tela de menu principal para chamar a tela de Passagens.
- Cadastro de passagem.
- Alteração de passagem.
- Exclusão de passagem.
- Consulta/listagem em JTable.
- Clique em uma linha da tabela para carregar os dados nos campos.
- Ícones nos botões.
- Banco MySQL.

## Campos da passagem
- Código (int)
- Nome do passageiro (String)
- Telefone (String)
- RG (String)
- Local da viagem (String)
- Data (String)
- Horário (String)
- Número da poltrona (String)

## Banco de dados
1. Abra o MySQL/phpMyAdmin.
2. Execute `database/passagens.sql`.
3. Por padrão a aplicação usa:
   - Banco: `Passagens`
   - Usuário: `root`
   - Senha: vazia
   - Servidor: `127.0.0.1:3306`

Se o seu MySQL usar outra senha/porta, altere `src/Control/Conexao.java`.

## NetBeans
O projeto usa Ant e Java 21, seguindo a estrutura do projeto enviado.
Adicione o arquivo `mysql-connector-j-8.x.x.jar` ao classpath do projeto, caso ainda não esteja configurado.

Classe principal: `View.FrmMenu`


### JFrame
A tela `View.FrmPassagem` é uma classe Swing `JFrame`, podendo ser aberta diretamente no NetBeans como uma janela do sistema. O menu também é um `JFrame` e chama `FrmPassagem`.
