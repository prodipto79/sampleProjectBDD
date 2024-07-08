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
import pageObjects.OfferPagePO;
import pageObjects.PageObjectManager;
import utilities.TextContext;

import java.time.Duration;
import java.util.Set;

public class OfferPageSetpDef {

   public WebDriver driver;
   public String productName="";
    TextContext textContext;
    LandingPagePO landingPagePO;
    OfferPagePO offerPagePO;
    PageObjectManager pageObjectManager;
    public OfferPageSetpDef(TextContext textContext){

       this.textContext =  textContext;
       this.productName = textContext.productName;
    }

    @Then("^user searched for (.+) shortname in offer page to check if product exist$")
    public void userSearchedForShortnameInOfferPageToCheckIfProductExist(String prodName) throws InterruptedException {

        navigateDeal();
        textContext.genericUtils.switchtoChildWindow();
        offerPagePO = textContext.pageObjectManager.getOfferPagePO();
        offerPagePO.searchItem(prodName);
        Thread.sleep(5000);
        String expectedString = offerPagePO.ExtractProduct();
        Assert.assertEquals(productName,expectedString,"Both Strings are equal");
    }

    public void navigateDeal() throws InterruptedException
    {
        landingPagePO = textContext.pageObjectManager.getLangingPageObject();
        landingPagePO.landingOferrPage();
        Thread.sleep(2000);

    }


}
