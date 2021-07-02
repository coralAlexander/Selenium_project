package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePages {

    @FindBy(css ="input[name='email']")
    private WebElement emailField;

    @FindBy(css="input[name='passwd']")
    private WebElement passwordField;

    @FindBy(css="button[type='submit']")
    private WebElement submitButton;

    public void fillUserName(String userName){
        emailField.sendKeys(userName);
    }

    public void fillPassword(String pswd){
        passwordField.sendKeys(pswd);
    }

    public void pressSignInButton(){
        submitButton.click();
    }
}
