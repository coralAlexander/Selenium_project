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
    @FindBy(css = "div[id='teamAddress']")
    //@FindBy(css="#teamAddress > div.ui-select-match.ng-scope")
    private WebElement selectAddressField;
    @FindBy(css = "input[id='teamContactPhone']")
    private WebElement contactPhoneField;
    @FindBy(css = "a[class='btn btn-small btn-primary ng-binding']")
    private WebElement saveTeam;@FindBy(css="p[class='muted ng-binding']")
    private WebElement teamsNumber;

    public void pressAddTeamButton() {
        commonActions.click(addTeamButton);
    }

    public void fillTeamNameField(String teamName) {
        commonActions.addText(teamNameField, teamName);
    }

    public void fillDescriptionField(String description) {
        commonActions.addText(descriptionField, description);
    }


    public void fillAddressField(String address) {
        commonActions.addText(selectAddressField, address);
        commonActions.enter(selectAddressField);
    }

    public void saveTeam() {
        commonActions.click(saveTeam);
    }

    public void refreshTeamsPage() {
        commonActions.refreshPage();
    }

    public void verifyNumberOfTeams(int expecteNumber){
        verification.assertNumberOfTeams(teamsNumber,expecteNumber);
    }
}
