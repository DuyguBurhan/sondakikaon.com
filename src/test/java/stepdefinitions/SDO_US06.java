package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.NewsDetailsPage;
import utilities.ReusableMethods;

import java.util.List;

public class SDO_US06 {
    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();

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
}
