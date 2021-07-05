package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HomePage extends BasePages {

    @FindBy(name = "search_query")
    private WebElement searchField;

    @FindBy(css = "a[title='My Store']")
    private WebElement myStore;

    @FindBy(css = "a[title='My credit slips']")
    private WebElement myCreditSlips;

    @FindBy(css="a[title='Log in to your customer account']")
    private WebElement signIn;

    @FindBy(css="div[id='contact-link']")
    private WebElement chooseContactUs;

    public HomePage() {
        super();
    }

    public void fillSearchField(String text) {
        searchField.click();
        searchField.sendKeys(text);
    }


    public void pressEnter(){
        commonActions.pressEnter(searchField);
    }

    public void pasteToSearchField(String text){
      commonActions.pasteTextToElementFromClipBoard(searchField,text);
    }

    public void VerifyThatNoHomePage(String expected){
            assertThat(myStore.getAttribute("origin"))
                    .as("Wrong attribute text!").contains(expected);
    }

    public void signIn(){
       commonActions.click(signIn);
    }

    public void chooseContactPage(){
        chooseContactUs.click();
    }
}
