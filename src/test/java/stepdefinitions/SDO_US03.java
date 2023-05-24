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
        try {
            Assert.assertTrue(newsDetailsPage.balikesirGuncelHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_balikesir_guncel_header_appears();

        }
    }

    @Given(":Verifies that the Asayis header appears")
    public void verifies_that_the_asayis_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.asayisHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_asayis_header_appears();
        }
    }

    @Given(":Verifies that the Ekonomi header appears")
    public void verifies_that_the_ekonomi_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.ekonomiHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_ekonomi_header_appears();
        }
    }

    @Given(":Verifies that the Spor header appears")
    public void verifies_that_the_spor_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.sporHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_spor_header_appears();
        }
    }

    @Given(":Verifies that the Saglik header appears")
    public void verifies_that_the_saglik_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.saglikHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_saglik_header_appears();
        }
    }

    @Given(":Verifies that the Egitim header appears")
    public void verifies_that_the_egitim_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.egitimHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_egitim_header_appears();
        }
    }

    @Given(":Clicks on Balikesir Guncel Headline")
    public void clicks_on_balikesir_guncel_headline() {

        try {
            newsDetailsPage.balikesirGuncelHeaderInConteiner.click();
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            clicks_on_balikesir_guncel_headline();
        }
    }

    @Given(":Verifies that the details of Balikesir Guncel News have been reached")
    public void verifies_that_the_details_of_balikesir_guncel_news_have_been_reached() {
        try {
            Assert.assertTrue(newsDetailsPage.balikesirGuncelHeader.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_details_of_balikesir_guncel_news_have_been_reached();
        }
    }

    @Given(":Verifies that the Ayvalik Haberleri header appears")
    public void verifies_that_the_ayvalik_haberleri_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.ayvalikHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_ayvalik_haberleri_header_appears();
        }
    }

    @Given(":Verifies that the Edremit Haberleri header appears")
    public void verifies_that_the_edremit_haberleri_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.edremitHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_edremit_haberleri_header_appears();
        }
    }

    @Given(":Verifies that the Bandirma Haberleri header appears")
    public void verifies_that_the_bandirma_haberleri_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.bandirmaHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_bandirma_haberleri_header_appears();
        }
    }

    @Given(":Verifies that the Burhaniye Haberleri header appears")
    public void verifies_that_the_burhaniye_haberleri_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.burhaniyeHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_burhaniye_haberleri_header_appears();
        }
    }

    @Given(":Verifies that the Susurluk Haberleri header appears")
    public void verifies_that_the_susurluk_haberleri_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.susurlukHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_susurluk_haberleri_header_appears();
        }
    }

    @Given(":Verifies that the Erdek Haberleri header appears")
    public void verifies_that_the_erdek_haberleri_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.erdekHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_erdek_haberleri_header_appears();
        }
    }

    @Given(":Clicks on Erdek Haberleri Headline")
    public void clicks_on_erdek_haberleri_headline() {
        try {
            Assert.assertTrue(newsDetailsPage.erdekHaberleriHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            clicks_on_erdek_haberleri_headline();
        }
    }

    @Given(":Verifies that the details of Erdek Haberleri News have been reached")
    public void verifies_that_the_details_of_erdek_haberleri_news_have_been_reached() {
        newsDetailsPage.erdekHaberleriHeaderInConteiner.click();
        try {
            Assert.assertTrue(newsDetailsPage.erdekHeader.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_details_of_erdek_haberleri_news_have_been_reached();
        }
    }

    @Given(":Verifies that the Bursa Haber header appears")
    public void verifies_that_the_bursa_haber_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.bursaHaberHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_bursa_haber_header_appears();
        }
    }

    @Given(":Verifies that the Izmir Haber header appears")
    public void verifies_that_the_izmir_haber_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.izmirHaberHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_izmir_haber_header_appears();
        }
    }

    @Given(":Verifies that the Canakkale Haber header appears")
    public void verifies_that_the_canakkale_haber_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.canakkaleHaberHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_canakkale_haber_header_appears();
        }
    }

    @Given(":Verifies that the Manisa Haber header appears")
    public void verifies_that_the_manisa_haber_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.manisaHaberHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_manisa_haber_header_appears();
        }
    }

    @Given(":Verifies that the Kutahya Haber header appears")
    public void verifies_that_the_kutahya_haber_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.kutahyaHaberHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_kutahya_haber_header_appears();
        }
    }

    @Given(":Verifies that the Aydin Haber header appears")
    public void verifies_that_the_aydin_haber_header_appears() {
        try {
            Assert.assertTrue(newsDetailsPage.aydinHaberHeaderInConteiner.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_aydin_haber_header_appears();
        }
    }

    @Given(":Clicks on Canakkale Haber Headline")
    public void clicks_on_aydin_haber_headline() {
        try {
            newsDetailsPage.canakkaleHaberHeaderInConteiner.click();
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            clicks_on_aydin_haber_headline();
        }
        ReusableMethods.bekle(3);
    }

    @Given(":Verifies that the details of Aydin Haber News have been reached")
    public void verifies_that_the_details_of_aydin_haber_news_have_been_reached() {
        try {
            Assert.assertTrue(newsDetailsPage.canakkaleHeader.isDisplayed());
        } catch (Exception e) {
            Driver.getDriver().navigate().refresh();
            verifies_that_the_details_of_aydin_haber_news_have_been_reached();
        }
    }
}
