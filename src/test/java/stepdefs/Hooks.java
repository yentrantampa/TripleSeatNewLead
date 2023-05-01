package stepdefs;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverUtils;
import io.cucumber.java.After;
import utils.Log;

public class Hooks {

  @Before
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.initDriver();
      Log.info("Driver set up");


    }

@After
    public void quit(){
        DriverUtils.getDriver().quit();
    }
}
