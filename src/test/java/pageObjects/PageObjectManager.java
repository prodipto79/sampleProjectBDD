package pageObjects;

import org.openqa.selenium.WebDriver;
import utilities.TextContext;

public class PageObjectManager {
   public WebDriver driver;
   public LandingPagePO landingPagePO;
   public  OfferPagePO offerPagePO;


    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public LandingPagePO getLangingPageObject(){
        return landingPagePO = new LandingPagePO(driver);
    }

    public OfferPagePO getOfferPagePO(){
        return offerPagePO= new OfferPagePO(driver);
    }


}
