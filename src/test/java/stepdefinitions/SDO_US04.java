package stepdefinitions;

import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.NewsDetailsPage;
import utilities.Driver;

public class SDO_US04 {

    HomePage homePage = new HomePage();
    NewsDetailsPage newsDetailsPage = new NewsDetailsPage();
    Actions action = new Actions(Driver.getDriver());

}
