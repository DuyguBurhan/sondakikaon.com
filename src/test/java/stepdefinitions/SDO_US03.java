package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.NewsDetailsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class SDO_US03 {

    HomePage homePage = new HomePage();
    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();
    Actions action = new Actions(Driver.getDriver());


    @Given(":Clicks on Mega Menu Button")
    public void clicks_on_mega_menu_button() {
        homePage.dropMenuButton.click();
    }

    @Given(":Verifies that the Balikesir Guncel  header appears")
    public void verifies_that_the_balikesir_guncel_header_appears() {
        Assert.assertTrue(newsDetailsPage.balikesirGuncelHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Asayis header appears")
    public void verifies_that_the_asayis_header_appears() {
        Assert.assertTrue(newsDetailsPage.asayisHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Ekonomi header appears")
    public void verifies_that_the_ekonomi_header_appears() {
        Assert.assertTrue(newsDetailsPage.ekonomiHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Spor header appears")
    public void verifies_that_the_spor_header_appears() {
        Assert.assertTrue(newsDetailsPage.sporHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Saglik header appears")
    public void verifies_that_the_saglik_header_appears() {
        Assert.assertTrue(newsDetailsPage.saglikHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Egitim header appears")
    public void verifies_that_the_egitim_header_appears() {
        Assert.assertTrue(newsDetailsPage.egitimHeaderInConteiner.isDisplayed());
    }

    @Given(":Clicks on Balikesir Guncel Headline")
    public void clicks_on_balikesir_guncel_headline() {
        newsDetailsPage.balikesirGuncelHeaderInConteiner.click();
    }

    @Given(":Verifies that the details of Balikesir Guncel News have been reached")
    public void verifies_that_the_details_of_balikesir_guncel_news_have_been_reached() {
        Assert.assertTrue(newsDetailsPage.balikesirGuncelHeader.isDisplayed());
    }

    @Given(":Verifies that the Ayvalik Haberleri header appears")
    public void verifies_that_the_ayvalik_haberleri_header_appears() {
        Assert.assertTrue(newsDetailsPage.ayvalikHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Edremit Haberleri header appears")
    public void verifies_that_the_edremit_haberleri_header_appears() {
        Assert.assertTrue(newsDetailsPage.edremitHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Bandirma Haberleri header appears")
    public void verifies_that_the_bandirma_haberleri_header_appears() {
        Assert.assertTrue(newsDetailsPage.bandirmaHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Burhaniye Haberleri header appears")
    public void verifies_that_the_burhaniye_haberleri_header_appears() {
        Assert.assertTrue(newsDetailsPage.burhaniyeHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Susurluk Haberleri header appears")
    public void verifies_that_the_susurluk_haberleri_header_appears() {
        Assert.assertTrue(newsDetailsPage.susurlukHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Erdek Haberleri header appears")
    public void verifies_that_the_erdek_haberleri_header_appears() {
        Assert.assertTrue(newsDetailsPage.erdekHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Clicks on Erdek Haberleri Headline")
    public void clicks_on_erdek_haberleri_headline() {
        Assert.assertTrue(newsDetailsPage.erdekHaberleriHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the details of Erdek Haberleri News have been reached")
    public void verifies_that_the_details_of_erdek_haberleri_news_have_been_reached() {
        newsDetailsPage.erdekHaberleriHeaderInConteiner.click();
        Assert.assertTrue(newsDetailsPage.erdekHeader.isDisplayed());
    }

    @Given(":Verifies that the Bursa Haber header appears")
    public void verifies_that_the_bursa_haber_header_appears() {
        Assert.assertTrue(newsDetailsPage.bursaHaberHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Izmir Haber header appears")
    public void verifies_that_the_izmir_haber_header_appears() {
        Assert.assertTrue(newsDetailsPage.izmirHaberHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Canakkale Haber header appears")
    public void verifies_that_the_canakkale_haber_header_appears() {
        Assert.assertTrue(newsDetailsPage.canakkaleHaberHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Manisa Haber header appears")
    public void verifies_that_the_manisa_haber_header_appears() {
        Assert.assertTrue(newsDetailsPage.manisaHaberHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Kutahya Haber header appears")
    public void verifies_that_the_kutahya_haber_header_appears() {
        Assert.assertTrue(newsDetailsPage.kutahyaHaberHeaderInConteiner.isDisplayed());
    }

    @Given(":Verifies that the Aydin Haber header appears")
    public void verifies_that_the_aydin_haber_header_appears() {
        Assert.assertTrue(newsDetailsPage.aydinHaberHeaderInConteiner.isDisplayed());
    }

    @Given(":Clicks on Canakkale Haber Headline")
    public void clicks_on_aydin_haber_headline() {
        newsDetailsPage.canakkaleHaberHeaderInConteiner.click();
        ReusableMethods.bekle(3);
    }

    @Given(":Verifies that the details of Aydin Haber News have been reached")
    public void verifies_that_the_details_of_aydin_haber_news_have_been_reached() {
        Assert.assertTrue(newsDetailsPage.canakkaleHeader.isDisplayed());
    }
}
