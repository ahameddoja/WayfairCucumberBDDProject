package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",  //loginAndProductCheckOutBONUS.feature
        glue = {"step_definitions"},
        plugin = {"pretty", "summary"},
//      plugin = {"pretty", "summary", "html:target/CucumberReports/reports.html"},
        publish = true,
        dryRun = false
//      tags = "@positive_test or @negative_test"

)
public class TestRunner {
}
