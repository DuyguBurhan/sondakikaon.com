package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.NewsDetailsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SDO_US05 {

    HomePage homePage = new HomePage();
    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();
    Actions action = new Actions(Driver.getDriver());

    @Given(":Clicks on first news on the Headline Slider")
    public void clicks_on_first_news_on_the_headline_slider() {
        homePage.mansetSliderHeadLineNews1.click();
    }

    @Given(":Verifies that it is redirected to the news detail")
    public void verifies_that_it_is_redirected_to_the_news_detail() {
        action.keyDown(Keys.CONTROL).sendKeys(newsDetailsPage.dateOfNewsOnHeadlineSlider).build().perform();
        ReusableMethods.bekle(1);
        String returnDate = newsDetailsPage.dateOfNewsOnHeadlineSlider.getText(); //acilan haberin tarihini alir
        //System.out.println(returnDate);
        String finalDate = returnDate.replace(".", "/");
        System.out.println("news date: " + finalDate);
        LocalDate now = LocalDate.now(); // bugünün tarihini aalir
        String todaysdate = DateTimeFormatter.ofPattern("dd/MM/yyyy").format(now);
        System.out.println("today : " + todaysdate);

        Assert.assertTrue(finalDate.contains(todaysdate));// haberin tarihi ile bugünün tarihini karsilastirir
    }
}
