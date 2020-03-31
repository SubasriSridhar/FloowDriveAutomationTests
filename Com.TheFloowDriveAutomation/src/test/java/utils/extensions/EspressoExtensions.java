package utils.extensions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.util.HashMap;
import java.util.Map;

import static utils.appium.Driver.appDriver;

public class EspressoExtensions extends MobileElementExtensions {

    private static AndroidDriver driver = appDriver();

    public static void esSwipe(String direction) {
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        driver.executeScript("mobile: swipe", params);
    }

    public static void esSwipe(String direction, MobileElement element) {
        meElementIsDisplayed(element);
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        params.put("element", element.getId());
        driver.executeScript("mobile: swipe", params);
    }

    public static void esIsToastVisible(String text, boolean isRegEx) {
        Map<String, Object> params = new HashMap<>();
        params.put("text", text);
        params.put("isRegexp", isRegEx);
        driver.executeScript("mobile: isToastVisible", params);
    }

    public static void esOpenDrawer(MobileElement element) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        driver.executeScript("mobile: openDrawer", params);
    }

    public static void esOpenDrawer(MobileElement element, int gravity) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("gravity", gravity);
        driver.executeScript("mobile: openDrawer", params);
    }

    public static void esCloseDrawer(MobileElement element) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        driver.executeScript("mobile: closeDrawer", params);
    }

    public static void esCloseDrawer(MobileElement element, int gravity) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("gravity", gravity);
        driver.executeScript("mobile: closeDrawer", params);
    }

    public static void esSetDate(MobileElement element, int year, int monthOfYear, int dayOfMonth) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("year", year);
        params.put("monthOfYear", monthOfYear);
        params.put("dayOfMonth", dayOfMonth);
        driver.executeScript("mobile: setDate", params);
    }

    public static void esSetTime(MobileElement element, int hours, int minutes) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("hours", hours);
        params.put("minutes", minutes);
        driver.executeScript("mobile: setTime", params);
    }

    public static void esNavigateTo(MobileElement element, int menuItemId) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("menuItemId", menuItemId);
        driver.executeScript("mobile: navigateTo", params);
    }

    public static void esScrollToPage(MobileElement element, String scrollTo, boolean smoothScroll) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("scrollTo", scrollTo);
        params.put("smoothScroll", smoothScroll);
        driver.executeScript("mobile: scrollToPage", params);
    }

    public static void esScrollToPage(MobileElement element, int scrollToPage) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", element);
        params.put("scrollToPage", scrollToPage);
        driver.executeScript("mobile: scrollToPage", params);
    }
}