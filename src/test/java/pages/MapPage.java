package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MapPage extends Base{

    public MapPage() {
        super();
    }

    @FindBy(xpath="//*[text()='Settings']")
    private WebElement selectSettings;
    @FindBy(css = "a[translate='MAIN.DRIVERS']")
    private WebElement drivers ;
    @FindBy(css= "span[class='dropdown']")
    private WebElement signInDropDown;
    @FindBy(css="button[id='btn_add_order']")
    private WebElement addOrderButton;
    @FindBy(css = "a[id='dispatch_show_list']")
    private WebElement listViewButton;


    public void selectSignInDropDown(){
        commonActions.click(signInDropDown);
    }

    public void selectSettings(){
       commonActions.click(selectSettings);
    }

    public void  selectDrivers(){
        commonActions.click(drivers);
    }

    public void verifyUrl(String url) {
        commonActions.waitForElement(drivers);
        verification.assertRedirectToPage(commonActions.getCurrentUrl(),url);
    }

    public void addOrder(){
        commonActions.click(addOrderButton);
    }

    public void pressListViewButton(){
        commonActions.click(listViewButton);
    }
}