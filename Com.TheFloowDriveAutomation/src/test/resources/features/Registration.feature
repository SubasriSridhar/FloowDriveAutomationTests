#@Nexus6pMarshmallow @Nexus5XOreo @Smoke
#Feature: Registration and Login
#    Scenario: 05 Validate the registration page
#        Given The FloowDrive app has been launched and open
#        Then the app page has following
#            |Registration|
#            |Email address|
#            |Password|
#            |Repeat password|
#            |show password|
#            |Your password must be 8 or more characters|
#            |First name|
#            |Surname|
#
#        When scroll to Already registered
#        Then the app page has following
#            |Date of birth|
#            |Zip code|
#            |I accept the terms of use|
#            |Register|
#            |Already registered|
#        Then scroll to Registration
#
#    Scenario: 06. Validate, Fill in the fields and Register
#    Given The FloowDrive app has been launched and open
#        Then Enter Email Address as "Subasri.sridharxx@gmail.com"
#        Then Enter Password as "Subasri1995"
#        Then Enter Repeat Password as "Subasri1995"
#        Then Enter First name as "Subasri"
#        Then Enter Surname as "Sridhar"
#        When scroll to Already registered
#        Then Enter Zipcode as "DD13EU"
#        And Go back
#        When scroll to Already registered
#        Then Click on Agree license
#        Then Click on Register button