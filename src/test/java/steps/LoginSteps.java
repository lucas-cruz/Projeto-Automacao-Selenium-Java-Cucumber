package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();
    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        getDriver(Browser.CHROME);
        loginPage.accessLoginPage();
    }

    @Dado("^acesso o cadastro de usuario$")
    public void acesso_o_cadastro_de_usuario() {
        loginPage.fillLoginData("teste");
        loginPage.clickSingUp();
    }

}
