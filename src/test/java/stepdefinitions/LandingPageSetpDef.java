package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LandingPagePO;
import pageObjects.PageObjectManager;
import utilities.TextContext;

import java.time.Duration;
import java.util.Set;

public class LandingPageSetpDef {

   public WebDriver driver;

   public String productName="";
   TextContext textContext;
   LandingPagePO landingPagePO;
   PageObjectManager pageObjectManager;
   public LandingPageSetpDef(TextContext textContext){
       this.textContext = textContext;
   }

    @Given("user landing on greenkart homepage")
    public void user_landing_on_greenkart_homepage() throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver","D:\\JavaBDD\\BDDExample\\Executable\\chromedriver.exe");



    }
    @When("^user searched with shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String product) throws InterruptedException {
        landingPagePO = textContext.pageObjectManager.getLangingPageObject();
        landingPagePO.searchItems(product);
        Thread.sleep(2000);
        productName = landingPagePO.getProductName().split("-")[0].trim();
        textContext.productName= productName;
    }

}
