package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;


public class LoginPage extends RunCucumberTest {

    //Elementos
    private By create_name_field = By.name("name");
    private By create_email_field = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By button = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    private final By titulo = By.xpath("//*[@id=\"form\"]/div/div/div/div");


    //Acessar pagina de login
    public void accessLoginPage(){
        getDriver().get("https://automationexercise.com/signup");
        Utils.waitElementBePresent(create_name_field,20);
    }

    //Preencher nome e E-mail para cadastro
    public void fillLoginData(String name){
        getDriver().findElement(create_name_field).sendKeys(name);
        getDriver().findElement(create_email_field).sendKeys(Utils.getRandomEmail());
    }

    //Clicar em SingUp
    public void clickSingUp(){
        getDriver().findElement(button).click();
    }

}
