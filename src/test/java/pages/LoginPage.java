package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtil;

public class LoginPage {

    private WebDriver driver;
    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    // By Locators
    public By TxtUserNameBy = By.id("UserName");
    public By TxtPasswordBy = By.id("Password");
    public By BtnLoginBy = By.xpath("//input[@value='Log in']");
    public By ErrorFieldBy = By.xpath("//div[@class='validation-summary-errors']/ul/li");

    // Text
    public final String userValid = "hari";
    public final String passwordValid = "123123";
    public final String userInValid = "test";
    public final String passwordInValid = "test";
    public final String errorInValid = "Invalid username or password.";

    // Page Methods/Actions
    public void clickLogin()
    {
        WaitUtil.waitClickable(driver, BtnLoginBy, null).click();
    }

    public void LoginCredentials(String username, String password)
    {
        WaitUtil.waitVisible(driver, TxtUserNameBy, null).clear();
        driver.findElement(TxtUserNameBy).sendKeys(username);
        driver.findElement(TxtPasswordBy).clear();
        driver.findElement(TxtPasswordBy).sendKeys(password);
        driver.findElement(BtnLoginBy).click();
    }

    public void Login()
    {
        WaitUtil.waitVisible(driver, TxtUserNameBy, null).clear();
        driver.findElement(TxtUserNameBy).sendKeys(userValid);
        driver.findElement(TxtPasswordBy).clear();
        driver.findElement(TxtPasswordBy).sendKeys(passwordValid);
        driver.findElement(BtnLoginBy).click();
    }

    public String getLoginError()
    {
        return WaitUtil.waitVisible(driver, ErrorFieldBy, null).getText();
    }

}
