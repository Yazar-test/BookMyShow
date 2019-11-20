package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TheaterAndTimeSelection extends BasePage{

    public TheaterAndTimeSelection(WebDriver driver) {
        super(driver);
    }

    By SelectTime = By.xpath("//li[@data-is-down=\"false\" and @data-offline=\"false\" and @data-has-mticket=\"true\"][1]//a[@data-showtime-filter-index=\"evening\"]");
    By WaitElement=By.xpath("//div[@class='privacy-policy-footer']");
    By termsAccept = By.xpath("//a[@id='btnPopupAccept']");
    By selectTwoSeats = By.xpath("//div[@id='proceed-Qty']");
    By tomorrowEvening = By.xpath("//a[contains(@href,'MT/tomorrow')]");
    By confirmBuyTicket =By.xpath("//a[@id='lnkMainBuyTickets']");
    By SelectTimeNight = By.xpath("//li[@data-is-down=\"false\" and @data-offline=\"false\" and @data-has-mticket=\"true\"][1]//a[@data-showtime-filter-index=\"night\"]");

    //wait for page to load
    public TheaterAndTimeSelection waitForPageToLoad (){
        waitVisibility(WaitElement);
        return this;
    }
    //check evening timing availability
    public TheaterAndTimeSelection clickAvailableEveningTiming () throws InterruptedException {
        waitVisibility(WaitElement);
        Thread.sleep(2000);
        Boolean isPresent = driver.findElements(SelectTime).size() > 0;
        Boolean isPresentNight = driver.findElements(SelectTimeNight).size() > 0;
        if(isPresent){
            Thread.sleep(2000);
            click(SelectTime);
        }
        else if (isPresentNight){
            Thread.sleep(2000);
            click(SelectTimeNight);
        }
        return this;
    }
    //Accept terms
    public TheaterAndTimeSelection AcceptTerms () throws InterruptedException {
        waitVisibility(WaitElement);
        Thread.sleep(2000);
        Boolean isPresentTicket = driver.findElements(confirmBuyTicket).size() > 0;
        if(isPresentTicket){
            click(confirmBuyTicket);
        }
        Thread.sleep(2000);
        click(termsAccept);

        return this;
    }
    //select number of seats to default two
    public TheaterAndTimeSelection SelectNumberOfSeats () throws InterruptedException {
        Thread.sleep(3000);
        click(selectTwoSeats);
        return this;
    }

}
