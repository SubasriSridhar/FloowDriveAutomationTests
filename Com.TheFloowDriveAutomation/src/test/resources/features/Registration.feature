@Nexus5XOreo @Smoke
Feature: Registration and Login
    Scenario: 05 Validate the registration page
        Given The FloowDrive app has been launched and open
        Then the app page has following
            |Registration|
            |Email address|
            |Password|
            |Repeat password|
            |show password|
            |Your password must be 8 or more characters|
            |First name|
            |Surname|

        When scroll to Already registered
        Then the app page has following
            |Date of birth|
            |Zip code|
            |I accept the terms of use|
            |Register|
            |Already registered|
        Then scroll to Registration

    Scenario: 06. Validate, Fill in the fields and Register existing user
    Given The FloowDrive app has been launched and open
        Then Enter Email Address as "Subasri.sridhar@gmail.com"
        Then Enter Password as "Subasri1995"
        Then Enter Repeat Password as "Subasri1995"
        Then Enter First name as "Subasri"
        Then Enter Surname as "Sridhar"
        When scroll to Already registered
        Then Enter Zipcode as "DD13EU"
        And Go back
        When scroll to Already registered
        Then Click on Agree license
        Then Click on Register button
        Then the app page has following
        |Registration Failed|
        |This email is already in use|
        |Please try logging in|
        Then click on "OK" button
        Then scroll to Registration
        Then Enter Email Address as "Something.new@gmail.com"
        When scroll to Already registered
        Then Click on Register button
        Then the app page has following
            |These policy details are already registered|
        Then click on "OK" button
        Then Enter First name as "Subasrixx"
        Then Enter Surname as "Sridharyy"
        Then Click on Register button
        Then the app page has following
        |FloowDrive|
        |Welcome to FloowDrive. This app will measure your driving and aid you in getting a lower premium.|
        Then swipe left
        Then the app page has following
        |Score my journeys|
        |We'll tell you how good your driving is on a scale of 0 to 100. The higher the score the better discount you get.|
        Then swipe left
        Then click on "Get Started" button
        Then click on "Settings" button
        Then Go back
        And Recorder and Pause buttons are clickable
        And swipe left
        And swipe left
        And click on "About" button
        And click on "Log out" button
        And click on "OK" button







