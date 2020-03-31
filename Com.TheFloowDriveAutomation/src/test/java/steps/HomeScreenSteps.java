package steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import org.testng.Assert;
import pages.BasePage;
import pages.Page;

import pages.RegistrationPage;
import pages.HomeScreenPages;

import java.util.List;

import static utils.extensions.MobileElementExtensions.waitForSecs;

public class HomeScreenSteps extends Page {

    @And("^Recorder and Pause buttons are clickable$")
    public void verifyRecAndPausebutton() throws Throwable {
        instanceOf(HomeScreenPages.class).isRecAndPausebuttonEnabled();
    }
    @And("^Swipe check the following scoring methodology$")
    public void verifyScoringMethodology(List<String> existsInPageSource) throws InterruptedException {
        instanceOf(HomeScreenPages.class).validateMultipleInPageSources(existsInPageSource);
    }

    @And("^Verify \"([^\"]*)\" numbers of \"([^\"]*)\"$")
    public void verifyNoTrips(String no,String trips) throws Throwable {
            instanceOf(HomeScreenPages.class).verifyNoTrips(no,trips);
    }

    @And("^Verify \"([^\"]*)\".\"([^\"]*)\" numbers of \"([^\"]*)\"$")
    public void verifyNoMiles(String no1,String no2,String miles) throws Throwable {
        instanceOf(HomeScreenPages.class).verifyNoMiles(no1,no2,miles);
    }
    @And("click on \"ALLOW\"")
    public void clickonAllowPermissions() throws Throwable {
        instanceOf(HomeScreenPages.class).clickonAllowPermissions();
    }
    @And("click on \"Settings\"")
    public void clickonSettings() throws Throwable {
        instanceOf(HomeScreenPages.class).clickonSettings();
    }
    @And("Go back")
    public void GoBack() throws Throwable {
        instanceOf(HomeScreenPages.class).GoBack();
    }
    @And("swipe left")
    public void swipeLeft() throws Throwable {
        instanceOf(HomeScreenPages.class).swipeLeft();
    }


}