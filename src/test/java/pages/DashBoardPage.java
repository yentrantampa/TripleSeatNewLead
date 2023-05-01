package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Log;

public class DashBoardPage extends BasePage{
    @FindBy (xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardTitle;

    public void verifyDashBoardPage(){
        String actualTitle = dashBoardTitle.getText();
        String expectedText = "Dashboard";
        Assert.assertTrue(actualTitle.equals(expectedText));
        System.out.println(actualTitle);
        Log.info("Dashboard page verified");
    }

}
