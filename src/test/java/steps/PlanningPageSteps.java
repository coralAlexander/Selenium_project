package steps;

import pages.PlannigPage;

public class PlanningPageSteps {

    private PlannigPage plannigPage = new PlannigPage();

    public PlanningPageSteps addOrder(String team, String whereTo, String orderTitle, int ordersNum,String email,String toWhom){
        plannigPage.pressAddOrderButton();
        plannigPage.fillOrderTitle(orderTitle);
        plannigPage.selectTeam(team);
        plannigPage.fillWhereToField(whereTo);
        plannigPage.fillEmail(email);
        plannigPage.fillToWhomField(toWhom);
        plannigPage.fillExternalId();
        plannigPage.saveOrder();
        plannigPage.refreshPlanningPage();
        plannigPage.verifyNumberOfOrders(ordersNum);
        return this;
    }

   /* public PlanningPageSteps dragAndDropElement(){
        plannigPage.pressCustomizeButton();
        //plannigPage.dragAndDrop();
        plannigPage.pressApplyButton();
        return this;
    }*/
}
