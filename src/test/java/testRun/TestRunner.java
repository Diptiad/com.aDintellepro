package testRun;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"login.feature"},
        glue={"stepDefinition"},
        plugin= {"pretty","json:target/json-report/cucumber.json"},
        //dryRun=true,
        monochrome=true,
        tags=("@p12")
      )

public class TestRunner {
}