$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuário",
  "description": "Eu como usuário quero me cadastrar\r\nna plataforma para ser um cliente.",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Registrar novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;registrar-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "vejo a mensagem de cadastro realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 36707512600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "duration": 6294500500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.eu_preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 2419112300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 4737149000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_a_mensagem_de_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 181047000,
  "status": "passed"
});
formatter.uri("message.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Enviar mensagem.",
  "description": "",
  "id": "enviar-mensagem.",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@message"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "enviar uma mensagem com sucesso",
  "description": "",
  "id": "enviar-mensagem.;enviar-uma-mensagem-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@enviar-mensagem-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de mensagens",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "preencho todos os campos",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clico em enviar mensagem",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "vejo a mensagem de enviado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "MessageSteps.que_estou_na_tela_de_mensagens()"
});
formatter.result({
  "duration": 36051730600,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.preencho_todos_os_campos()"
});
formatter.result({
  "duration": 712398700,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.clico_em_enviar_mensagem()"
});
formatter.result({
  "duration": 140812500,
  "status": "passed"
});
formatter.match({
  "location": "MessageSteps.vejo_a_mensagem_de_enviado_com_sucesso()"
});
formatter.result({
  "duration": 61107100,
  "status": "passed"
});
});