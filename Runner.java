package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"./Features/Signup.feature"},
		glue= {"stepDefiniton","Hook"},
		dryRun = false,
		publish=true,
		plugin= {"pretty","html:./target/cucumberReport/cucumberreport.html"}
		)

public class Runner extends AbstractTestNGCucumberTests{

}
