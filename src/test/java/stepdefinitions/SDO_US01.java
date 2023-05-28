package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SDO_US01 {

    HomePage homePage = new HomePage();

    @Given(":User goes to {string} homepage")
    public void user_goes_to_homepage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given(":Accepts Cookie")
    public void accepts_cookie() {
        homePage.cookieAccept.click();
        ReusableMethods.bekle(1);
    }

    @Given(":Responds to notification sending request")
    public void responds_to_notification_sending_request() {
        homePage.cookieNo.click();
        ReusableMethods.bekle(1);
    }

    @Given(":sondakikaon logosunun gorunur oldugunu dogrular")
    public void sondakikaon_logosunun_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.logo.isDisplayed());
    }

    @Then(":Closes the page")
    public void closes_the_page() {
        Driver.quitDriver();
    }

    @Given(":Finansal Veriler bandinda Bist, Dolar, Euro ve Altın verilerinin gorundugunu dogrular")
    public void finansal_veriler_bandinda_bist_dolar_euro_ve_altın_verilerinin_gorundugunu_dogrular() {
        Assert.assertTrue(homePage.bist.isDisplayed());
        Assert.assertTrue(homePage.dolar.isDisplayed());
        Assert.assertTrue(homePage.euro.isDisplayed());
        Assert.assertTrue(homePage.altin.isDisplayed());
    }

    @Given(":Menu butonunun gorunur oldugunu dogrular")
    public void menu_butonunun_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.dropMenuButton.isDisplayed());
    }

    @Given(":Menu butonu yanindaki menu basliklarinin gorunur oldugunu dogrular")
    public void menu_butonu_yanindaki_menu_basliklarinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.balikesirGuncelMenuHeader.isDisplayed());
        Assert.assertTrue(homePage.asayisMenuHeader.isDisplayed());
        Assert.assertTrue(homePage.ekonomiMenuHeader.isDisplayed());
        Assert.assertTrue(homePage.sporMenuHeader.isDisplayed());
        Assert.assertTrue(homePage.saglikMenuHeader.isDisplayed());
        Assert.assertTrue(homePage.egitimMenuHeader.isDisplayed());
        Assert.assertTrue(homePage.bolgeHaberleriMenuHeader.isDisplayed());
    }

    @Given(":Arama butonunun gorunur oldugunu dogrular")
    public void arama_butonunun_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.searchButtonHomePage.isDisplayed());
    }

    @Given(":sondakika Bandinin gorunur oldugunu dogrular")
    public void sondakika_bandinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.sonDakikaBandiHomePage.isDisplayed());
    }

    @Given(":Scrolls the page")
    public void scrolls_the_page() {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys(homePage.mansetSliderNumaraButtonlari).build().perform();
    }

    @Given(":Manset Slider'inin gorunur oldugunu dogrular")
    public void manset_slider_inin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.mansetSliderHeadLineNews1.isDisplayed());
    }

    @Given(":Banner'in gorunur oldugunu dogrular")
    public void banner_in_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.bannerHomePage.isDisplayed());
    }

    @Given(":Ekonomi bolum basliginin gorunur oldugunu dogrular")
    public void ekonomi_bolum_basliginin_gorunur_oldugunu_dogrular() {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys(homePage.ekonomiBolumBasligi).build().perform();
        Assert.assertTrue(homePage.ekonomiBolumBasligi.isDisplayed());
    }

    @Given(":Saglik bolum basliginin gorunur oldugunu dogrular")
    public void saglik_bolum_basliginin_gorunur_oldugunu_dogrular() {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys(homePage.saglikBolumBasligi).build().perform();
        Assert.assertTrue(homePage.saglikBolumBasligi.isDisplayed());
    }

    @Given(":Yerel Haberler bolum basliginin gorunur oldugunu dogrular")
    public void yerel_haberler_bolum_basliginin_gorunur_oldugunu_dogrular() {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys(homePage.yerelHaberlerBolumBasligi).build().perform();
        Assert.assertTrue(homePage.yerelHaberlerBolumBasligi.isDisplayed());
    }

    @Given(":Sayfa sonuna scroll yapar")
    public void sayfa_sonuna_scroll_yapar() {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys(homePage.facebookIkonuHomePageFooter).build().perform();
    }

    @Given(":Sosyal Medya ikonlarinin gorunur oldugunu dogrular")
    public void sosyal_medya_ikonlarinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.facebookIkonuHomePageFooter.isDisplayed());
        Assert.assertTrue(homePage.twitterIkonuHomePageFooter.isDisplayed());
        Assert.assertTrue(homePage.instagramIkonuHomePageFooter.isDisplayed());
        Assert.assertTrue(homePage.youtubeIkonuHomePageFooter.isDisplayed());
        Assert.assertTrue(homePage.RSSikonuHomePageFooter.isDisplayed());
    }

    @Given(":Footer'in gorunur oldugunu dogrular")
    public void footer_in_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.footerHomePage.isDisplayed());
    }

    @Given(":Marka Bandi'nin gorunur oldugunu dogrular")
    public void marka_bandi_nin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.markaBandiHomePage.isDisplayed());
    }
}
