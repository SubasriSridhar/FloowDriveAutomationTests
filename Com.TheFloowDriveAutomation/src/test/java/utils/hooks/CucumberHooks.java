package utils.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;
import utils.appium.DriverController;
import java.io.IOException;

import static pages.Page.instanceOf;

public class CucumberHooks {

    @Before("@DebugNexus5xOreo")
    public void beforeNexus5xOreo() throws IOException {
        DriverController.instance.startAppDriver("Nexus5XOreo","emulator-5554", 8201);
        instanceOf(BasePage.class).appFullyLaunched();
    }

    @Before("@DebugNexus6pMarshmallow")
    public void beforeNexus6pMarshmallow() throws IOException {
        DriverController.instance.startAppDriver("Nexus6pMarshmallow", "emulator-5556", 8202);
        instanceOf(BasePage.class).appFullyLaunched();
    }

    @After("@DebugNexus5xOreo, @DebugNexus6pMarshmallow")
    public void afterDevices() {
        DriverController.instance.stopAppDriver();
    }
}