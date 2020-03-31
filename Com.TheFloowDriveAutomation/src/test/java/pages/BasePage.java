package pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.CHAIN;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.appium.java_client.pagefactory.HowToUseLocators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.appium.Driver;
import org.openqa.selenium.Dimension;
import static utils.extensions.MobileElementExtensions.*;
import static utils.extensions.MobileElementExtensions.waitForSecs;

public class BasePage extends Page {

    public AndroidDriver driver = Driver.appDriver();
    public Dimension size;

    private static Logger log = LogManager.getLogger(BasePage.class.getName());
    private String getPageSource() { return driver.getPageSource(); }

    @AndroidFindBy(id = "branding_logo")
    private AndroidElement brandingLogo;

    @AndroidFindBy(id = "btn_already_registered")
    private AndroidElement alreadyLogin;

    @AndroidFindBy(id = "register_password_visibility_text")
    private AndroidElement showPassword;

    @AndroidFindBy(id = "login_email")
    private AndroidElement loginEmail;

    @AndroidFindBy(id = "login_password")
    private AndroidElement loginPassword;

    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.thefloow.thefloowltd.floowdrive.app:id/btn_login\").enabled(false).index(2)")
    private AndroidElement disabledLoginButton;

    @AndroidFindBy(id = "btn_login")
    private AndroidElement loginButton;

    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(xpath = "//android.widget.Button(@resource-id='com.thefloow.thefloowltd.floowdrive.app:id/fat_button_1')")
    private AndroidElement buttonOK;

    @AndroidFindBy(id = "branding_back")
    private AndroidElement brandingBack;
    public void appFullyLaunched() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(brandingLogo));
    }

    public void validateRegistrationText(String registrationText) {
        Assert.assertTrue(getPageSource().contains(registrationText));
        log.info(":: The text " + registrationText + " is present in the app screen's source.");
    }

    public void clickAlreadyLogin(String str) {
        scrollAndClick(str);
    }

    public void validateLoginText(String loginText) throws InterruptedException, Throwable {
        Assert.assertTrue(getPageSource().contains(loginText));
        log.info(":: The text " + loginText + " is present in the app screen's source.");
        waitForSecs(5);
    }

    public void enterLoginCredentials(String arg1, String arg2) throws Throwable {
        meSendKeys(loginEmail,arg1,true);
        meSendKeys(loginPassword,arg2,true);
        log.info(":: The loginEmail " + loginEmail + "and the loginPassword" +loginPassword+"is entered in the app screen's source.");
    }

    public void isLoginButtonDisabled(){
            meWaitForSeconds();
            log.info(":: Is login button disabled? " + disabledLoginButton.isDisplayed());
            Assert.assertTrue(disabledLoginButton.isDisplayed());
        }

    public void  clickLogin () throws InterruptedException {
        loginButton.click();
        log.info(":: Clicked on login button");
        log.info(":: 2 secs wait");
        waitForSecs(2);
    }

    public void  clickInvalidloginOK () throws InterruptedException {
        WebElement expandList = driver.findElementByXPath("//*[@text='OK' and @resource-id='com.thefloow.thefloowltd.floowdrive.app:id/fat_button_1' and @class='android.widget.Button']");
        expandList.click();
        log.info(":: Clicked on ok button");
        waitForSecs(5);
    }
    public void clickBackButton() throws InterruptedException{
        brandingBack.click();
        log.info(":: Clicked on Back button");
        waitForSecs(5);
    }

    public void verifyInvalidloginAlert(String invalidLoginTitle,String invalidContent) throws Throwable {
        String loginTtl="//*[@text='"+invalidLoginTitle+"' and @resource-id='com.thefloow.thefloowltd.floowdrive.app:id/title']";
        WebElement expandList = driver.findElementByXPath(loginTtl);
        System.out.println(expandList.getText());
        Assert.assertTrue(getPageSource().contains(expandList.getText()));
        log.info(":: The text " + invalidLoginTitle + " is present in the app screen's source.");
        String invalidloginContent="//*[@text='"+invalidContent+"' and @resource-id='com.thefloow.thefloowltd.floowdrive.app:id/content']";
        WebElement expandListx = driver.findElementByXPath(invalidloginContent);
        System.out.println(expandListx.getText());
        Assert.assertTrue(getPageSource().contains(expandListx.getText()));
        log.info(":: The text " + invalidContent + " is present in the app screen's source.");
    }

}