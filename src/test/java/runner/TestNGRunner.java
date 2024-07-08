package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features",
                 glue = "stepdefinitions",
                 monochrome = true,
                 plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
                         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                 "rerun:target/failedscenarios.txt"},
                 tags="@test",
                 dryRun = false

                    )
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
