package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/", glue = "Steps", tags = "@tag1",monochrome = true,dryRun = false

		)

public class Executar{
	
}