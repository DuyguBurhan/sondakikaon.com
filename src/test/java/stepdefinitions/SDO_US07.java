package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.NewsDetailsPage;
import utilities.Driver;

public class SDO_US07 {

    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();
    HomePage homePage = new HomePage();
    Actions action = new Actions(Driver.getDriver());
    String expectedTitle = "";


    @Given(":Clicks on the image of the banner")
    public void clicks_on_the_image_of_the_banner() {
        expectedTitle = (newsDetailsPage.titleOfFirstBannerNews).getText();
        System.out.println("expected title : " + expectedTitle);
        newsDetailsPage.pictureOfFirstBannerNews.click();
    }


    @Given(":Verifies that it is directed to the detail of the Banner news")
    public void verifies_that_it_is_directed_to_the_detail_of_the_banner_news() {
        action.keyDown(Keys.CONTROL).sendKeys(newsDetailsPage.detailOfFirstBannerNews).build().perform();
        String actualTitle = newsDetailsPage.detailOfFirstBannerNews.getText();
        System.out.println("actual title : " + actualTitle);
        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }
}
