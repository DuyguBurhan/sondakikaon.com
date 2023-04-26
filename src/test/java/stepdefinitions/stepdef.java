package stepdefinitions;

import io.cucumber.java.en.Then;
import utilities.Driver;

public class stepdef {

    @Then(": User closes the page")
    public void user_closes_the_page() {
        Driver.quitDriver();
    }
}
