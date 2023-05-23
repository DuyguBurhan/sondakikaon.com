package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;


public class SDO_US02 {

    HomePage homePage = new HomePage();
    Actions action = new Actions(Driver.getDriver());
    String ilkSayfaHandle = Driver.getDriver().getWindowHandle();


    @Given(":Clicks on the latest news logo")
    public void clicks_on_the_latest_news_logo() {
        homePage.balikesirGuncelMenuHeader.click(); // logoya tiklandiginde balikesir haber detayi gorunmemeli
        ReusableMethods.bekle(3);
        homePage.logo.click();
    }

    @Given(":Confirms redirection to the homepage")
    public void confirms_redirection_to_the_homepage() {
        String homepageURL = Driver.getDriver().getCurrentUrl();
        ReusableMethods.bekle(2);
        String expectedURL = "https://www.sondakikaon.com/";
        Assert.assertEquals(expectedURL, homepageURL); // logoya tiklandiginda anasayfaya donuyor
    }

    @Given(":Scrolls to end of page")
    public void scrolls_to_end_of_page() {
        action.keyDown(Keys.CONTROL).sendKeys(homePage.facebookIkonuHomePageFooter).build().perform();
    }

    @Given(":Clicks on Facebook icon")
    public void clicks_on_facebook_icon() {
        homePage.facebookIkonuHomePageFooter.click();
    }

    @Given(":Verifies redirection to Facebook Page")
    public void verifies_redirection_to_facebook_page() {
        Driver.getDriver().switchTo().window(ilkSayfaHandle);
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        String facebookPageHandle = "";
        for (String each : windowHandleSeti) {
            if (!each.equals(ilkSayfaHandle)) {
                facebookPageHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(facebookPageHandle); // yeni tab'da Facebook sayfasina gecer
        String expectedURL = "https://www.facebook.com/sondakikaoncom/";
        String actualURL = Driver.getDriver().getCurrentUrl(); // facebook URL'ini alir
        Assert.assertEquals(expectedURL, actualURL); // dogrulama yapar
    }

    @Given(":Clicks on Instagram icon")
    public void clicks_on_instagram_icon() {
        Driver.getDriver().switchTo().window(ilkSayfaHandle); // anasayfaya geri doner
        ReusableMethods.bekle(3);
        homePage.instagramIkonuHomePageFooter.click(); // instagram ikonuna tiklar
    }

    @Given(":Verifies redirection to Instagram Page")
    public void verifies_redirection_to_instagram_page() {
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        String instagramPageHandle = "";
        for (String each : windowHandleSeti) {
            if (!each.equals(ilkSayfaHandle)) {
                instagramPageHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(instagramPageHandle); // yeni tab'da instagram sayfasina gecer
        String expectedURL = "https://www.instagram.com/sondakikaon/";
        String actualURL = Driver.getDriver().getCurrentUrl(); // instagram sayfa URL'ini alir
        Assert.assertEquals(expectedURL, actualURL); // dugrulama yapar
    }


    @Given(":Clicks on Twitter icon")
    public void clicks_on_twitter_icon() {
        Driver.getDriver().switchTo().window(ilkSayfaHandle); // anasayfaya geri doner
        ReusableMethods.bekle(3);
        homePage.twitterIkonuHomePageFooter.click(); // twitter ikonuna tiklar
    }

    @Given(":Verifies redirection to Twitter Page")
    public void verifies_redirection_to_twitter_pag() {
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        String twitterPageHandle = "";
        for (String each : windowHandleSeti) {
            if (!each.equals(ilkSayfaHandle)) {
                twitterPageHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(twitterPageHandle); //  Yeni Tab'da twitter sayfasina gecer
        String expectedURL = "https://twitter.com/sondakikaon/";
        String actualURL = Driver.getDriver().getCurrentUrl(); // twitter sayfa URL'ini alir
        Assert.assertEquals(expectedURL, actualURL); // dugrulama yapar
    }

    @Given(":Scrolls to footer")
    public void scrolls_to_footer() {
        action.keyDown(Keys.CONTROL).sendKeys(homePage.youtubeIkonuHomePageFooter).build().perform();
    }

    @Given(":Clicks on Youtube icon")
    public void clicks_on_youtube_icon() {
        homePage.youtubeIkonuHomePageFooter.click();
        ReusableMethods.bekle(3);
    }

    @Given(":Verifies redirection to Youtube Page")
    public void verifies_redirection_to_youtube_page() {
        Driver.getDriver().switchTo().window(ilkSayfaHandle);
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        String youtubePageHandle = "";
        for (String each : windowHandleSeti) {
            if (!each.equals(ilkSayfaHandle)) {
                youtubePageHandle = each;
            }
        }
        Driver.getDriver().switchTo().window(youtubePageHandle); // yeni tab'da Youtube sayfasina gecer
        String expectedURL = "https://www.youtube.com/channel/";
        String actualURL = Driver.getDriver().getCurrentUrl(); // Youtube URL'ini alir
        Assert.assertTrue(actualURL.contains(expectedURL)); // dogrulama yapar
    }

    @Given(":Clicks on RSS icon")
    public void clicks_on_rss_icon() {
        ReusableMethods.bekle(5);
        Driver.getDriver().switchTo().window(ilkSayfaHandle); // anasayfaya geri doner
        ReusableMethods.bekle(15);
        homePage.RSSikonuHomePageFooter.click(); // sondakikaon(RSS) ikonuna tiklar
        ReusableMethods.bekle(5);
    }

    @Given(":Verifies redirection to RSS Page")
    public void verifies_redirection_to_rss_page() {
        Driver.getDriver().switchTo().window(ilkSayfaHandle);
        Set<String> windowHandleSeti = Driver.getDriver().getWindowHandles();
        String RSSpageHandle = "";
        for (String each : windowHandleSeti) {
            if (!each.equals(ilkSayfaHandle)) {
                RSSpageHandle = each;
            }
        }
        String expectedURL = "https://www.sondakikaon.com/rss/anasayfa/";
        String actualURL = Driver.getDriver().getCurrentUrl(); // RSS sayfa URL'ini alir
        Assert.assertEquals(expectedURL, actualURL); // dugrulama yapar
    }

    @Given(":Clicks on Cookie Policy")
    public void clicks_on_cookie_policy() {
        homePage.cerezPolitikasiFooter.click();
    }

    @Given(":Verifies that you have been redirected to the Cookie Policy page")
    public void verifies_that_you_have_been_redirected_to_the_cookie_policy_page() {
        Assert.assertTrue(homePage.cookieTextCookiePage.isDisplayed());
    }

    @Given(":Clicks on Media Internet in the Brand Band")
    public void clicks_on_media_internet_in_the_brand_band() {
        homePage.medyaInternetButtonBrandBand.click();
    }

    @Given(":Verifies being redirected to the Media Internet page")
    public void verifies_being_redirected_to_the_media_internet_page() {
        Assert.assertTrue(homePage.medyainternetLogo.isDisplayed());
    }
}

