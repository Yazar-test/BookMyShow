package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.
        System.setProperty("webdriver.chrome.driver", "C:\\chrome-driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void teardown () {
       driver.quit();
    }
}
