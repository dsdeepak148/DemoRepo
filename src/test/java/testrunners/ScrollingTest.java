package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"stepdefinitions"},
		plugin = {"pretty", "html:target/HtmlReports", "summary"},
		monochrome = true,
		dryRun =  false
		
		)
public class ScrollingTest {

}
