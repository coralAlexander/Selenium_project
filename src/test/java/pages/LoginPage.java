package pages;

import base.Base;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends Base {

    public LoginPage() {
        super();
    }

    @FindBy(css = "input[id='mat-input-0']")
    private WebElement userNameField;
    @FindBy(css = "input[id='mat-input-1']")
    private WebElement passwordField;
    @FindBy(xpath = "//*[text()='Invalid or missing user name.']")
    private WebElement wrongUserName;
    @FindBy(xpath = "//*[text()='Missing password.']" )
    private WebElement missingPasswordErrorMessage;
    @FindBy(xpath = "//*[contains(text(), 'Disabled user - please contact support')]")
    private WebElement text;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public void fillUserName(String user) {
        commonActions.addText(userNameField, user);
    }

    public void clickOnPasswordField(){
        commonActions.click(passwordField);
    }

    public void clickOnUserNameField(){
        commonActions.click(userNameField);
    }

    public void fillPassword(String password) {
        commonActions.addText(passwordField, password);
    }

    public void pressLoginButton() {
        commonActions.click(loginButton);
    }

    public void doScreenshot(){
        commonActions.doScreenShot();
    }
}
