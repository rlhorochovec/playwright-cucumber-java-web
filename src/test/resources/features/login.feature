# language: pt
Funcionalidade: Login
  Eu como usuário do sistema
  Desejo realizar o login no sistema
  Para realizar minhas tarefas

  Esquema do Cenário: Login inválido - <mensagem>
    Dado que inseri usuário "<usuario>" e senha "<senha>"
    Quando clicar no botão Entrar
    Então apresentará uma mensagem de "<mensagem>"
    Exemplos:
      | usuario | senha  | mensagem                       |
      | admin   |        | Informe a senha!               |
      |         | user   | Informe o usuário!             |
      | admin   | user   | Usuário e/ou senha incorretos! |
      |         |        | Informe usuário e senha!       |