package tests;

import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void openWebSiteAndFoundResult(String text) {
        homePageSteps.executeSearchByKeyword(text).verifyThatTopResultContainsCorrectText("1 result has been found.")
                .verifyThatTopResultContainsProperAttributeText("true");
    }

    @Test(dataProvider = "dataProvider")
    public void openResultPageAndClickOnHomeButton(String text) {
        homePageSteps.executeSearchByKeyword(text).goHome();
        homePageSteps.verifyIfCurrentPageIsHomePage("http://automationpractice.com");
    }

    @Test
    public void loginWithUserPassword(){
        homePageSteps.goToSignIn();
        signInPageSteps.loginWithUserAndPassword("sector2727@gmail.com","123456").verifyThatCurrentPageIsMyAccountPage();
    }
}
