$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Homescreen.feature");
formatter.feature({
  "name": "Homescreen verification of the application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Nexus5XOreo"
    },
    {
      "name": "@Nexus6pMarshmallow"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "01  Floowdrive home screen verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Nexus5XOreo"
    },
    {
      "name": "@Nexus6pMarshmallow"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "The FloowDrive app has been launched and open",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.isBrandingLogoPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Registration\" text is available in Registration screen",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.isRegistrationTextPresent(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Already registered\" button",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Login\" text is available in Login Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseSteps.validateLoginText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Username as \"subasri.sridhar95@gmail.com\" and Password as \"Subasri@95\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseSteps.enterLoginCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Grant permission\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"ALLOW\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.clickonAllowPermissions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Get Started\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"Settings\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.clickonSettings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go back",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.GoBack()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recorder and Pause buttons are clickable",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.verifyRecAndPausebutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Swipe check the following scoring methodology",
  "rows": [
    {
      "cells": [
        "Score"
      ]
    },
    {
      "cells": [
        "Smooth Driving"
      ]
    },
    {
      "cells": [
        "Mobile Use"
      ]
    },
    {
      "cells": [
        "Speed"
      ]
    },
    {
      "cells": [
        "Fatigue"
      ]
    },
    {
      "cells": [
        "Time of Day"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "HomeScreenSteps.verifyScoringMethodology(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"0\" numbers of \"Trips\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.verifyNoTrips(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"0\".\"0\" numbers of \"miles\"",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.verifyNoMiles(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the app page has following",
  "rows": [
    {
      "cells": [
        "Stationary"
      ]
    },
    {
      "cells": [
        "Score history"
      ]
    },
    {
      "cells": [
        "No scores yet"
      ]
    },
    {
      "cells": [
        "Check back when you\u0027ve recorded your first trip"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterScreenSteps.assertTexts(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "swipe left",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.swipeLeft()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "swipe left",
  "keyword": "And "
});
formatter.match({
  "location": "HomeScreenSteps.swipeLeft()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"About\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027SUBASRISRIDHAR\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\91979\\Documents\\Ne..., appPackage: com.thefloow.thefloowltd.fl..., avd: Nexus5XOreo, databaseEnabled: false, desired: {app: C:\\Users\\91979\\Documents\\Ne..., avd: Nexus5XOreo, deviceName: Nexus5XOreo, platformName: android, systemPort: 8201, udid: emulator-5554}, deviceApiLevel: 27, deviceManufacturer: Google, deviceModel: Android SDK built for x86, deviceName: emulator-5554, deviceScreenDensity: 420, deviceScreenSize: 1080x1920, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.625, platform: LINUX, platformName: Android, platformVersion: 8.1.0, statBarHeight: 63, systemPort: 8201, takesScreenshot: true, udid: emulator-5554, viewportRect: {height: 1731, left: 0, top: 63, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: a715defb-3ea4-405b-bbc3-9900ecd19c4f\n*** Element info: {Using\u003d-android uiautomator, value\u003dnew UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"About\").instance(0))}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat io.appium.java_client.FindsByAndroidUIAutomator.findElementByAndroidUIAutomator(FindsByAndroidUIAutomator.java:38)\r\n\tat utils.extensions.MobileElementExtensions.scrollAndClick(MobileElementExtensions.java:81)\r\n\tat pages.BasePage.clickAlreadyLogin(BasePage.java:66)\r\n\tat steps.BaseSteps.alreadyLogin(BaseSteps.java:23)\r\n\tat ✽.click on \"About\" button(file:src/test/resources/features/Homescreen.feature:34)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on \"Log out\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on \"OK\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "skipped"
});
});