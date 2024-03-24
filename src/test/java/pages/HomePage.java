package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomePage {
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    // By Locators
    private By btnDashboardBy = By.xpath("//li[@class='menuitem']/a[contains(text(),'Dashboard')]");
    private By btnJobsBy = By.id("//a[@href='/Job']");
    private By btnJobsCalendarBy = By.id("//a[@href='/Scheduler']");
    private By btnStaffCalendarBy = By.id("//a[@href='/StaffCalendar']");
    private By dropdownAdministrationBy = By.xpath("//*[contains(text(),'Administration')]");
    private By customersOptionBy = By.xpath("///a[@href='/Client']");
    private By employeesOptionBy = By.xpath("//a[@href='/User']");
    private By TMOptionBy = By.xpath("//a[@href='/TimeMaterial']");
    private By helloRegionBy = By.xpath("//*[@id=\"logoutForm\"]//a[@class=\"dropdown-toggle\"][@role=\"button\"]");

    // Page Methods/Actions
    public void navigateToTMPage()
    {
        driver.findElement(dropdownAdministrationBy).click();
        driver.findElement(TMOptionBy).click();
    }

    public void navigateToEmployeePage()
    {
        driver.findElement(dropdownAdministrationBy).click();
        driver.findElement(employeesOptionBy).click();
    }

    public String getLoggedInUser()
    {
        String helloMsg =  driver.findElement(helloRegionBy).getText(); //should return "Hello user!"
        // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        String regex = "Hello (.+)!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(helloMsg);
        return matcher.group(1);
    }

    public String getHelloMsg()
    {
        return driver.findElement(helloRegionBy).getText();
        //should return "Hello user!"
    }
}
