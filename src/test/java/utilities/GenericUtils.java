package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class GenericUtils {

    public WebDriver driver;
    public GenericUtils(WebDriver driver){
        this.driver = driver;
    }

    public void switchtoChildWindow() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        for(String currWindow : allwindows){
            if(!currWindow.equalsIgnoreCase(parentWindow)){

                driver.switchTo().window(currWindow);
                Thread.sleep(5000);

            }
        }
    }
}
