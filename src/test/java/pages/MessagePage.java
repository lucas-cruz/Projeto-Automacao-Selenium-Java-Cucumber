package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class MessagePage extends RunCucumberTest {

    private By name_field = By.name("name");
    private By email_field = By.name("email");
    private By subject_field = By.name("subject");
    private By message_field = By.id("message");
    private By upload_field = By.name("upload_file");
    private By submit_button = By.name("submit");
    private By message_success = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");

    public void accessMessagePage(){
        getDriver(Browser.CHROME);
        getDriver().get("https://automationexercise.com/contact_us");
        Utils.waitElementBePresent(name_field,20);
    }

    //preencher nome
    public void fillName(String name){
        getDriver().findElement(name_field).sendKeys(name);
    }

    //preencher e-mail
    public void fillEmail(String email){
        getDriver().findElement(email_field).sendKeys(email);
    }

    //preencher assunto da mensagem
    public void fillSubject(String subject){
        getDriver().findElement(subject_field).sendKeys(subject);
    }

    //preencher mensagem
    public void fillMessage(String message){
        getDriver().findElement(message_field).sendKeys(message);
    }

    //uploar de arquivo
    public void uploadFile(String pathFile) {
        getDriver().findElement(upload_field).sendKeys(pathFile);
    }

    //clicar em submit
    public void submitButton(){
        getDriver().findElement(submit_button).click();
    }

    //confirmar alerta
    public void confirmAlert(){
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    //verificar mensagem enviada com sucesso
    public void messageSuccess(String message) {
        Assert.assertEquals(message, getDriver().findElement(message_success).getText());
    }
}
