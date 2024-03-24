package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.DriverSetup;
import org.testng.Assert;

public class LoginStep {
    WebDriver driver;
    public LoginPage loginPage;

    @Given("^User is on login page$")
    public void goToLogin() {
        driver = DriverSetup.initialize(driver);
        String url = ConfigReader.getUrl();
        driver.navigate().to(url);
    }

    @When("User enters correct credentials")
    public void loginValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginCredentials(loginPage.userValid, loginPage.passwordValid);
    }

    @Then("User is directed to homepage")
    public void verifyAtHomepage() {
        HomePage homePage = new HomePage(driver);
        String helloMessage = STR."Hello \{loginPage.userValid}!";
        Assert.assertEquals(homePage.getHelloMsg(), helloMessage);
    }

    @When("User enters incorrect {string} {string}")
    public void loginInvalidCredentials(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginCredentials(username, password);
    }

    @Then("Error message prompted")
    public void verifyLoginErrorPrompted() {
        Assert.assertEquals(loginPage.getLoginError(), loginPage.errorInValid);
    }
}

