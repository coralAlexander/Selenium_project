package tests;

import org.testng.annotations.Test;

public class SearchTest extends  BaseTest {

     @Test(dataProvider = "dataProvider")
     public void openGoogleComInChromeTest(String text) throws InterruptedException {
       steps.executeSearchByKeyword(text).verifyThatTopResultContainsCorrectText("1 result has been found.")
               .verifyThatTopResultContainsProperAttributeText("true");
    }



   /* @Test
    public void verifySearchByVoiceTooltip(){
        steps.openTooltip().verifyThatTooltipContainsProperText("חיפוש קולי");
    }*/
}
