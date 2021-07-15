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

    @FindBy(css = "input[id='inputEmail']")
    private WebElement userNameField;
    @FindBy(css = "input[id='inputPassword']")
    private WebElement passwordField;
    @FindBy(css = "input[type='button']")
    private WebElement loginButton;


    public void fillUserName(String user) {
        commonActions.addText(userNameField, user);
    }

    public void fillPassword(String password) {
        commonActions.addText(passwordField, password);
    }

    public void pressLoginButton() {
        commonActions.click(loginButton);
    }

}
