package runners; 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber-report", "json:target/cucumber-report/cucumber.json"}, 
		features = "src\\test\\resources\\features\\", 
		glue = {"stepsFuncional" }, 
		//tags = {"@logarSistemaComSucesso, @licitacoesConcluidas"},
		monochrome = true, dryRun = false)

public class RunnerGenericoTest {

}
