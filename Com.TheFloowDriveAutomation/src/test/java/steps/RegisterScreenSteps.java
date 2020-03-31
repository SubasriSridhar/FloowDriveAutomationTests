package steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import pages.BasePage;
import pages.Page;
import pages.RegistrationPage;
import utils.appium.Driver;

import java.util.List;

public class RegisterScreenSteps extends Page {

    AndroidDriver driver = Driver.appDriver();

    @Then("^the app page has following$")
    public void assertTexts(List<String> existsInPageSource) throws InterruptedException {
        instanceOf(RegistrationPage.class).validateMultipleInPageSource1(existsInPageSource);
    }
    @When("^scroll to ([^\"]*)$")
    public void alreadyRegistered(String str) throws Throwable {
    instanceOf(RegistrationPage.class).alreadyRegistered(str);
    }
    @Then("Enter Email Address as \"([^\"]*)\"")
    public void enterEmailAddress(String arg3) throws Throwable{
        instanceOf(RegistrationPage.class).enterEmailAddress(arg3);
    }
    @Then("Enter Password as \"([^\"]*)\"")
    public void enterPassword(String arg3) throws Throwable{
        instanceOf(RegistrationPage.class).enterPassword(arg3);
    }
    @Then("Enter Repeat Password as \"([^\"]*)\"")
    public void repeatPassword(String arg3) throws Throwable{
        instanceOf(RegistrationPage.class).repeatPassword(arg3);
    }
    @Then("Enter First name as \"([^\"]*)\"")
    public void firstName(String arg3) throws Throwable{
        instanceOf(RegistrationPage.class).firstName(arg3);
    }
    @Then("Enter Surname as \"([^\"]*)\"")
    public void surName(String arg3) throws Throwable{
        instanceOf(RegistrationPage.class).surName(arg3);
    }
    @Then("Tap on Date of birth")
    public void tapDOB() throws Throwable{
        instanceOf(RegistrationPage.class).tapDOB();
    }
    @Then("Enter Zipcode as \"([^\"]*)\"")
    public void enterZip(String arg1) throws Throwable{
        instanceOf(RegistrationPage.class).enterZip(arg1);

    }
    @Then("Click on Agree license")
    public void agreeLicense() throws Throwable{
        instanceOf(RegistrationPage.class).agreeLicense();
    }
    @Then("Click on Register button")
    public void clickRegister() throws Throwable{
        instanceOf(RegistrationPage.class).clickRegister();
    }
//    @Then("Click Grant Permissions")
//    public void clickGrantPermission() throws Throwable{
//        instanceOf(RegistrationPage.class).clickGrantPermission();
//    }

}