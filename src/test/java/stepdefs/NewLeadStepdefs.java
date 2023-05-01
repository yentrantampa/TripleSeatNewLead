package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashBoardPage;
import pages.LeadsPage;
import pages.LoginPage;

public class NewLeadStepdefs {
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    LeadsPage leadsPage = new LeadsPage();

    @Given("User is on sign in page")
    public void userIsOnSignInPage() {
        loginPage.onSignInPage();
    }

    @When("User enter valid username and valid password")
    public void userEnterValidUsernameAndValidPassword() {
        loginPage.doLogin();
    }

    @And("User clicks on sign in button")
    public void userClicksOnSignInButton() {
        loginPage.clickSignIn();
    }

    @And("User is on Dashboard page")
    public void userIsOnDashboardPage() {
        dashBoardPage.verifyDashBoardPage();
    }

    @And("User click on New Lead button")
    public void userClickOnNewLeadButton() {
        leadsPage.clickNewLead();

    }
    @And("User input first name")
    public void userEnterFistName() {
        leadsPage.enterFirstName();
    }

    @And("User input last name")
    public void userInputLastName() {
        leadsPage.enterLastName();
    }

    @And("User input company name")
    public void userInputCompanyName() {
        leadsPage.enterCompanyName();
    }

    @And("User input email")
    public void userInputEmail() {
        leadsPage.enterEmail();
    }

    @And("User click on Opt in for Mass Emails")
    public void userClickOnOptInForMassEmails() {
        leadsPage.clickEmailOptIn();
    }

    @And("User input phone number")
    public void userInputPhoneNumber() {
        leadsPage.enterPhone();
    }

    @And("User input extension number")
    public void userInputExtensionNumber() {
        leadsPage.enterExtension();
    }

    @And("User click on Event Style")
    public void userClickOnEventStyle() {
        leadsPage.selectEventStyle();
    }

    @And("User click on Date box")
    public void userClickOnDateBox() {
        leadsPage.clickDateBox();
    }

    @And("User enters Date in Calendar box")
    public void userSelectDateInCalendarBox() {
        leadsPage.enterDate();
    }

    @And("User input Start Time")
    public void userInputStartTime() {
        leadsPage.enterStartTime();
    }

    @And("User input End Time")
    public void userInputEndTime() {
        leadsPage.enterEndTime();
    }

    @And("User input Nature of Event")
    public void userInputNatureOfEvent() {
        leadsPage.enterNatureOfEvent();
    }

    @And("User input number of guests")
    public void userInputNumberOfGuests() {
        leadsPage.enterGuestCount();
    }

    @And("User select source from Lead Source dropdown")
    public void userSelectSourceFromLeadSourceDropdown() {
        leadsPage.selectLeadSource();
    }

    @And("User select source from Referred By")
    public void userSelectFromReferredBy() {
        leadsPage.selectReferredBy();

    }

    @And("User select source from Owner")
    public void userSelectFromOwner() {
        leadsPage.selectLeadOwner();
    }

    @And("User click on + Add A Manager")
    public void userClickOnAddAManager() {
        leadsPage.clickAddManager();
    }

    @And("User click on Create button")
    public void userClickOnCreateButton() {
        leadsPage.clickCreate();
    }

    @Then("User should see the new lead successfully created on Leads page")
    public void userShouldSeeTheNewLeadSuccessfullyCreatedOnLeadsPage() {
        leadsPage.verifyLeadCreated();

    }
}
