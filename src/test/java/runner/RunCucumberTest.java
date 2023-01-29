package runner;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;



@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json","html:target/reports"},
        features = "src/test/resources/features",
        tags = {"@cadastro-sucesso, @enviar-mensagem-sucesso"},
        glue = {"steps"}
)

public class RunCucumberTest extends RunBase{
    @AfterClass
    public static void Stop(){  driver.quit();    }

}
