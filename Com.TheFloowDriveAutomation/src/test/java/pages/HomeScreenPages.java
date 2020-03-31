package pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static io.appium.java_client.pagefactory.LocatorGroupStrategy.CHAIN;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
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

import java.time.Duration;
import java.util.List;

import static utils.appium.Driver.appDriver;
import static utils.extensions.MobileElementExtensions.*;
import static utils.extensions.MobileElementExtensions.DIRECTION.LEFT;
import static utils.extensions.MobileElementExtensions.DIRECTION.RIGHT;
import static utils.extensions.MobileElementExtensions.waitForSecs;

public class HomeScreenPages extends RegistrationPage {

    public AndroidDriver driver = Driver.appDriver();
    public Dimension size;

    private static TouchAction touchAction = new TouchAction(appDriver());

    private static Logger log = LogManager.getLogger(BasePage.class.getName());
    private String getPageSource() { return driver.getPageSource(); }

    @AndroidFindBy(id = "btn_start_journey")
    private AndroidElement recButton;

    @AndroidFindBy(id = "btn_dashboard_pause")
    private AndroidElement pauseButton;

    @AndroidFindBy(id = "btn_next")
    private AndroidElement Nextbtn;

    @AndroidFindBy(id = "journey_count")
    private AndroidElement journeyCount;

    @AndroidFindBy(id = "journey_count_caption")
    private AndroidElement journeyCountCaption;

    @AndroidFindBy(id = "total_distance")
    private AndroidElement totalDistance;

    @AndroidFindBy(id = "total_distance_decimal_part")
    private AndroidElement total_decimal_part;

    @AndroidFindBy(id = "total_distance_unit")
    private AndroidElement total_distance_unit;

    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.thefloow.thefloowltd.floowdrive.app:id/btn_login\").enabled(false).index(2)")
    private AndroidElement disabledLoginButton;

    @HowToUseLocators(androidAutomation = CHAIN)
    @AndroidFindBy(xpath = "//android.widget.ImageView(@bounds='[835,126][964,202]')")
    private AndroidElement elipsis;
    //*[@class='android.widget.ImageView' and @bounds='[835,126][964,202]']


    public void isRecAndPausebuttonEnabled() {
            Assert.assertTrue(recButton.isEnabled() && pauseButton.isEnabled());
            log.info(" ::Is Rec and Pause button are enabled? " + (recButton.isEnabled() && pauseButton.isEnabled()));
    }

    public void validateMultipleInPageSources(List<String> table) throws InterruptedException {
       for (String row : table) {
            Assert.assertTrue(getPageSource().contains(row));
            waitForSecs(1);
            log.info("The text " + row + " is in the app screen's source.");
            Nextbtn.click();
       }
    }

    public void verifyNoTrips(String no,String trips){

            log.info("The journeyCount " + journeyCount.getText() + " journeyCountCaption"+journeyCountCaption.getText() + "    " + no + trips);
            Assert.assertTrue(journeyCount.getText().equals(no) && journeyCountCaption.getText().equals(trips));
        }

    public void verifyNoMiles(String no1,String no2,String miles){
            log.info("The totalDistance " + totalDistance + " total_distance_decimal_part"+total_decimal_part +"miles"+miles );
            Assert.assertTrue(totalDistance.getText().equals(no1) && total_decimal_part.getText().equals(no2) && total_distance_unit.getText().equals(miles) );
        }

    public void clickonAllowPermissions(){
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        log.info("clicked on allow permissions" );

    }
    public void clickonSettings(){
        driver.findElement(By.id("com.thefloow.thefloowltd.floowdrive.app:id/settings_btn")).click();
        log.info("clicked on settings" );
    }
    public void GoBack() throws InterruptedException {
        waitForSecs(2);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        waitForSecs(2);
        log.info("back" );
    }
    public void swipeLeft() throws InterruptedException {
        meSwipe(LEFT,30);
        log.info("swipe left" );
        waitForSecs(1);
         }
}