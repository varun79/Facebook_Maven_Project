package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"features"},
			glue= {"com.facebook.stepDefination"},
			tags= "@SignUpPage",
			
			monochrome = true, dryRun = false)

public class LoginTestRunner {

}
