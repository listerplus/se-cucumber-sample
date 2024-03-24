package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class WaitUtil {
    static Long TIMEOUT = 10L;
    public static WebElement waitVisible(WebDriver driver, By by, Long timeoutInSeconds)
    {
        timeoutInSeconds = timeoutInSeconds == null ? TIMEOUT : timeoutInSeconds;
        var element = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;
    }

    public static void waitElementVisible(WebDriver driver, WebElement e, Long timeoutInSeconds)
    {
        timeoutInSeconds = timeoutInSeconds == null ? TIMEOUT : timeoutInSeconds;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public static WebElement waitClickable(WebDriver driver, By by, Long timeoutInSeconds)
    {
        timeoutInSeconds = timeoutInSeconds == null ? TIMEOUT : timeoutInSeconds;
        var element =  new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.elementToBeClickable(by));
        return element;
    }

    public static void waitSelected(WebDriver driver, By by, Long timeoutInSeconds)
    {
        timeoutInSeconds = timeoutInSeconds == null ? TIMEOUT : timeoutInSeconds;
        var element = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(ExpectedConditions.elementToBeSelected(by));
    }

    // Add more methods based on your needs

    // Example usage:
    // WaitUtil.WaitVisible(driver, By.Id("exampleId"));
}
