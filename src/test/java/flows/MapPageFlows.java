package flows;

import pages.DriversPage;
import pages.PlanningPage;
import pages.MapPage;
import pages.MerchantPage;

public class MapPageFlows {

    private MapPage mapPage = new MapPage();

    public MerchantPage selectSettingFromDropDownMenu(){
        mapPage.selectSignInDropDown();
        mapPage.selectSettings();
        return new MerchantPage();
    }

    public DriversPage goToDriverPage(){
        mapPage.selectDrivers();
        return new DriversPage();
    }

    public PlanningPage goToPlanningPage(){
        mapPage.pressListViewButton();
        return new PlanningPage();
    }

    public MapPageFlows waitForElement(){
        mapPage.waitForElement();
        return this;
    }
}
