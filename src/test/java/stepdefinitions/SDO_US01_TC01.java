package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SDO_US01_TC01 {

    homePage homePage = new homePage();

    @Given(":Kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.bekle(1);
        homePage.cookieAccept.click();
        homePage.bildiritHayir.click();
        ReusableMethods.bekle(1);
    }

    @Given(":sondakikaon logosunun gorunur oldugunu dogrular")
    public void sondakikaon_logosunun_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.logo.isDisplayed());
    }

    @Then(":Sayfayi kapatir")
    public void sayfayi_kapatir() {
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
        Assert.assertTrue(homePage.aramaButonuHomePage.isDisplayed());
    }

    @Given(":sondakika Bandinin gorunur oldugunu dogrular")
    public void sondakika_bandinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.sonDakikaBandiHomePage.isDisplayed());
    }

    @Given(":Sayfayi kaydirir")
    public void sayfayi_kaydirir() {
        Actions action = new Actions(Driver.getDriver());
        action.keyDown(Keys.CONTROL).sendKeys(homePage.mansetSliderNumaraButtonlari).build().perform();
    }

    @Given(":Manset Slider'inin gorunur oldugunu dogrular")
    public void manset_slider_inin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(homePage.mansetSliderHeadLineNews1.isDisplayed());
    }
}
