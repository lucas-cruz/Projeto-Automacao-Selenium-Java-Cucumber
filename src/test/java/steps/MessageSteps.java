package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.MessagePage;
import runner.RunCucumberTest;
import support.Utils;

public class MessageSteps extends RunCucumberTest {

    MessagePage messagePage = new MessagePage();


    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens() {
        messagePage.accessMessagePage();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos() {
        messagePage.fillName("tester");
        messagePage.fillEmail(Utils.getRandomEmail());
        messagePage.fillSubject("Assunto teste");
        messagePage.fillMessage("teste de upload de arquivos");
        messagePage.uploadFile("C:\\Users\\lsilvacr\\Documents\\SeleniumCucumberTestAutomationProject\\tsc.png");

    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        messagePage.submitButton();
        messagePage.confirmAlert();
    }

    @Então("^vejo a mensagem de enviado com sucesso$")
    public void vejo_a_mensagem_de_enviado_com_sucesso() {
        messagePage.messageSuccess("Success! Your details have been submitted successfully.");

    }
}
