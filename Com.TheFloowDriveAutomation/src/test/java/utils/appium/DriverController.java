package utils.appium;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.drivers.AndroidAppDriver;
import java.io.IOException;

public class DriverController {

    public static DriverController instance = new DriverController();

    AndroidDriver androidDriver;

    private static Logger log = LogManager.getLogger(DriverController.class);

    public void startAppDriver(String avdDeviceName, String udid, int systemPort) throws IOException {
        if (instance.androidDriver != null) return;
        instance.androidDriver = AndroidAppDriver.loadDriver(avdDeviceName, udid, systemPort);
    }

    public void stopAppDriver() {
        if (instance.androidDriver == null) return;

        try {
            instance.androidDriver.quit();
        } catch (Exception e) {
            log.error(e + ":: AndroidDriver stop error");
        }

        AppiumServer.stop();
        instance.androidDriver = null;
        log.debug(":: AndroidDriver stopped");
    }
}