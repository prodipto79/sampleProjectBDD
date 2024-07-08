package utilities;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TextContext {
    public WebDriver driver;
    public String productName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TextContext() throws InterruptedException, IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.webDriverManager()) ;
        genericUtils = new GenericUtils(testBase.webDriverManager());
    }
}
