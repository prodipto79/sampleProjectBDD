package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.TextContext;

public class OfferPagePO {

    By Search = By.xpath(".//input[@id='search-field']");
    By product = By.xpath(".//table[@class='table table-bordered']//td[1]");
    WebDriver driver;

    public OfferPagePO(WebDriver driver){
        this.driver = driver;
    }



    public void searchItem(String shortName){
        driver.findElement(Search).sendKeys(shortName);
    }

    public String ExtractProduct(){
        return driver.findElement(product).getText().trim();
    }

}
