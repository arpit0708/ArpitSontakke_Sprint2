package MyRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features={"./src/test/java/features"},
	glue = "stepdefinition"
	
)
public class MyRunner extends  AbstractTestNGCucumberTests {

	
}