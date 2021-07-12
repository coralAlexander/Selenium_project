package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends Base {

    public LoginPage() {
        super();
    }

    @FindBy(css = "input[id='inputEmail']")
    private WebElement userNameField;
    @FindBy(css = "input[id='inputPassword']")
    private WebElement passwordField;
    @FindBy(css = "input[type='button']")
    private WebElement loginButton;


    public void fillUserName(String user){
        commonActions.addText(userNameField,user);
    }

    public void fillPassword(String password){
        commonActions.addText(passwordField,password);
    }

    public void verifyUrl(String url){
        commonActions.waitForElement(userNameField);
        verification.assertRedirectToPage(commonActions.getCurrentUrl(),url);
    }

    public void pressLoginButton(){
        commonActions.click(loginButton);
    }



}
