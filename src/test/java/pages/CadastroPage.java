package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

    //Elementos
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By pass = By.id("password");
    private By first_name = By.id("first_name");
    private By last_name = By.id("last_name");
    private By company = By.id("company");
    private By address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By state_field = By.id("state");
    private By city_field = By.id("city");
    private By zipcode_field = By.id("zipcode");
    private By mobile_number = By.id("mobile_number");
    private By select_day_field = By.id("days");
    private By select_month_field = By.id("months");
    private By select_year_field = By.id("years");
    private By country_field = By.id("country");
    private By submit_button = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");

    private By cadastro_sucesso = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");


    //selecionar titular
    public void selectTitle(Integer type){
        Utils.waitElementBePresent(titleM,20);
        if(type == 1){
            getDriver().findElement(titleM).click();
        }else{
            getDriver().findElement(titleF).click();
        }
    }

    //preencher senha
    public void fillPassword(String password){
        getDriver().findElement(pass).sendKeys(password);
    }
    //preencher primeiro nome
    public void fillFirstName(String name){
        getDriver().findElement(first_name).sendKeys(name);
    }
    //preencher sobrenome
    public void fillLasttName(String lastName){
        getDriver().findElement(last_name).sendKeys(lastName);
    }
    //preencher companhia
    public void fillCompany(String company){
        getDriver().findElement(last_name).sendKeys(company);
    }
    //preencer endereço
    public void fillAddress1(String address){
        getDriver().findElement(address1).sendKeys(address);
    }
    //preencher endereço adicional
    public void fillAddress2(String address){
        getDriver().findElement(address2).sendKeys(address);
    }
    //preencher estado
    public void fillState(String state){
        getDriver().findElement(state_field).sendKeys(state);
    }
    //preencher cidade
    public void fillCity(String city){
        getDriver().findElement(city_field).sendKeys(city);
    }
    //preencher cep
    public void fillZipCode(String zipcode){
        getDriver().findElement(zipcode_field).sendKeys(zipcode);
    }
    //preencher numero de telefone
    public void fillMobileNumber(String number){
        getDriver().findElement(mobile_number).sendKeys(number);
    }
    //selecionar data de nascimento
    public void selecionaAniversario(Integer day, Integer month, String year){
        Select select_day = new Select(getDriver().findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_month_field));
        select_month.selectByIndex(month);

        Select select_year = new Select(getDriver().findElement(select_year_field));
        select_year.selectByValue(year);
    }

    //selecionar país
    public void selectCountry(String country) {
        Select select_country = new Select(getDriver().findElement(country_field));
        select_country.selectByValue(country);
    }

    //clicar em submit
    public void submit() {
        getDriver().findElement(submit_button).click();
    }

    //verificar cadastro com sucesso
    public void checkRegistrationSuccess(){
        Utils.waitElementBePresent(cadastro_sucesso,20);
        Assert.assertEquals("ACCOUNT CREATED!",getDriver().findElement(cadastro_sucesso).getText());
    }
}
