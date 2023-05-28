package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.NewsDetailsPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

public class SDO_US06 {
    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();
    HomePage homePage = new HomePage();
    Actions action = new Actions(Driver.getDriver());
    String expectedTitle = "";

    @Given(":Clicks the next news button and confirms that the Numbers have changed")
    public void clicks_the_next_news_button_and_confirms_that_the_Numbers_have_changed() {
        List<WebElement> list = newsDetailsPage.numbersOfHeadlineSlider;
        int listNumber = list.size() - 20; //listenin ilk elemanindan baslar/1.siradaki haber
        do {
            Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
            //Numara listesinde 1 numaranin aktif oldugunu dogrular
            //aktif olan numaranin path'i "activeNumbersOfHeadlineSlider"a donusuyor,her yerde bu locate dogrulandi
            listNumber++;
            newsDetailsPage.nextHeadlineButton.click();//sonraki haber butonuna tiklar
            ReusableMethods.bekle(1);
        } while (listNumber <= 19);
    }


    @Given(":Clicks the previous news button and confirms that the Numbers have changed")
    public void clicks_the_previous_news_button_and_confirms_that_the_numbers_have_changed() {
        List<WebElement> list = newsDetailsPage.numbersOfHeadlineSlider;
        int listNumber = list.size() - 1; //listenin son elemanindan baslar/20.siradaki haber
        do {
            Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
            //Numara listesinde 1 numaranin aktif oldugunu dogrular
            //aktif olan numaranin path'i "activeNumbersOfHeadlineSlider"a donusuyor,her yerde bu locate dogrulandi
            listNumber--;
            newsDetailsPage.previousHeadlineButton.click();//sonraki haber butonuna tiklar
            ReusableMethods.bekle(1);
        } while (listNumber >= 0);
    }

    @Given(":Clicks first number from Header Slider Numbers")
    public void clicks_first_number_from_header_slider_numbers() {
        expectedTitle = (homePage.mansetSliderHeadLineNews1).getText();
        System.out.println("expected title : " + expectedTitle);
        newsDetailsPage.numberOneOfHeadlineSlider.click();
    }

    @Given(":Verifies that it is directed to the detail of the first news")
    public void verifies_that_it_is_directed_to_the_detail_of_the_first_news() {
        String ilkSayfaHandle = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(ilkSayfaHandle);
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        String newPageNewsDetail = "";
        for (String each : windowHandleSeti) {
            if (!each.equals(ilkSayfaHandle)) {
                newPageNewsDetail = each;
            }
        }
        Driver.getDriver().switchTo().window(newPageNewsDetail);
        action.keyDown(Keys.CONTROL).sendKeys(newsDetailsPage.titleOfNewsOnNewPage).build().perform();
        String actualTitle = newsDetailsPage.titleOfNewsOnNewPage.getText();
        System.out.println("actual title : " + actualTitle);
        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }
}
