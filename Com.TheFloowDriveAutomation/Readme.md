# Mobile Application using Appium, Cucumber, TestNG, Selenium WebDriver

Tools and libraries used

Intellij : - Integrated Development Environment

Maven: - Build tool

TestNg: - TestNg Java testing framework

Appium: - Mobile Native app, Hybrid App, Web app

Android SDK

Android Virtual Device Manager

NodeJS

Java 8 JDK

Cucumber-JVM:- BDD Framework

Selenium WebDriver: - Browser automation framework

UI Automator viewer is used Inspect elements on Android

## Intellij plugins

Configured and Installed Following Plugins

Cucumber for Java

Gherkin 

# Framework Setup

1. Create a maven project add the dependencies, plugins and packages to POM.xml of the project

   1. Add cucumber dependencies jar/plugin

      1. ##### Cucumber-Java

      2. ##### Cucumber-JVM-Deps

      3. ##### Cucumber-TestNG

      4. ##### Cucumber-Reporting

   2. Add TestNG Dependencies 

   3. Add Selenium WebDriver Dependencies - Selenium Java

   4. Add Appium Dependencies Appium Java Client

   5. Add Maven Dependencies Maven-Resources-Plugin and Maven-Surefire-Plugin

   6. Other dependencies as Log4J and Log4J-API for Logging, Google Core Libraries for Java , Gson

2.  Packages & Directory Structure

   <img src="C:\Users\91979\AppData\Roaming\Typora\typora-user-images\image-20200331103435153.png" alt="image-20200331103435153" style="zoom:50%;" />



## Running tests

Clone github and set up the env as in above. Then,

Run a test using

> mvn test



## Test Report

Verify Test reports from <*Project>\target\cucumber-reports\advanced-reports\cucumber-html-reports 

<img src="C:\Users\91979\AppData\Roaming\Typora\typora-user-images\image-20200331115601133.png" alt="image-20200331115601133" style="zoom:50%;" />



## Logging

In the framework I have used  Log4J2 for config file and use it to configure our logging to the console

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration>
    <Appenders>
        <Console name="Console">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} %-5level %c{1} -%msg%n"/>
        </Console>
        <RollingFile name="RollingFile" fileName="log/CrunchifyTest.log"
                     filePattern="$target/Logfile/AppiumLogFile%d{YYYYMMddHHmmss}-fargo.log">
            <PatternLayout pattern="%d{YYYY-MM-dd HH:mm:ss} [%t] %-5p %c{1}:%L - %msg%n" />
            <Policies>
                <SizeBasedTriggeringPolicy size="100 MB" />
            </Policies>
            <DefaultRolloverStrategy max="20" />
        </RollingFile>
    </Appenders>
    <Loggers>
        <Logger name="log4j.test.Log4jTest" level="trace">
            <AppenderRef ref="Console"/>
        </Logger>
        <Root level="trace">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
```



## Work in Progress

The framework is not considered to continue if one test fails 

The page objects are as a part of each page now which in future should be put together in a separate file