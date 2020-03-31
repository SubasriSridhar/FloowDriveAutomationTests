@Nexus5XOreo @Nexus6pMarshmallow @Smoke

Feature: Homescreen verification of the application
  Scenario: 01  Floowdrive home screen verification

    Given The FloowDrive app has been launched and open
    And the "Registration" text is available in Registration screen
    When click on "Already registered" button
    Then the "Login" text is available in Login Screen
    Then I enter Username as "subasri.sridhar95@gmail.com" and Password as "Subasri@95"
    And click on login
    And click on "Grant permission" button
    And click on "ALLOW"
    And click on "Get Started" button
    And click on "Settings"
    And Go back
    And Recorder and Pause buttons are clickable
    When Swipe check the following scoring methodology
    |Score|
    |Smooth Driving|
    |Mobile Use     |
    |Speed          |
    |Fatigue        |
    |Time of Day    |
    And Verify "0" numbers of "Trips"
    And Verify "0"."0" numbers of "miles"
    And the app page has following
    |Stationary|
    |Score history|
    |No scores yet|
    |Check back when you've recorded your first trip|
    And swipe left
    And swipe left
    And click on "About" button
    And click on "Log out" button
    And click on "OK" button
