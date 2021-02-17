package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
	@CucumberOptions(features="src/test/resources/Features/demo.feature",	//path of the feature file
glue={"StepDefinition"} ,		//path of the step defination file

plugin = {"pretty", "html:test-output" },
		dryRun=false,
		monochrome=true //display the console output in a proper readble format
)


public class TestRunner {

}









