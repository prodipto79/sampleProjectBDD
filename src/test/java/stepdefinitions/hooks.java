package stepdefinitions;

import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.TextContext;

import java.io.File;
import java.io.IOException;

public class hooks {
    public TextContext textContext;
    public WebDriver driver;
    public hooks(TextContext textContext) throws IOException, InterruptedException {
        this.textContext = textContext;
        this.driver = textContext.testBase.webDriverManager();
    }

    @Before("@netbanking")
    public void netbankingDB(){
        System.out.println("*********************");
        System.out.println(" set up for net banking ");
    }
    @Before("@mortgage")
    public void mortgage(){
        System.out.println("#################");
        System.out.println(" set up for mortgage ");
    }

    @After
    public void clearscenarios() throws IOException, InterruptedException {
        System.out.println(" Clear all test related data for each scenarios  ");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        //driver = textContext.testBase.webDriverManager();
        driver.quit();

    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println(" ***** Now Started  ****** ");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println(" ***** Now Ended   ****** ");
    }

    @AfterStep
    public  void addScreenshot(Scenario scenario) throws IOException {

        if(scenario.isFailed()){
           File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(source);
            scenario.attach(fileContent,"image/png","failedImage");
        }
    }
}
