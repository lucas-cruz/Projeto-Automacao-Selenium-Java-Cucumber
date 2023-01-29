package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();



    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.fillPassword("12345");
        cadastroPage.selecionaAniversario(3,7,"1995");
        cadastroPage.fillFirstName("Lucas");
        cadastroPage.fillLasttName("Cruz");
        cadastroPage.fillCompany("Teste");
        cadastroPage.fillAddress1("rua teste");
        cadastroPage.selectCountry("Australia");
        cadastroPage.fillState("São Paulo");
        cadastroPage.fillCity("São Paulo");
        cadastroPage.fillZipCode("01010010");
        cadastroPage.fillMobileNumber("999999999");

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.submit();

    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
    cadastroPage.checkRegistrationSuccess();
    }
}
