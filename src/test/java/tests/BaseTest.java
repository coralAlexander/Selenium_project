package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import flows.*;
import utils.DriverFactory;
import utils.HelpMethods;
import verification.Verification;

import static utils.PropertyReader.*;
import static utils.PropertyReader.getPassword;

public abstract class BaseTest {

    private static WebDriver driver;
    protected Verification verification;
    private WebDriverWait wait;
    protected HelpMethods helpMethods;


    LoginPageFlows loginPageFlows;
    MapPageFlows mapPageFlows;
    MerchantPageFlows merchantPageFlows;
    MerchantConfigPageFlows merchantConfigPageFlows;
    DriversPageFlows driversPageFlows;
    TeamsPageFlows teamsPageFlows;
    PlanningPageFlows planningPageFlows;


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass()
    public void setUp() {
        driver = DriverFactory.getDriver(getBrowser());
        driver.get(getLoginUrl());
        loginPageFlows = new LoginPageFlows();
        mapPageFlows = new MapPageFlows();
        merchantPageFlows = new MerchantPageFlows();
        merchantConfigPageFlows = new MerchantConfigPageFlows();
        driversPageFlows = new DriversPageFlows();
        teamsPageFlows = new TeamsPageFlows();
        planningPageFlows = new PlanningPageFlows();
        wait = new WebDriverWait(driver,5);
        verification = new Verification(wait);
        helpMethods = new HelpMethods(driver);
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
