package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static java.lang.StringTemplate.STR;


public class DriverSetup {

    public static WebDriver initialize(WebDriver driver) {
        String browserType = ConfigReader.getBrowser();

        switch (browserType.toLowerCase()) {
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println(STR."Unrecognized browser: \{browserType}. Defaulting to Chrome.");
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }
}
