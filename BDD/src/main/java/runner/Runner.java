package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="FeaturesFile/Orange.feature",
		glue="stepdefinations",dryRun=false
		
		)

public class Runner extends AbstractTestNGCucumberTests {

}
