package utils;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static void initProperties() {
//        FileInputStream fs = null;
        try {
            FileReader fr = new FileReader("src/test/resources/configuration.properties");
            prop = new Properties();
            prop.load(fr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){

        return prop.getProperty(key);
    }

}


