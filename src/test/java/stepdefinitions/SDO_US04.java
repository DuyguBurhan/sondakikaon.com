package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.NewsDetailsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class SDO_US04 {

    HomePage homePage = new HomePage();
    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();
    Actions action = new Actions(Driver.getDriver());
    String enteredDate = "30102022";
    String enteredWords = "trafik kazası";

    @Given(":Clicks the Search Button")
    public void clicks_the_search_button() {
        homePage.searchButtonHomePage.click();
    }

    @Given(":Writes the day, month, year in the Tarihe Gore Arama section")
    public void writes_the_day_month_year_in_the_tarihe_gore_arama_section() {
        newsDetailsPage.tariheGoreAramaInputBox.sendKeys(enteredDate); //Tarihe göre arama input'una 30102022 yazar
        ReusableMethods.bekle(1);
    }

    @Given(":Clicks the Arsiv Getir button")
    public void clicks_the_arsiv_getir_button() {
        newsDetailsPage.arsivGetirButton.click();
    }

    @Given(":Verifies redirected to the news archive with entered date")
    public void verifies_redirected_to_the_news_archive_with_entered_date() {
        newsDetailsPage.searchResultNewsTitle1.click(); // tarih ile arama sonucu arsivden gelen ilk habere tiklar
        ReusableMethods.bekle(1);
        action.keyDown(Keys.CONTROL).sendKeys(newsDetailsPage.dateOfArchiveNews).build().perform();
        ReusableMethods.bekle(1);
        String returnDate = newsDetailsPage.dateOfArchiveNews.getText(); // arsivden gelen ilk haberin tarihini alir
        //System.out.println(returnDate);
        String finalDate = returnDate.replace(".", "");
        //System.out.println(finalDate);
        Assert.assertTrue(finalDate.contains(enteredDate));// haberin tarihi ile girilen tarihi karsilastirir
    }

    @Given(":Enters a word in Kelimeye Gore Arama text box")
    public void enters_a_word_in_kelimeye_gore_arama_text_box() {
        newsDetailsPage.kelimeyeGoreAramaInputBox.sendKeys(enteredWords);
        ReusableMethods.bekle(1);
    }

    @Given(":Clicks on Haberlerde Ara button")
    public void clicks_on_haberlerde_ara_button() {
        newsDetailsPage.haberlerdeAraButton.click();
    }

    @Given(":Verifies redirection to the news archive with entered words")
    public void verifies_redirection_to_the_news_archive_with_entered_words() {
        action.keyDown(Keys.CONTROL).sendKeys(newsDetailsPage.searchResultNewsTitle2).build().perform();
        newsDetailsPage.searchResultNewsTitle2.click(); // tarih ile arama sonucu arsivden gelen  ilk habere tiklar
        ReusableMethods.bekle(1);
        String title = newsDetailsPage.searchResultNewsTitle2.getText();//arsivden gelen haberin basligini alir
        //System.out.println(title);
        Assert.assertTrue(title.contains(enteredWords));// haberin basligi ile girilen kelimeleri karsilastirir
    }
}
