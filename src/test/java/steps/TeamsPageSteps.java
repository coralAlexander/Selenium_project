package steps;

import pages.TeamsPage;

public class TeamsPageSteps {

    private TeamsPage teamsPage = new TeamsPage();

    public TeamsPageSteps addTeam(String name, String description , String address){
        teamsPage.pressAddTeamButton();
        teamsPage.fillTeamNameField(name);
        teamsPage.fillDescriptionField(description);
        teamsPage.fillAddressField();
        return this;
    }
}
