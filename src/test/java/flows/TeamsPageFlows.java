package flows;

import org.openqa.selenium.WebElement;
import pages.TeamsPage;

import java.util.List;

public class TeamsPageFlows {

    private TeamsPage teamsPage = new TeamsPage();

    public TeamsPageFlows addTeam(String name, String description , String address){
        teamsPage.pressAddTeamButton();
        teamsPage.fillTeamNameField(name);
        teamsPage.fillDescriptionField(description);
        teamsPage.fillAddressField(address);
        teamsPage.saveTeam();
        teamsPage.refreshTeamsPage();
        return this;
    }

    public List<WebElement> getTeams(){
       return teamsPage.getTeamsList();
    }
}
