package stepdefs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = {"stepdefs"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:target/reports"},
        tags = "@smoke"
)
public class TestRunner {
}
