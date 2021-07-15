package utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;


public class HelpMethods {

    WebDriver driver;

    public HelpMethods( WebDriver driver) {
        this.driver=driver;
    }

    public String generateString(){
        return RandomStringUtils.random(5, true, false);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
