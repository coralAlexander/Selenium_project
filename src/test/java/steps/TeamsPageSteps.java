package steps;

import pages.TeamsPage;

public class TeamsPageSteps {

    private TeamsPage teamsPage = new TeamsPage();

    public TeamsPageSteps addTeam(String name, String description , String address,int numberOfTeams){
        teamsPage.pressAddTeamButton();
        teamsPage.fillTeamNameField(name);
        teamsPage.fillDescriptionField(description);
        teamsPage.fillAddressField(address);
        teamsPage.saveTeam();
        teamsPage.refreshTeamsPage();
        teamsPage.verifyNumberOfTeams(numberOfTeams);

        return this;
    }
}
