package utils.extensions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.appium.Driver;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static utils.appium.Driver.appDriver;
//import static utils.appium.Settings.meHighlightedColour;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.*;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.*;

public class MobileElementExtensions {

    private static int sec = 10;
    private static TouchAction touchAction = new TouchAction(appDriver());

    public static WebDriverWait meWaitForSeconds() {
        sec=60;
        WebDriverWait wait = new WebDriverWait(appDriver(), sec);
        return wait;
    }

    public static boolean meElementIsDisplayed(MobileElement element) {
        meWaitForSeconds().until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

    public static boolean meElementToBeClickable(MobileElement element) {
        meWaitForSeconds().until(ExpectedConditions.elementToBeClickable(element));
        return element.isEnabled();
    }

    public static void meTap(MobileElement mobileElement) {
        meElementToBeClickable(mobileElement);
        touchAction.tap(tapOptions().withElement(element(mobileElement))).perform();
    }

    public static void meLongPress(MobileElement mobileElement) {
        meElementToBeClickable(mobileElement);
        touchAction.longPress(longPressOptions().withElement(element(mobileElement))
                .withDuration(ofSeconds(2))).release().perform();
    }

    public static void meSwipeFromElementToElement(MobileElement fromMobileElement, MobileElement toMobileElement) {
        meElementToBeClickable(fromMobileElement);
        meElementToBeClickable(toMobileElement);
        touchAction.longPress(longPressOptions().withElement(element(fromMobileElement))
                .withDuration(ofSeconds(2))).moveTo(element(toMobileElement)).release().perform();
    }

    public static void meSendKeys(MobileElement element, String text, boolean clearFirst) {
        meElementIsDisplayed(element);
        if (clearFirst) meTap(element);
        element.sendKeys(text);
    }

    public static boolean meElementIsInvisible(MobileElement element) {
        meWaitForSeconds().until(ExpectedConditions.invisibilityOf(element));
        return !element.isDisplayed();
    }

    public static String meGetAttribute(MobileElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public static void scrollAndClick(String visibleText) {
        AndroidDriver driver = Driver.appDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }
    public static void scrollTo(String visibleText) {
        AndroidDriver driver = Driver.appDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
    }
    public enum DIRECTION {
        DOWN, UP, LEFT, RIGHT
    }
    public static void waitForSecs(long duration) throws InterruptedException {
        sleep(duration*1000);
    }

    public static void meSwipe(DIRECTION direction, long duration) {
        Dimension size = appDriver().manage().window().getSize();
        int startX = 0;
        int endX = 0;
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case RIGHT:
                startY = size.height / 2;
                startX = (int) (size.width * 0.90);
                endX = (int) (size.width * 0.05);
                touchAction
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                        .moveTo(PointOption.point(endX, startY))
                        .release()
                        .perform();
                break;

            case LEFT:
                startY = size.height / 5;
                startX = (int) (size.width * 0.3);
                endX = (int) (size.width * 0.7);
                touchAction
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                        .moveTo(PointOption.point(endX, startY))
                        .release()
                        .perform();
                break;

            case UP:
                startY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                touchAction
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                        .moveTo(PointOption.point(endX, startY))
                        .release()
                        .perform();
                break;

            case DOWN:
                startY = (int) (size.height * 0.70);
                endY = (int) (size.height * 0.30);
                startX = (size.width / 2);
                touchAction
                        .press(PointOption.point(startX, startY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
                        .moveTo(PointOption.point(startX, endY))
                        .release()
                        .perform();
                break;
        }
    }
}
