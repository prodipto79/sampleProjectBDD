package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public WebDriver driver;

    public WebDriver webDriverManager() throws InterruptedException, IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//files//global.properties");
        Properties prop = new Properties();

        prop.load(fis);

        if(driver==null){
            if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get(prop.getProperty("QAURL"));
            Thread.sleep(2000);

        }

        return driver;
    }

}
