import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import utils.appium.DriverController;
import java.io.IOException;
import static pages.Page.instanceOf;
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"utils.hooks", "steps"},
        tags = {"~@Ignore"},
        plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class Nexus5xTestRunner extends AbstractTestNGCucumberTests {
        @BeforeTest //this method gets run first
        public void setUpTest() throws IOException {
                DriverController.instance.startAppDriver("Nexus5XOreo","emulator-5554", 8201);
                instanceOf(BasePage.class).appFullyLaunched();
        }

        @AfterTest //tearDown of AppDriver method happens at very end
        public void tearDownTest() {
                DriverController.instance.stopAppDriver();
        }
}