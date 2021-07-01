package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchPage extends BasePages {

    @FindBy(name = "search_query")
    private WebElement searchField;

    @FindBy(css = "a[title='My Store']")
    private WebElement myStore;

    public SearchPage() {
        super();
    }

    public void fillSearchField(String text) {
        searchField.click();
        searchField.sendKeys(text);
    }

    public void pressEnter(){
        searchField.sendKeys(Keys.RETURN);
    }

    public void pasteToSearchField(String text){
      pasteTextToElementFromClipBoard(searchField,text);
    }

    public void VerifyThatNoHomePage(String expected){
            assertThat(myStore.getAttribute("origin"))
                    .as("Wrong attribute text!").contains(expected);

    }

   /* public void moveToVoiceSearchButton(){
        builder.moveToElement(searchByVoiceButton).build().perform();
    }
*/
    /*public void assertThatVoiceSearchTooltipContainsText(String text){
       assertThat(pageBody.findElements(By.xpath("//*[contains(text(),'"+text+"')]")).size())
               .as("Expected tooltip ["+text+"] was not found").isNotZero();
    }*/

    /*public void clickSearchButtonOrPressEnter() throws InterruptedException {
        if(isElementFound(By.name("btnI"),3)){
            wait.until(ExpectedConditions.elementToBeClickable(searchButton));
            searchButton.click();
        }
        else {
            pressEnter();
        }
    }*/
}
