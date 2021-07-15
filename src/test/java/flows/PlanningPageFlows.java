package flows;

import org.openqa.selenium.WebElement;
import pages.PlanningPage;

public class PlanningPageFlows {

    private PlanningPage planningPage = new PlanningPage();

    public PlanningPageFlows addOrder(String team, String whereTo, String orderTitle, String email, String toWhom, String externalId){
        planningPage.pressAddOrderButton();
        planningPage.fillOrderTitle(orderTitle);
        planningPage.selectTeam(team);
        planningPage.fillWhereToField(whereTo);
        planningPage.fillEmail(email);
        planningPage.fillToWhomField(toWhom);
        planningPage.fillExternalId(externalId);
        planningPage.saveOrder();
        planningPage.refreshPlanningPage();
        return this;
    }

    public WebElement getNumberOfOrdersElement(){
        return planningPage.getNumberOfOrders();
    }
}
