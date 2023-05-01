package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigReader;
import utils.Log;

public class LeadsPage extends BasePage {
    @FindBy(xpath = "//a[@title='New Lead']")
    WebElement newLeadButton;

    @FindBy(xpath = "//input[@data-cy='first_name']")
    WebElement firstNameBox;

    @FindBy(xpath = "//input[@data-cy='last_name']")
    WebElement lastNameBox;

    @FindBy(xpath = "//input[@data-cy='company']")
    WebElement companyBox;

    @FindBy(xpath = "//input[@data-cy='email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='lead_email_opt_in']")
    WebElement optInEmailCheckBox;

    @FindBy(xpath = "//input[@id='lead_phone_number']")
    WebElement phoneBox;

    @FindBy(xpath = "//input[@id='lead_phone_number_extension']")
    WebElement extensionBox;

    @FindBy(xpath = "//select[@id='lead_event_style']")
    WebElement eventStyleDropDown;

    @FindBy(xpath = "//input[@id='dp_lead_event_date']")
    WebElement dateBox;

    @FindBy(xpath = "//input[@id='lead_start_time']")
    WebElement startTimeBox;

    @FindBy(xpath = "//input[@id='lead_end_time']")
    WebElement endTimeBox;

    @FindBy(xpath = "//input[@id='lead_event_description']")
    WebElement natureOfEventBox;

    @FindBy(xpath = "//input[@id='lead_guest_count']")
    WebElement guestCountBox;

    @FindBy(xpath = "//select[@data-cy='lead_source_select']")
    WebElement leadSourcesDropDown;

    @FindBy(xpath = "//option[contains(text(),'Repeat')]")
    WebElement repeatLeadSource;

    @FindBy(xpath = "//select[@data-cy='referral_source_select']")
    WebElement referredByDropDown;

    @FindBy(xpath = "//option[contains(text(),'Facebook')]")
    WebElement referredByFacebook;

    @FindBy(xpath = "//select[@id='lead_owned_by']")
    WebElement ownerDropDown;

    @FindBy(xpath = "//option[contains(text(),'Yen Tran')]")
    WebElement selectYenTran;

    @FindBy(xpath = "//a[contains(text(),'+ Add a manager')]")
    WebElement addManagerButton;

    @FindBy(xpath = "//input[@value='Create']")
    WebElement createButton;

    @FindBy(xpath = "//a[contains(text(),'@')]")
    WebElement leadEmailList;



    public void clickNewLead() {
        newLeadButton.click();
        Log.info("Clicked New Lead button");
    }

    public void enterFirstName() {
        firstNameBox.sendKeys(ConfigReader.getProperty("firstname"), Keys.TAB);
        Log.info("Enter first name");
    }

    public void enterLastName() {
        lastNameBox.sendKeys(ConfigReader.getProperty("lastname"), Keys.TAB);
        Log.info("Enter last name");
    }

    public void enterCompanyName() {
        companyBox.sendKeys(ConfigReader.getProperty("company"), Keys.TAB);
        Log.info("Enter Company");
    }

    public void enterEmail() {
        emailBox.sendKeys(ConfigReader.getProperty("email"), Keys.TAB);
        Log.info("Enter Email");
    }

    public void clickEmailOptIn() {
        optInEmailCheckBox.click();
        optInEmailCheckBox.sendKeys(Keys.TAB);
        Log.info("Click email opt in check box");
    }

    public void enterPhone() {
        phoneBox.sendKeys("4561234789", Keys.TAB);
        Log.info("Enter phone number");
    }

    public void enterExtension() {
        extensionBox.sendKeys("1234", Keys.TAB);
        Log.info("Enter extension number");
    }

    public void selectEventStyle() {
        eventStyleDropDown.click();
        Log.info("Select event style");
    }

    public void clickDateBox() {
        eventStyleDropDown.sendKeys(Keys.TAB);
        Log.info("Click date box");
    }

    public void enterDate() {
        dateBox.sendKeys("05/08/2023", Keys.TAB);
        Log.info("Enter event date");
    }

    public void enterStartTime() {
        startTimeBox.sendKeys("9:00am", Keys.TAB);
        Log.info("Enter event start time");
    }

    public void enterEndTime() {
        endTimeBox.sendKeys("3:00pm", Keys.TAB);
        Log.info("Enter event end time");
    }

    public void enterNatureOfEvent() {
        natureOfEventBox.sendKeys("Conference", Keys.TAB);
        Log.info("Enter nature of event");

    }

    public void enterGuestCount() {
        guestCountBox.sendKeys("300", Keys.TAB);
        Log.info("Enter number of guests");

    }

    public void selectLeadSource() {
        leadSourcesDropDown.click();
        repeatLeadSource.click();
        Log.info("Select lead source");
    }

    public void selectReferredBy() {
        referredByDropDown.click();
        referredByFacebook.click();
        Log.info("Select referred by");
    }

    public void selectLeadOwner() {
        ownerDropDown.click();
        selectYenTran.click();
        Log.info("Select lead owner");
    }

    public void clickAddManager() {
        addManagerButton.click();
        Log.info("Click add manager");

    }

    public void clickCreate() {
        createButton.click();
        Log.info("Click create button");

    }

    public void verifyLeadCreated() {
        String leadEmail = leadEmailList.getText();
        String expectedText = ConfigReader.getProperty("email");
        Assert.assertTrue(leadEmail.equals(expectedText));
        System.out.println(leadEmail);
        Log.info("New Lead is created ");
    }
}

