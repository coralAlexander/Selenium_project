package steps;

import pages.MerchantConfigPage;

public class MerchantConfigPageSteps {

    private MerchantConfigPage merchantConfigPage = new MerchantConfigPage();

    public MerchantConfigPageSteps  selectCheckBoxPlanningPhaseBeforeExecution(){
        merchantConfigPage.selectCheckBoxPlanningPhaseBeforeExecution();
        merchantConfigPage.pushUpdateButton();
        merchantConfigPage.refreshMerchantConfigPage();
        merchantConfigPage.verifyIfPlanningPhaseBeforeExecutionChecked();
        return this;
    }

}
