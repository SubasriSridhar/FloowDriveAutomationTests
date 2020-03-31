package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import pages.Page;
import pages.BasePage;

public class BaseSteps extends Page {
    @Given("^The FloowDrive app has been launched and open$")
    public void isBrandingLogoPresent() throws Throwable {
        instanceOf(BasePage.class).appFullyLaunched();
    }
    @And("^the \"([^\"]*)\" text is available in Registration screen$")
    public void isRegistrationTextPresent(String registrationText) throws Throwable {
        instanceOf(BasePage.class).validateRegistrationText(registrationText);
    }
    @When("^click on \"([^\"]*)\" button")
    public void alreadyLogin(String str) throws Throwable {
        instanceOf(BasePage.class).clickAlreadyLogin(str);
    }

    @Then("^the \"([^\"]*)\" text is available in Login Screen$")
    public void validateLoginText(String loginText) throws Throwable {
        instanceOf(BasePage.class).validateLoginText(loginText);
    }
    @Then("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void enterLoginCredentials(String arg1, String arg2) throws Throwable{
        instanceOf(BasePage.class).enterLoginCredentials(arg1,arg2);
    }
    @And("^verify login is disabled$")
    public void isLoginButtonDisabled(){
        instanceOf(BasePage.class).isLoginButtonDisabled();
    }
    @And("^click on login$")
    public void clickLogin() throws InterruptedException {
        instanceOf(BasePage.class).clickLogin();

    }
    @Then("^Verify invalid credentials title as \"([^\"]*)\" and Verify invalid credentials text as \"([^\"]*)\"$")
    public void verifyInvalidloginAlert(String invalidLoginTitle,String invalidContent) throws Throwable {
        instanceOf(BasePage.class).verifyInvalidloginAlert(invalidLoginTitle,invalidContent);
    }
    @And("^Click on button OK$")
    public void clickInvalidloginOK() throws InterruptedException {
        instanceOf(BasePage.class).clickInvalidloginOK();
    }

    @When("^click go back$")
    public void goBack() throws InterruptedException {
        instanceOf(BasePage.class).clickBackButton();
    }
}