package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage {

    public homePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@class='col-span-4 flex flex-wrap items-center px-0']")
    public WebElement logo;

    @FindBy(xpath = "(((//div[@class='col-span-8'])//div)//div)[1]")
    public WebElement bist;

    @FindBy(xpath = "(((//div[@class='col-span-8'])//div)//div)[8]")
    public WebElement dolar;

    @FindBy(xpath = "(((//div[@class='col-span-8'])//div)//div)[15]")
    public WebElement euro;

    @FindBy(xpath = "(((//div[@class='col-span-8'])//div)//div)[22]")
    public WebElement altin;

    @FindBy(xpath = "//li[@class='hover:text-primary mr-5 flex place-items-center']")
    public WebElement dropMenuButton;

    @FindBy(xpath = "(//li[@class='hover:text-primary mr-5'])[1]")
    public WebElement balikesirGuncelMenuHeader;

    @FindBy(xpath = "(//li[@class='hover:text-primary mr-5'])[2]")
    public WebElement asayisMenuHeader;

    @FindBy(xpath = "(//li[@class='hover:text-primary mr-5'])[3]")
    public WebElement ekonomiMenuHeader;

    @FindBy(xpath = "(//li[@class='hover:text-primary mr-5'])[4]")
    public WebElement sporMenuHeader;

    @FindBy(xpath = "(//li[@class='hover:text-primary mr-5'])[5]")
    public WebElement saglikMenuHeader;

    @FindBy(xpath = "//li[@class='hover:text-primary mr-5 lg:hidden xl:block']")
    public WebElement egitimMenuHeader;

    @FindBy(xpath = "//li[@class='hoverable hover:text-primary mr-5  lg:hidden xl:block']")
    public WebElement bolgeHaberleriMenuHeader;

    @FindBy(xpath = "//ul[@class='flex items-center border-b border-white']")
    public WebElement aramaButonuHomePage;

    @FindBy(xpath = "//div[@class='max-w-full lg:max-w-screen-lg xl:max-w-screen-xl 2xl:max-w-screen-2xl bg-sdkbbg mx-auto mt-4 flex justify-between brd']")
    public WebElement sonDakikaBandiHomePage;

    @FindBy(xpath ="//div[@class='col-span-2 w-full h-full brd-full']")
    public WebElement mansetSliderHeadLineNews1;

    @FindBy(xpath = "(//div[@class='grid w-full'])[3]")
    public WebElement cookieAccept;

    @FindBy(xpath = "//div[@id='BildirtHayir']")
    public WebElement bildiritHayir;

    @FindBy(xpath = "//div[@class='hn-pagination flex w-full py-1 bg-white justify-between px-0.5 swiper-pagination-bullets swiper-pagination-horizontal']")
    public WebElement mansetSliderNumaraButtonlari;

}
