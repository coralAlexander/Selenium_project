package steps;

import pages.MyAccountPage;
import pages.SignInPage;

public class SignInPageSteps {

    private SignInPage signInPage = new SignInPage();

    public MyAccountPage loginWithUserAndPassword(String user, String password){
        signInPage.fillUserName(user);
        signInPage.fillPassword(password);
        signInPage.pressSignInButton();
        return new MyAccountPage();
    }
}
