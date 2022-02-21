#language: pt

@ExibirInfo
Funcionalidade: Acessar o app Cadastro de clientes
  Cenario: Acessar a página de info sobre o app
    Dado que estou na tela principal do app
    Quando clicar no botão opções
    E clicar na opção Sobre o app
    E o app avança para a tela de informações
    E quando eu fizer o swipe para retornar
    Então o app retorna para a tela principal
