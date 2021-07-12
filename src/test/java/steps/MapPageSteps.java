package steps;

import pages.DriversPage;
import pages.ListViewPage;
import pages.MapPage;
import pages.MerchantPage;

public class MapPageSteps {

    private MapPage mapPage = new MapPage();

    public void urlVerification(String url){
     mapPage.verifyUrl(url);
    }

    public MerchantPage selectSettingFromDropDownMenu(){
        mapPage.selectSignInDropDown();
        mapPage.selectSettings();
        return new MerchantPage();
    }

    public DriversPage goToDriverPage(){
        mapPage.selectDrivers();
        return new DriversPage();
    }

    public MapPageSteps addOrder(){
        mapPage.addOrder();
        return this;
    }

    public ListViewPage goToListViewPage(){
        mapPage.pressListViewButton();
        return new ListViewPage();
    }
}
