package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = "stepdefs",
        dryRun = true,
//        tags = "@login",
        plugin = {"pretty","html:target/report/cucumber-html-report.html", "json:target/report/cucumber.json"}

)
public class TestRunner {

}

