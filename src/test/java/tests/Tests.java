package tests;

import org.testng.annotations.Test;

import static utils.PropertyReader.getLandingPageUrl;
import static utils.PropertyReader.getLoginUrl;

public class Tests extends BaseTest {

    private final static String TEAM_NAME = "Test Team";
    private final static String ADDRESS = "Tel Aviv";
    private final static String TEST_TITLE = "Test title";
    private final static String TEST_PHONE_NUM = "0546789099";
    private final static String DRIVER_EMAIL = "@driver.com";
    private final static String DRIVER_PASSWORD = "123456";
    private final static String TO_WHOM = "test" ;
    private final static String EXTERNAL_ID = "33333";


    @Test(priority = 1)
    public void loginPageVerification(){
        verification.assertCurrentPageUrl(helpMethods.getCurrentUrl(), getLoginUrl());
    }

    @Test(priority = 2)
    public void successfullyLoginRedirectToMapPage() {
        mapPageFlows.waitForElement();
        verification.assertCurrentPageUrl(helpMethods.getCurrentUrl(), getLandingPageUrl());
    }

    @Test(priority = 3)
    public void cleanupAccountAndEnablePlanning() {
        mapPageFlows.selectSettingFromDropDownMenu();
        merchantPageFlows.cleanAccountFromDrivers().selectMerchantConfiguration();
        merchantConfigPageFlows.selectCheckBoxPlanningPhaseBeforeExecution();
        verification.assertThatCheckBoxChecked(merchantConfigPageFlows.getCheckBoxPlanningPhaseBeforeExecutionElement());
    }

    @Test(priority = 4)
    public void createANewTeam() {
        String description = helpMethods.generateString();
        mapPageFlows.goToDriverPage();
        driversPageFlows.goToTeams();
        teamsPageFlows.addTeam(TEAM_NAME, description, ADDRESS);
        verification.assertThatANewTeamAdded(teamsPageFlows.getTeams(), description);
    }

    @Test(priority = 5)
    public void addDrivers() {
        String driverName1 = helpMethods.generateString();
        String driverName2 = helpMethods.generateString();
        mapPageFlows.goToDriverPage();
        driversPageFlows.addDriver(driverName1, TEST_TITLE, TEST_PHONE_NUM, helpMethods.generateString() + DRIVER_EMAIL, DRIVER_PASSWORD, 1);
        verification.assertThatDriverAdded(driversPageFlows.getDriversNames(), driverName1);
        driversPageFlows.addDriver(driverName2, TEST_TITLE, TEST_PHONE_NUM, helpMethods.generateString() + DRIVER_EMAIL, DRIVER_PASSWORD, 2);
        verification.assertThatDriverAdded(driversPageFlows.getDriversNames(), driverName2);
    }

    @Test(priority = 6)
    public void createOrder() {
        mapPageFlows.goToPlanningPage();
        planningPageFlows.addOrder(TEAM_NAME, ADDRESS, TEST_TITLE, helpMethods.generateString() + DRIVER_EMAIL, TO_WHOM,EXTERNAL_ID);
        verification.assertNumberOfOrder(planningPageFlows.getNumberOfOrdersElement(), 1);
    }
}
