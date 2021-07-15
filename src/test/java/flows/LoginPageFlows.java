package flows;

import pages.MapPage;
import pages.LoginPage;

public class LoginPageFlows {

    private LoginPage loginPage = new LoginPage();

    public MapPage loginWithUserPassword(String userName, String password){
        loginPage.fillUserName(userName);
        loginPage.fillPassword(password);
        loginPage.pressLoginButton();
        return new MapPage();
    }
}
