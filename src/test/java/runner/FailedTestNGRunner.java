package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "@target/failedscenarios.txt",
                 glue = "stepdefinitions",
                 monochrome = true,
                 plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
                         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                 "rerun:target/failedscenarios.txt"},
                 dryRun = false

                    )
public class FailedTestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
