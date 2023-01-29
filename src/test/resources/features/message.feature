# language: pt

@message
Funcionalidade: Enviar mensagem.

  @enviar-mensagem-sucesso
  Cenario: enviar uma mensagem com sucesso
    Dado que estou na tela de mensagens
    E preencho todos os campos
    Quando clico em enviar mensagem
    Então vejo a mensagem de enviado com sucesso