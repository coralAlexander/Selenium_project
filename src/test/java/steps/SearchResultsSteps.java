package steps;

import pages.SearchResultPage;

public class SearchResultsSteps {

    private SearchResultPage searchResultPage = new SearchResultPage();

    public SearchResultsSteps verifyThatTopResultContainsCorrectText(String text) {
        searchResultPage.assertThatResultContainsCorrectText(text);
        return this;
    }

    public SearchResultsSteps verifyThatTopResultContainsProperAttributeText(String text) {
        searchResultPage.assertThatResultContainsProperAttributeText(text);
        return this;
    }

    public SearchSteps goHome(){
        searchResultPage.clickGoHomeButton();
        return new SearchSteps();
    }

}

