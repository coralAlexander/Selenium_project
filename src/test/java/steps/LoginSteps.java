package steps;

import pages.MapPage;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    public MapPage loginWithUserPasswordAndVerifyUrl(String userName, String password, String url){
        loginPage.verifyUrl(url);
        loginPage.fillUserName(userName);
        loginPage.fillPassword(password);
        loginPage.pressLoginButton();
        return new MapPage();
    }
}
