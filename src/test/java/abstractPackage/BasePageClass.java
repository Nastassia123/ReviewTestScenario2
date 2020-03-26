package abstractPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePageClass extends APIClass {


    @Override
    public WebDriver getDriver() {
        return driver;
    }


    public WebDriver initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }


    @BeforeClass
    public void setUp() {
        initializeDriver();
    }

    @AfterClass
    public void closeDown() {
        delay(2000);
        driver.quit();
    }
}