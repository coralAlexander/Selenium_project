package flows;

import org.openqa.selenium.WebElement;
import pages.LandingPage;
import pages.LoginPage;

public class LoginPageFlows {

    private LoginPage loginPage = new LoginPage();

    public LandingPage loginWithUserPassword(String userName, String password){
        login(userName,password);
        return new LandingPage();
    }

    public LoginPageFlows loginFailed(String userName, String password){
        login(userName,password);
        loginPage.doScreenshot();
        return  this;
    }

    public WebElement missedCharacters(String userName){
        loginPage.fillUserName(userName);
        loginPage.clickOnPasswordField();
        loginPage.clickOnUserNameField();
        return  loginPage.getWrongUserName();
    }

    public WebElement missedPasswordCharacters(String userName){
        loginPage.fillUserName(userName);
        loginPage.clickOnPasswordField();
        loginPage.clickOnUserNameField();
        return  loginPage.getMissingPasswordErrorMessage();
    }

    public void login(String userName, String password) {
        loginPage.fillUserName(userName);
        loginPage.fillPassword(password);
        loginPage.pressLoginButton();
    }
}
