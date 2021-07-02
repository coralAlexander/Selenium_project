package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;

    //public final static String DRIVER_PATH = "src/main/resources/";

    public static WebDriver getDriver(Browser browser){
        File file;
        switch (browser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
               /* file = new File(DRIVER_PATH +"chromedriver.exe");
                System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());*/
                driver = new ChromeDriver();
                break;
            case IE:
                WebDriverManager.iedriver().setup();
              /*  file = new File(DRIVER_PATH +"IEDriverServer.exe");
                System.setProperty("webdriver.ie.driver",file.getAbsolutePath());*/
                driver = new InternetExplorerDriver();
                break;
        }
       // driver.manage().window().maximize();
        return driver;
    }
}
