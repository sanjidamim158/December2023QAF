package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	//where is out feature file
	features = "Features",
	//where our automation file is
	glue = "steps"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

	
}











