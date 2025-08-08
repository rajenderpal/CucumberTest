package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/resources/featureFiles",
	    glue = "stepDefinations",
	    plugin = {"pretty", "html:target/cucumber-reports"},
	    monochrome = true
	)
public class TestRunner {
    // No code inside - just used to run Cucumber with the specified options
}
