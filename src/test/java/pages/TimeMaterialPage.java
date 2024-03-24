package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WaitUtil;

public class TimeMaterialPage {
    private WebDriver driver;

    // Constructor
    public TimeMaterialPage(WebDriver driver)
    {
        this.driver = driver;
    }

    // By Locators
    public static By BtnCreateNewBy = By.xpath("//a[@href='/TimeMaterial/Create']");
    public static By BtnGoToFirstPageBy = By.xpath("//*[@id='tmsGrid']//a[@title='Go to the first page']");
    public static By BtnGoToLastPageBy = By.xpath("//*[@id='tmsGrid']//a[@title='Go to the last page']");
    public static By TableInfoFieldBy = By.xpath("//*[@class='k-pager-info k-label']");
    public static By TableNumSelectedBy = By.xpath("//*[@class='k-state-selected']");
    public static By TableBtnDelFirstBy = By.xpath("//*[@id='tmsGrid']//tbody/tr[1]//a[@class='k-button k-button-icontext k-grid-Delete']");


    // Page Methods/Actions
    public void ClickCreateNew()
    {
        WaitUtil.waitVisible(driver, BtnCreateNewBy, null);
        driver.findElement(BtnCreateNewBy).click();
    }

    public String GetTableNumSelected()
    {
        return driver.findElement(TableNumSelectedBy).getText();
    }

//    public int GetItemsCount() throws InterruptedException {
//        Thread.sleep(2000);
//        WaitUtil.waitVisible(driver, TableInfoFieldBy);
//        String tableInfo = driver.findElement(TableInfoFieldBy).getText();
//        //Console.WriteLine("Tableinfo: " + tableInfo);
//        Regex pattern = new Regex(@"(?<itemx>\d+) - (?<itemy>\d+) of (?<itemTotal>\d+)");
//        Match match = pattern.Match(tableInfo);
//        int itemTotal = int.Parse(match.Groups["itemTotal"].Value);
//        //Console.WriteLine("count: " + itemTotal);
//        return itemTotal;
//    }

    public void DeleteFirstItem() throws Exception {
        try
        {
            driver.findElement(TableBtnDelFirstBy).click();
            driver.switchTo().alert().accept();
        }
        catch (Exception ex)
        {
            throw new Exception("Exception: " + ex);
        }
    }
}
