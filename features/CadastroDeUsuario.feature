# language: pt

@TesteCadastroUsuario
Funcionalidade: Acessar o app Cadastro de clientes
  Cenario: Cadastrar um novo usuário
    Dado que estou na tela principal do app
    Quando clicar no botão opções
    E clicar na opção Cadastrar Novo
    E preencher os dados
    E clicar em salvar
    Então deve criar um usuario no app