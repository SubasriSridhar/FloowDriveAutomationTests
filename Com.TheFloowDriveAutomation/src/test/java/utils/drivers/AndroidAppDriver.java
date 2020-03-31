package utils.drivers;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.appium.AppiumServer;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;


public class AndroidAppDriver {

    private static AndroidDriver driver;

    public static AndroidDriver loadDriver(String avdDeviceName, String udid, int systemPort) throws IOException {
        AppiumServer.start();

        File file = new File("src");
        File fileApp = new File(file, "Turnkey_88a599ba-d555-4b39-9a1a-c174b13ec1d2.apk");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("avd", avdDeviceName);
        cap.setCapability("deviceName", avdDeviceName);
        cap.setCapability("udid", udid);
        cap.setCapability("systemPort", systemPort);
        cap.setCapability("app", fileApp.getAbsolutePath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }
}