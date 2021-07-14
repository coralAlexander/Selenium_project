package steps;

import pages.DriversPage;
import pages.TeamsPage;

public class DriversPageSteps {

    private DriversPage driversPage = new DriversPage();

    public TeamsPage goToTeams(){
        driversPage.selectTeams();
        return new TeamsPage();
    }

    public DriversPageSteps addDriver(String driverName,String title,String driverPhone,String driverEmail,String driverPassword,int numOfDrivers){
        driversPage.pushAddDriverButton();
        driversPage.fillDriverName(driverName);
        driversPage.fillDriverTitle(title);
        driversPage.fillDriverPhone(driverPhone);
        driversPage.validateDriverByOption();
        driversPage.selectEmailPasswordValidation();
        driversPage.fillDriverEmailField(driverEmail);
        driversPage.fillDriverPasswordField(driverPassword);
        driversPage.pressAddDriverButton();
        driversPage.confirmDriverCreation();
        driversPage.getNameFromTable(driverName);
        driversPage.verifyNumberOfDrivers(numOfDrivers);
        return this;
    }
}
