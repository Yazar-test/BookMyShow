package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovieDetails extends BasePage{


    public MovieDetails(WebDriver driver) {
        super(driver);
    }

    By BookTicketButton=By.xpath("//a[@class='showtimes btn _cuatro']");
    By WaitElement=By.xpath("//a[@class='offer-card-wrapper'][3]");


    //click book ticket in movie details page
    public MovieDetails clickBookTicket (){
        click(BookTicketButton);
        return this;
    }

    public MovieDetails waitForPageToLoad (){
        waitVisibility(WaitElement);
        return this;
    }








}