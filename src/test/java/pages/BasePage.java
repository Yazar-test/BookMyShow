package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,25);
    }

    public void waitVisibility(By elementBy) {

        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }


    public String readText (By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }


    public void assertEquals (By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);

    }
}
