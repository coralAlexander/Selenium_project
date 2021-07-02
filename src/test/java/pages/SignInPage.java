package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends BasePages {

    @FindBy(css ="input[name='email']")
    private WebElement userNameField;

    @FindBy(css="input[name='passwd']")
    private WebElement passwordField;

    @FindBy(css="i[class='icon-lock left']")
    private WebElement submitButton;

    public void fillUserName(String userName){
        wait.until(ExpectedConditions.visibilityOfAllElements(userNameField));
        userNameField.sendKeys(userName);
    }

    public void fillPassword(String pswd){
        wait.until(ExpectedConditions.visibilityOfAllElements(passwordField));
        passwordField.sendKeys(pswd);
    }

    public void pressSignInButton(){
        submitButton.click();
    }
}
