# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário
    Eu como usuário quero me cadastrar
    na plataforma para ser um cliente.

    @cadastro-sucesso
    Cenario: Registrar novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuario
    Quando eu preencho o formulario de cadastro
    E clico em registrar
    Então vejo a mensagem de cadastro realizado com sucesso