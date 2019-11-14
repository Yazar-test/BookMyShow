package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage (WebDriver driver) {
        super(driver);
    }


    String baseURL = "https://in.bookmyshow.com/coimbatore";

    By FamousMovie= By.xpath("//div[@data-slick-index=\"0\" and @data-event-type=\"MT\"]");
    By getUpdatesButton=By.xpath("//*[@class=\"No thanks\"]");
    By SelectTime = By.xpath("//li[@data-is-down=\"false\" and @data-offline=\"false\" and @data-has-mticket=\"true\"][1]//a[@data-showtime-filter-index=\"evening\"]");


    //Go to Homepage
    public HomePage goToBookMyTicket (){
        driver.get(baseURL);
        return this;
    }

    //Click on dont get updates button
    public HomePage clickDontGetUpdates (){
        click(getUpdatesButton);
        return  this;
    }

    //Click on current famous movie
    public HomePage clickFamousMovie (){
        click(FamousMovie);
        return  this;
    }


    //Wait for page to load
    public HomePage waitForPageToLoad (){
        waitVisibility(FamousMovie);
        return this;
    }

}
