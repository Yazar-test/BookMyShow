package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.MovieDetails;
import pages.SeatSelection;
import pages.TheaterAndTimeSelection;

public class BookTicketTest extends BaseTest {
    @Test (priority = 0)
    public void book_a_ticket() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        SeatSelection seatSelection = new SeatSelection(driver);
        MovieDetails movieDetails = new MovieDetails(driver);
        TheaterAndTimeSelection theaterAndTimeSelection = new TheaterAndTimeSelection(driver);

        homePage.goToBookMyTicket()
                .clickDontGetUpdates()
                .waitForPageToLoad()
                .clickFamousMovie();

        movieDetails.waitForPageToLoad()
                .clickBookTicket();

        theaterAndTimeSelection.waitForPageToLoad()
                .clickAvailableEveningTiming()
                .AcceptTerms()
                .SelectNumberOfSeats();

        seatSelection.waitForPageToLoad()
                 .ChooseAvailableSeat()
                 .ClickPayButton();



    }


}