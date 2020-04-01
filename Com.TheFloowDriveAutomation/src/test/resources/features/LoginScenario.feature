@Nexus5XOreo  @Smoke
Feature: Validate login feature with invalid credentials

    Scenario: 02 Verify If the user is Already registered scenario
    Given The FloowDrive app has been launched and open
    And the "Registration" text is available in Registration screen
    When click on "Already registered" button
    Then the "Login" text is available in Login Screen

Scenario: 03 Validate the branding logo string on the app screen
    Then I enter Username as "invalidemail.com" and Password as ""
    And verify login is disabled
    Then I enter Username as "invalidemail.com" and Password as "Subasri"
    And verify login is disabled
    Then I enter Username as "subasrisridhar95@gmail.com" and Password as "Subasri@95"
    And click on login
    Then Verify invalid credentials title as "Could not log in" and Verify invalid credentials text as "Some of your details do not match our records. Please check and try again."
    And Click on button OK
    Then the "Login" text is available in Login Screen

Scenario: 04 Go Back to home
    When click go back
    And the "Registration" text is available in Registration screen