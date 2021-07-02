package tests;

import org.testng.annotations.Test;

public class SearchTest extends  BaseTest {

     @Test(dataProvider = "dataProvider")
     public void openWebSiteAndFoundResult(String text) throws InterruptedException {
       steps.executeSearchByKeyword(text).verifyThatTopResultContainsCorrectText("1 result has been found.")
               .verifyThatTopResultContainsProperAttributeText("true");
    }

    @Test(dataProvider = "dataProvider")
    public void openResultPageAndClickOnHomeButton(String text) throws InterruptedException {
         steps.executeSearchByKeyword(text).goHome();
         steps.verifyIfCurrentPageIsHomePage("http://automationpractice.com");
    }

    @Test
    public void creditSlipsPageOpened(){
      myCreditSlipsSteps.verifyThatCurrentPageIsMyCreditSlips("CREDIT SLIPS");
    }
}
