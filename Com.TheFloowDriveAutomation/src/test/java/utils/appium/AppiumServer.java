package utils.appium;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumServer {

    private static AppiumDriverLocalService service;

    public static void start() {
        if (checkIfServerIsRunning()) {
            return;
        }

        //Build the Appium service
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");

        //Start the server with the builder if not already running
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

    static void stop() {
        service.stop();
    }

    //Check if Appium server is running
    private static boolean checkIfServerIsRunning() {
        return service != null;
    }
}