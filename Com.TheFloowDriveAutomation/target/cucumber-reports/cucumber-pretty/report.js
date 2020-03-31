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
  "status": "passed"
});
formatter.step({
  "name": "click on \"Log out\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on \"OK\" button",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.alreadyLogin(String)"
});
formatter.result({
  "status": "passed"
});
});