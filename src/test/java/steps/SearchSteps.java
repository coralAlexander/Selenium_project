package steps;

import pages.SearchPage;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    public  SearchResultsSteps executeSearchByKeyword(String keyword) throws InterruptedException {
        searchPage.pasteToSearchField(keyword);
        //searchPage.fillSearchField(keyword);
        //searchPage.clickSearchButtonOrPressEnter();
        searchPage.pressEnter();
        return new SearchResultsSteps();
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
