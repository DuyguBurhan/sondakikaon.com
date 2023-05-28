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
        int listNumber = list.size() - 20; //sonraki haber butonu için listein ilk elemanindan baslar/1.siradaki haber

        switch (listNumber) {
            case 0:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                //Numara listesinde 1 numaranin aktif oldugunu dogrular
                //aktif olan numaranin path'i "activeNumbersOfHeadlineSlider"a donusuyor,her yerde bu locate dogrulandi
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                //sonraki haber butonuna tiklar
                ReusableMethods.bekle(1);
            case 1:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 2:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 3:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 4:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 5:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 6:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 7:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 8:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 9:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 10:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 11:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 12:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 13:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 14:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 15:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 16:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 17:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 18:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 19:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.nextHeadlineButton.click();
                ReusableMethods.bekle(1);
                break;
            default:
                System.out.println("Hata : Slider'daki butun numaralara gidilemedi");
        }
    }


    @Given(":Clicks the previous news button and confirms that the Numbers have changed")
    public void clicks_the_previous_news_button_and_confirms_that_the_numbers_have_changed() {
        List<WebElement> list = newsDetailsPage.numbersOfHeadlineSlider;
        int listNumber = list.size() - 1; //onceki haber butonu için listenin son elemanindan baslar/20.siradaki haber

        switch (listNumber) {
            case 19:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                //Numara listesinde 20 numaranin aktif oldugunu dogrular
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                //onceki haber butonuna tiklar
                ReusableMethods.bekle(1);
            case 18:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 17:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 16:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 15:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 14:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 13:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 12:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 11:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 10:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 9:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 8:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 7:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 6:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 5:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 4:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 3:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 2:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 1:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
            case 0:
                Assert.assertTrue(newsDetailsPage.activeNumbersOfHeadlineSlider.isDisplayed());
                listNumber++;
                newsDetailsPage.previousHeadlineButton.click();
                ReusableMethods.bekle(1);
                break;
            default:
                System.out.println("Hata : Slider'daki butun numaralara gidilemedi");
        }
    }
}
