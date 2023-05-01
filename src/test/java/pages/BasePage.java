package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

import java.util.logging.Logger;

public class BasePage {

    WebDriver driver = DriverUtils.getDriver();
static Logger logger = Logger.getGlobal();
    public BasePage(){
        PageFactory.initElements(driver,this);
    }
}


