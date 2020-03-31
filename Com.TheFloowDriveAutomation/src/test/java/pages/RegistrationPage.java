package pages;
import java.util.List;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.CHAIN;
import static utils.extensions.MobileElementExtensions.waitForSecs;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.appium.java_client.pagefactory.HowToUseLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.appium.Driver;
import org.openqa.selenium.Dimension;
import static utils.extensions.MobileElementExtensions.*;
import static utils.extensions.MobileElementExtensions.waitForSecs;

public class RegistrationPage extends BasePage {

    public AndroidDriver driver = Driver.appDriver();
    public Dimension size;

    private static Logger log = LogManager.getLogger(BasePage.class.getName());
    private String getPageSource() { return driver.getPageSource(); }

    @AndroidFindBy(id = "branding_back")
    private AndroidElement brandingBack;

    @AndroidFindBy(id = "chk_agree")
    private AndroidElement chkAgree;

    @AndroidFindBy(id = "register_email_address")
    private AndroidElement register_email_address;

    @AndroidFindBy(id = "register_password")
    private AndroidElement register_password;

    @AndroidFindBy(id = "register_confirm_password")
    private AndroidElement repeat_password;
    @AndroidFindBy(id = "register_forename")
    private AndroidElement first_Name;
    @AndroidFindBy(id = "register_surname")
    private AndroidElement last_name;
    @AndroidFindBy(id = "register_dob")
    private AndroidElement dob;
    @AndroidFindBy(id = "register_postcode")
    private AndroidElement zip;
    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(xpath = "//android.widget.Button(@resource-id='app:id/button1')")
    private AndroidElement buttonOK;
    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(xpath = "//android.widget.Button(@resource-id='android:id/button1' and @text='OK')")
    private AndroidElement buttonOK1;
    //*[@contentDescription='01 January 2002']

    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(xpath = "//android.view.View(@content-desc='01 January 2002')")
    private AndroidElement pickdate;

    @AndroidFindBy(id = "btn_register")
    private AndroidElement register;

    @AndroidFindBy(id = "show_password")
    private AndroidElement show_password;

    public void validateMultipleInPageSource1(List<String> table) throws InterruptedException {
        for (String row : table) {
            Assert.assertTrue(getPageSource().contains(row));
            waitForSecs(1);
            log.info("The text " + row + " is in the app screen's source.");
        }
    }
    public void alreadyRegistered(String text) {
        scrollTo(text);
    }
    public void enterEmailAddress(String arg1) {
        meSendKeys(register_email_address,arg1,true);
        driver.pressKeyCode(AndroidKeyCode.BACK);
    log.info(":: The register email_address as " + register_email_address );
    }
    public void enterPassword(String arg1) {
        meSendKeys(register_password,arg1,true);
        log.info(":: The register password as " + register_password );
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }
    public void repeatPassword(String arg1) {
        meSendKeys(repeat_password,arg1,true);
        log.info(":: The repeat password as " + repeat_password );
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }
    public void firstName(String arg1) {

        meSendKeys(first_Name,arg1,true);
        log.info(":: The first name as " + first_Name );
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }
    public void surName(String arg1) {

        meSendKeys(last_name,arg1,true);
        log.info(":: The last name as " + last_name );
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }
    public void tapDOB() throws InterruptedException {
        waitForSecs(3);
        log.info(":: "+dob.isDisplayed() );
        dob.click();
        log.info(":: Clicked");
        waitForSecs(3);
        //log.info("Button ok present?"+pickdate.isDisplayed());
        log.info(":: The DOB " + dob );
        waitForSecs(3);
        String actualString = driver.findElement(By.xpath("//android.view.View(@content-desc='01 January 2002')")).getText();
        Assert.assertTrue(actualString.contains("01 January 2002"));
    }
    public void enterZip(String arg1) throws InterruptedException {
        meSendKeys(zip,arg1,true);
        log.info(":: The zipcode as " + zip);
        log.info(":: wait 3 secs" + zip);
        waitForSecs(10);


    }
    public void agreeLicense() throws InterruptedException {
        chkAgree.click();
        log.info(":: click agree License ");
    }
    public void clickRegister() throws InterruptedException {
        register.click();
    }
//    public void clickGrantPermission() throws InterruptedException {
//        Assert.assertTrue(getPageSource().contains("Grant Permission").click();
//        getPageSource().contains("Grant Permission").click();
//    }

}