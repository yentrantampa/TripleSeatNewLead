package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Log;


public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='login']")
    WebElement userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordBox;

    @FindBy(xpath = "//input[@name='commit']")
    WebElement signInButton;


    public void onSignInPage() {
        driver.get(ConfigReader.getProperty("url"));
        Log.info("User navigated to URL");
    }

    public void doLogin() {
        userNameBox.sendKeys(ConfigReader.getProperty("username") + Keys.TAB);
        passwordBox.sendKeys(ConfigReader.getProperty("password") + Keys.TAB);
        Log.info("User enters username and password");
    }

    public void clickSignIn() {
        signInButton.click();
        Log.info("User clicks on sign in");
    }
}
