package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Driver {
    private Driver(){
    }
    static WebDriver driver;
    public static WebDriver getDriver(){

        String browser= ConfigReader.getProperty("browser");
        if(driver==null) {

            switch (browser) {
                case "chrome" -> {
                    ChromeOptions ops = new ChromeOptions();
                    ops.addArguments("--remote-allow-origins=*");
                    ops.addArguments("--disable-notification");
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("download.prompt_for_download", false);
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(ops);
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "safari" -> {
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                }
                default -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;
        }

    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
}