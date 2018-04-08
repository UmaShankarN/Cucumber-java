package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue = "stepDefinition")//, plugin={"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt","junit:target/cucumberresults.xml","usage:target/cucumber-usage.json"}) //plugin = "com.cucumber.listener.ExtentCucumberFormatter:output/report.html")
public class TestRunner {

}