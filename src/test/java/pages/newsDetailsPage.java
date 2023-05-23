package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class newsDetailsPage {

    public newsDetailsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Balikesri Guncel Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[1])//li)[1]")
    public WebElement balikesirGuncelHeaderInConteiner;

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Asayis Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[1])//li)[2]")
    public WebElement asayisHeaderInConteiner;

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Ekonomi Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[1])//li)[3]")
    public WebElement ekonomiHeaderInConteiner;

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Spor Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[1])//li)[4]")
    public WebElement sporHeaderInConteiner;

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Saglik Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[1])//li)[5]")
    public WebElement saglikHeaderInConteiner;

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Egitim Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[1])//li)[6]")
    public WebElement egitimHeaderInConteiner;

    // HomePage--> DropMenuButton--> BALIKESİR HABER--> Balıkesir Güncel--> Balıkesir Güncel page--> First Header
    @FindBy(xpath = "((//div[@class='grid grid-cols-1 lg:grid-cols-2'])//div)[1]")
    public WebElement balikesirGuncelHeader;

    // HomePage--> DropMenuButton--> Ilçe Haberleri
    @FindBy(xpath = "((//div[@class='mt-4 w-full text-center lg:text-left'])//div)[2]")
    public WebElement ilceHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri --> Ayvalik Hbaerleri Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[2])//li)[1]")
    public WebElement ayvalikHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri --> Edremit Hbaerleri Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[2])//li)[2]")
    public WebElement edremitHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri --> Bandirma Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[2])//li)[3]")
    public WebElement bandirmaHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri --> Burhaniye Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[2])//li)[4]")
    public WebElement burhaniyeHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri --> Susurluk Haberleri Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[2])//li)[5]")
    public WebElement susurlukHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri --> Erdek Haberleri Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[2])//li)[6]")
    public WebElement erdekHaberleriHeaderInConteiner;

    // HomePage--> DropMenuButton--> Ilçe Haberleri--> Erdek Haberleri --> ERDEK  Header
    @FindBy(xpath = "((//div[@class='grid grid-cols-1 lg:grid-cols-2'])//div)[1]")
    public WebElement erdekHeader;

    // HomePage--> DropMenuButton--> Bolge Haberleri --> Bursa Haber Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[3])//li)[1]")
    public WebElement bursaHaberHeaderInConteiner;

    // HomePage--> DropMenuButton--> Bolge Haberleri--> Izmir Haber Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[3])//li)[2]")
    public WebElement izmirHaberHeaderInConteiner;

    // HomePage--> DropMenuButton--> Bolge Haberleri --> Canakkale Haber Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[3])//li)[3]")
    public WebElement canakkaleHaberHeaderInConteiner;

    // HomePage--> DropMenuButton--> Bolge Haberleri --> Manisa Haber Header
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[3])//li)[4]")
    public WebElement manisaHaberHeaderInConteiner;

    // HomePage--> DropMenuButton--> Bolge Haberleri--> Kutahya Haber
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[3])//li)[5]")
    public WebElement kutahyaHaberHeaderInConteiner;

    // HomePage--> DropMenuButton--> Bolge Haberleri--> Aydin Haber
    @FindBy(xpath = "(((//ul[@class='flex flex-col mt-4 mb-0 lg:mt-4 lg:mb-4'])[3])//li)[6]")
    public WebElement aydinHaberHeaderInConteiner;

    // HomePage--> DropMenuButton--> Bolge Haberleri--> Canakkale Haber --> CANAKKALE Header
    @FindBy(xpath = "//h1[@class='w-full uppercase font-mibitter text-kr-7']")
    public WebElement canakkaleHeader;

}