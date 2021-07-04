package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private static final String PATH_TO_PROPERTY = "src/test/resources/framework.properties";

    public static String getBaseUrl() {
        return getProperty("url");
    }

    public static String getPathToUploadFile(){
        return getProperty("pathToUploadFile");
    }

    public static Browser getBrowser() {
        return Browser.valueOf(getProperty("browser"));
    }

    private static String getProperty(String propertyName) {
        if (System.getProperty(propertyName) == null) {
            return getPropertyFromFile(propertyName);
        } else {
            return System.getProperty(propertyName);
        }
    }

    private static String getPropertyFromFile(String propertyName) {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new
                    FileInputStream(PATH_TO_PROPERTY);
            prop.load(input);
        } catch (IOException ex) {
            System.out.println("Cannot read property value for " +
                    propertyName);
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop.getProperty(propertyName);
    }
}
