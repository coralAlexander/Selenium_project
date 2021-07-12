package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import pages.DriversPage;
import pages.MerchantPage;
import steps.*;
import utils.DriverFactory;
import verification.Verification;

import static utils.PropertyReader.getBaseUrl;
import static utils.PropertyReader.getBrowser;

public abstract class BaseTest {

    private static WebDriver driver;

    LoginSteps loginSteps;
    MapPageSteps mapPageSteps;
    MerchantPageSteps merchantPageSteps;
    MerchantConfigPageSteps merchantConfigPageSteps;
    DriversPageSteps driversPageSteps;
    TeamsPageSteps teamsPageSteps;
    ListViewPageSteps listViewPageSteps;


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(getBrowser());
        driver.get(getBaseUrl());
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        loginSteps = new LoginSteps();
        mapPageSteps = new MapPageSteps();
        merchantPageSteps = new MerchantPageSteps();
        merchantConfigPageSteps = new MerchantConfigPageSteps();
        driversPageSteps = new DriversPageSteps();
        teamsPageSteps = new TeamsPageSteps();
        listViewPageSteps = new ListViewPageSteps();

    }

    @AfterClass
    public void tearDown() {

        //driver.quit();
    }

    @AfterMethod
    public void goBack() {

        //driver.navigate().back();
    }

    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"Blouse"}};
    }


}
