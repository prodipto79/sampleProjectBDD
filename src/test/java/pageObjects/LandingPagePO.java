package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.TextContext;

public class LandingPagePO {

    By search = By.xpath(".//input[@type='search']");
    By submitBtn = By.xpath(".//button[@type='submit']");
    By product = By.xpath(".//h4[@class='product-name']");
    By deal = By.xpath(".//a[text()='Top Deals']");
    WebDriver driver;

    public LandingPagePO(WebDriver driver){
       this.driver  = driver;
    }
    public void landingOferrPage(){
        driver.findElement(deal).click();
    }

    public void searchItems(String shortprodName){
        driver.findElement(search).sendKeys(shortprodName);
        driver.findElement(submitBtn).click();

    }
    public String getProductName(){
       return driver.findElement(product).getText();
    }
}
