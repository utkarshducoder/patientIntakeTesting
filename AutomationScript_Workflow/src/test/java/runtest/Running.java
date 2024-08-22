package runtest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//feature/Login.feature",
		glue = "step",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/report/report.html"}
		//C:\Users\UtkarshGupta\eclipse-workspace\AutomationScript_Workflow\feature\Login.feature
		)
public class Running extends AbstractTestNGCucumberTests{

}
