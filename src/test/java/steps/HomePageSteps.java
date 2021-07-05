package steps;

import pages.ContactUsPage;
import pages.HomePage;
import pages.SignInPage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    public SearchResultsSteps executeSearchByKeyword(String keyword) {
        homePage.pasteToSearchField(keyword);
        homePage.pressEnter();
        return new SearchResultsSteps();
    }

    public HomePageSteps verifyIfCurrentPageIsHomePage(String text) {
        homePage.VerifyThatNoHomePage(text);
        return this;
    }

    public SignInPage goToSignIn() {
        homePage.signIn();
        return new SignInPage();
    }

    public ContactUsPage goToContactPage() {
        homePage.chooseContactPage();
        return new ContactUsPage();
    }
}
