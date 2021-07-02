package pages;

import org.openqa.selenium.Keys;
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

    public HomePage() {
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

   /* public MyCreditSlipsPage chooseMyOrders(){
        scrollDown(0,1000);
        myCreditSlips.click();
        return new MyCreditSlipsPage();
    }*/

    public SignInPage signIn(){

        signIn.click();
        return new SignInPage();
    }
}
