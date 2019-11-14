package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeatSelection extends BasePage{


    public SeatSelection(WebDriver driver) {
        super(driver);
    }


    By WaitElement=By.xpath("//div[@class='privacy-policy-footer']");
    By chooseAvailableSeat=By.xpath("//div[@data-seat-type=\"1\"][1]/following::div[@data-seat-type=\"1\"][1]");
    By PayButton=By.xpath("//a[@id='btmcntbook']");

   //wait for page to load
    public SeatSelection waitForPageToLoad (){
        waitVisibility(WaitElement);
        return this;
    }

    //select two seats
    public SeatSelection ChooseAvailableSeat () throws InterruptedException {
        Thread.sleep(2000);
        click(chooseAvailableSeat);
        return this;
    }

    //click on pay button
    public SeatSelection ClickPayButton ()throws InterruptedException {
        Thread.sleep(2000);
        click(PayButton);
        return this;
    }








}