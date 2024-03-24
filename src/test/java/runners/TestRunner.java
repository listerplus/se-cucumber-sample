package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features"
        , glue = {"stepdefinitions"}
)   //plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"}

// extend AbstractTestNGCucumberTests to run each cucumber scenario found in the features as separated test
// AbstractTestNGCucumberTests requires: Cucumber JVM: TestNG
// Dependency required: Cucumber JVM: JUnit 4
public class TestRunner {

//    @Override
//    @DataProvider(parallel = true)
//    public Object[][] scenario(){
//        return super.scenarios();
//    }
//    @BeforeTest
//    @Parameters({ "browser" })
//    public void defineBrowser(String browser) throws Throwable {
//        ConfigReader.setBrowserType(browser);
//    }
}
