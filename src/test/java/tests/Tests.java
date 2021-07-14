package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class Tests extends BaseTest {


    @Test
    public void successfullyLoginRedirectToMapPage() {
        mapPageSteps.urlVerification("https://app.bringg.com/#/map/");
    }

    @Test
    public void cleanupAccountAndEnablePlanning() {
        mapPageSteps.selectSettingFromDropDownMenu();
        merchantPageSteps.cleanAccountFromDrivers().selectMerchantConfiguration();
        merchantConfigPageSteps.selectCheckBoxPlanningPhaseBeforeExecution();
    }

    @Test
    public void createANewTeam() {
        mapPageSteps.goToDriverPage();
        driversPageSteps.goToTeams();
        teamsPageSteps.addTeam("Test Team",generateString(), "Tel Aviv",1);
    }

    @Test
    public void addDrivers() {
        mapPageSteps.goToDriverPage();
        driversPageSteps.addDriver(generateString(), "Test title", "0546789099", generateString()+"@driver.com", "123456",1);
        driversPageSteps.addDriver(generateString(), "Test title", "0546789099", generateString()+"@driver.com", "123456",2);
    }

    @Test
    public void createOrder(){
        mapPageSteps.goToPlanningPage();
        planningPageSteps.addOrder("Test Team","Tel Aviv","Test Title",1,"test@test.com","test");

    }

  /*  @Test
    public void dragAndDrop(){
        mapPageSteps.goToPlanningPage();
        planningPageSteps.dragAndDropElement();
    }*/

    private String generateString(){
       return RandomStringUtils.random(5, true, false);
    }

}
