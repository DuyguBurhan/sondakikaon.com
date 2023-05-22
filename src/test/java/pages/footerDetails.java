package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class footerDetails {

    public footerDetails() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "mt-4 w-full text-center lg:text-left")
    public WebElement menuContainerBalikesirHaber;

    @FindBy(xpath = "(//a[@class='w-fit h-auto'])[1]")
    public WebElement logo;

    @FindBy(xpath = "//div[@class='grid grid-cols-1 lg:grid-cols-2']")
    public WebElement balikesirGuncelHeader;
}
