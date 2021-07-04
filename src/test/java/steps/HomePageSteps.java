package steps;

import pages.ContactUsPage;
import pages.HomePage;
import pages.SignInPage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    public SearchResultsSteps executeSearchByKeyword(String keyword) {
        homePage.pasteToSearchField(keyword);
        //searchPage.fillSearchField(keyword);
        //searchPage.clickSearchButtonOrPressEnter();
        homePage.pressEnter();
        return new SearchResultsSteps();
    }

    public HomePageSteps verifyIfCurrentPageIsHomePage(String text) {
        homePage.VerifyThatNoHomePage(text);
        return this;
    }

    public SignInPage goToSignIn(){
        homePage.signIn();
        return new SignInPage();
    }

    public ContactUsPage goToContactPage(){
        homePage.chooseContactPage();
        return new ContactUsPage();
    }



 /*   public SearchSteps openTooltip(){
        searchPage.moveToVoiceSearchButton();
        return this;
    }

    public SearchSteps verifyThatTooltipContainsProperText(String text){
     searchPage.assertThatVoiceSearchTooltipContainsText(text);
     return this;
    }*/
}
