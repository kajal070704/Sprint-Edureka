package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="StepDefination",
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				plugin={"html:target/cucumber.html"}
		)

public class FileRunner {

}
