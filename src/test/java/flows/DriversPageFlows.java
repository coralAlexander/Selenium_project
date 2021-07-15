package flows;

import org.openqa.selenium.WebElement;
import pages.DriversPage;
import pages.TeamsPage;

import java.util.List;

public class DriversPageFlows {

    private DriversPage driversPage = new DriversPage();

    public TeamsPage goToTeams(){
        driversPage.selectTeams();
        return new TeamsPage();
    }

    public DriversPageFlows addDriver(String driverName, String title, String driverPhone, String driverEmail, String driverPassword, int numOfDrivers){
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
        return this;
    }

    public List<WebElement> getDriversNames(){
       return driversPage.getDriversNames();
    }

}
