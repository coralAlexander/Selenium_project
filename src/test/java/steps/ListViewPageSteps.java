package steps;

import pages.ListViewPage;

public class ListViewPageSteps {

    private ListViewPage listViewPage = new ListViewPage();

    public ListViewPageSteps addOrder(String team,String whereTo,String orderTitle,int ordersNum){
        listViewPage.pressAddOrderButton();
        listViewPage.fillOrderTitle(orderTitle);
        listViewPage.selectTeam(team);
        listViewPage.fillWhereToField(whereTo);
        listViewPage.saveOrder();
        listViewPage.verifyNumberOfOrders(ordersNum);
        return this;
    }

    public ListViewPageSteps dragAndDropElement(){
        listViewPage.pressCustomizeButton();
        listViewPage.dragAndDrop();
        listViewPage.pressApplyButton();
        return this;
    }
}
