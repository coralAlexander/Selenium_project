package steps;

import pages.HomePage;

public class SearchSteps {

    HomePage homePage = new HomePage();

    public SearchResultsSteps executeSearchByKeyword(String keyword) {
        homePage.pasteToSearchField(keyword);
        //searchPage.fillSearchField(keyword);
        //searchPage.clickSearchButtonOrPressEnter();
        homePage.pressEnter();
        return new SearchResultsSteps();
    }

    public SearchSteps verifyIfCurrentPageIsHomePage(String text) {
        homePage.VerifyThatNoHomePage(text);
        return this;
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
