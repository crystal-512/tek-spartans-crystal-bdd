package tek.bdd.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature", // Directory for Feature file
        glue = "tek.bdd.steps",//Package for all the steps
        dryRun = false,
        tags = "@UsingList",
        plugin = {
                "html:target/cucumber_report/index.html"
        }
)
public class TestRunner {
}

//Running multiple tags => tags = "@Smoke or @Regression"
