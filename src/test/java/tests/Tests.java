package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class Tests extends BaseTest {


    @Test
    public void successfullyLoginRedirectToMapPage() {
        loginSteps.loginWithUserPassword("candidate@bringg.com", "Candidate123!", "https://app.bringg.com/#/login/");
        mapPageSteps.urlVerification("https://app.bringg.com/#/map/");
    }

    @Test
    public void cleanupAccountAndEnablePlanning() {
        loginSteps.loginWithUserPassword("candidate@bringg.com", "Candidate123!", "https://app.bringg.com/#/login/");
        mapPageSteps.selectSettingFromDropDownMenu();
        merchantPageSteps.cleanAccountFromDrivers().selectMerchantConfiguration();
        merchantConfigPageSteps.selectCheckBoxPlanningPhaseBeforeExecution();
    }

    @Test
    public void createANewTeam() {
        loginSteps.loginWithUserPassword("candidate@bringg.com", "Candidate123!", "https://app.bringg.com/#/login/");
        mapPageSteps.goToDriverPage();
        driversPageSteps.goToTeams();
        teamsPageSteps.addTeam("Test Team", "Test description", "Tel Aviv");
    }

    @Test
    public void addDrivers() {
        loginSteps.loginWithUserPassword("candidate@bringg.com", "Candidate123!", "https://app.bringg.com/#/login/");
        mapPageSteps.goToDriverPage();
        driversPageSteps.addDriver(generateDriverName(), "Test title", "0546789099", generateDriverName()+"@driver.com", "123456",1);
        driversPageSteps.addDriver(generateDriverName(), "Test title", "0546789099", generateDriverName()+"@driver.com", "123456",2);
    }

    @Test
    public void createOrder(){
        loginSteps.loginWithUserPassword("candidate@bringg.com", "Candidate123!", "https://app.bringg.com/#/login/");
        mapPageSteps.goToListViewPage();
        listViewPageSteps.addOrder("Test Team","Tel Aviv","Test Title",1);

    }

    @Test
    public void dragAndDrop(){
        loginSteps.loginWithUserPassword("candidate@bringg.com", "Candidate123!", "https://app.bringg.com/#/login/");
        mapPageSteps.goToListViewPage();
        listViewPageSteps.dragAndDropElement();
    }

    private String generateDriverName(){
       return RandomStringUtils.random(5, true, false);
    }

}
