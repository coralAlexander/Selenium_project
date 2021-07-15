package flows;

import org.openqa.selenium.WebElement;
import pages.MerchantConfigPage;

public class MerchantConfigPageFlows {

    private MerchantConfigPage merchantConfigPage = new MerchantConfigPage();

    public MerchantConfigPageFlows selectCheckBoxPlanningPhaseBeforeExecution(){
        merchantConfigPage.selectCheckBoxPlanningPhaseBeforeExecution();
        merchantConfigPage.pushUpdateButton();
        merchantConfigPage.refreshMerchantConfigPage();
        merchantConfigPage.verifyIfPlanningPhaseBeforeExecutionChecked();
        return this;
    }

    public WebElement getCheckBoxPlanningPhaseBeforeExecutionElement(){
      return  merchantConfigPage.getCheckBoxPlanningPhaseBeforeExecution();
    }
}
