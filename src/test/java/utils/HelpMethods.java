package utils;

import org.openqa.selenium.WebDriver;

public class HelpMethods {

    WebDriver driver;

    public HelpMethods( WebDriver driver) {
        this.driver=driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
