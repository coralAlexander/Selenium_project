package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriversPage extends Base{

    public DriversPage() {
        super();
    }

    @FindBy(xpath = "//*[text()='Teams']")
    private WebElement teams;
    @FindBy(css = "input[id='userName']")
    private WebElement driverNameField;
    @FindBy(css = "input[id='userTitle']")
    private WebElement driverTitleField;
    @FindBy(css = "input[id='userPhone']")
    private WebElement driverPhoneField;
    @FindBy(css = "button[id='btn_add_driver']")
    private WebElement addDriverButton;
    @FindBy(css="a[id='dropdownUserValidation']")
    private WebElement validateDriverBy;
    @FindBy(xpath="//ul[@class='dropdown-menu']/li[2]")
    private WebElement emailPasswordValidation;
    @FindBy(css = "input[id='userEmail']")
    private WebElement driverEmailField;
    @FindBy(css = "input[id='userPassword']")
    private WebElement driverPasswordField;
    @FindBy(css = ".btn.btn-small.btn-primary.ng-binding")
    private WebElement saveDriverButton;

    @FindBy(xpath = "//*[text()='OK']")
    private WebElement confirmDriver;

    @FindBy(css="p[class='muted ng-binding']")
    private WebElement driversNumber;

    public void fillDriverName(String driverName){
        commonActions.addText(driverNameField,driverName);
    }
    public void fillDriverTitle(String driverTitle){
        commonActions.addText(driverTitleField,driverTitle);
    }
    public void fillDriverPhone(String driverPhone){
        commonActions.addText(driverPhoneField,driverPhone);
    }
    public void pushAddDriverButton(){
        commonActions.click(addDriverButton);
    }

    public void selectTeams(){
        commonActions.click(teams);
    }

    public void validateDriverByOption(){
        commonActions.click(validateDriverBy);
    }

    public void selectEmailPasswordValidation(){
        commonActions.click(emailPasswordValidation);
    }

    public void fillDriverEmailField(String driverEmail){
        commonActions.addText(driverEmailField,driverEmail);
    }

    public void fillDriverPasswordField(String password){
        commonActions.addText(driverPasswordField,password);
    }
    public void pressAddDriverButton(){
        commonActions.click(saveDriverButton);
    }

    public void confirmDriverCreation(){
        commonActions.click(confirmDriver);
    }

    public void verifyNumberOfDrivers(int expectedNumber){
        verification.assertTotalNumberOfDrivers(driversNumber,expectedNumber);
    }
}
