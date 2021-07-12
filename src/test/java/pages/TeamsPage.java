package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamsPage extends Base {

    public TeamsPage() {
        super();
    }

    @FindBy(xpath = "//*[text()='Add Team']")
    private WebElement addTeamButton;
    @FindBy(css = "input[id='teamName']")
    private WebElement teamNameField;
    @FindBy(css = "input[id='teamDescription']")
    private WebElement descriptionField;
    //@FindBy(css = "div[id='teamAddress']")
    @FindBy(css="#teamAddress > div.ui-select-match.ng-scope")
    //@FindBy(xpath="//span[@aria-label='Select box activate']")
    private WebElement selectAddressField;
    @FindBy(css = "input[id='teamLng']")
    private WebElement lngField;
    @FindBy(css = "input[id='teamContactPhone']")
    private WebElement contactPhoneField;
    @FindBy(css = "div[class='select2-search'] input[type='text']")
    private WebElement timeZoneField;

    public void pressAddTeamButton() {
        commonActions.click(addTeamButton);
    }

    public void fillTeamNameField(String teamName) {
        commonActions.addText(teamNameField, teamName);
    }

    public void fillDescriptionField(String description) {
        commonActions.addText(descriptionField, description);
    }


    public void fillAddressField(){
        //driver.findElements(By.cssSelector("div[id='teamAddress']")).get(0).click();
        //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
        commonActions.click(selectAddressField);
        commonActions.pressEnter(selectAddressField);
        commonActions.addText(selectAddressField,"T");
        commonActions.pressEnter(selectAddressField);
        commonActions.click(selectAddressField);
    }


   /* public void selectAddressField(String address) {
        commonActions.addText(selectAddressField, address);
        commonActions.pressEnter(selectAddressField);
        commonActions.click(selectAddressField);
    }*/

  /*  public void fillLngField(String lng) {
        commonActions.addText(lngField, lng);
    }

    public void fillContactPhoneField(String phone) {
        commonActions.addText(contactPhoneField, phone);
    }

    public void selectTimeZone(String timeZone) {
        commonActions.addText(timeZoneField, timeZone);
        commonActions.pressEnter(timeZoneField);
    }*/
}
