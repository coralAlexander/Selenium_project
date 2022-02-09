package tests;

import flows.LoginPageFlows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;
import utils.HelpMethods;
import verification.Verification;

import static utils.PropertyReader.getBrowser;
import static utils.PropertyReader.getLoginUrl;

public abstract class BaseTest {

    private static WebDriver driver;
    protected Verification verification;
    private WebDriverWait wait;
    protected HelpMethods helpMethods;

    LoginPageFlows loginPageFlows;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod()
    public void setUp() {
        driver = DriverFactory.getDriver(getBrowser());
        driver.get(getLoginUrl());
        loginPageFlows = new LoginPageFlows();
        wait = new WebDriverWait(driver,5);
        verification = new Verification(wait);
        helpMethods = new HelpMethods(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
