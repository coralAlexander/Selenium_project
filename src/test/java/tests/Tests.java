package tests;

import org.testng.annotations.Test;

import static utils.PropertyReader.getPassword;
import static utils.PropertyReader.getUser;

public class Tests extends BaseTest {

    private final static String expectedLandingPage = "https://nbvxuserportalstag.z6.web.core.windows.net/home";


    @Test(priority = 1)
    public void loginVerificationHappyFlow(){
        loginPageFlows.loginWithUserPassword(getUser(), getPassword());
        verification.assertCurrentPageUrl(helpMethods.getCurrentUrl(), expectedLandingPage);
    }

    @Test(priority = 2)
    public void loginUnHappyFlowInvalidUserPassword(){
       loginPageFlows.loginFailed("user", "password2222222");
    }

    @Test(priority = 3)
    public void userNameFieldWrongNumberOfCharacters(){
         verification.assertWrongQuantityOfCharactersInUserNameField(loginPageFlows.missedCharacters("err"), "Invalid or missing user name.");
    }

    @Test(priority = 4)
    public void passwordFieldWrongNumberOfCharacters(){
        verification.assertWrongQuantityOfCharactersInPasswordField(loginPageFlows.missedPasswordCharacters( "sds1"), "Missing password.");
    }
}
