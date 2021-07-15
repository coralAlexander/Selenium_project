package pages;

import base.Base;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MerchantConfigPage extends Base {

    public MerchantConfigPage() {
        super();
    }

    @FindBy(css = "input[id='planning_phase_exists']")
    private WebElement checkBoxPlanningPhaseBeforeExecution;

    @FindBy(css = "input[ng-click ='updateMerchantSpecificConfiguration()']")
    private WebElement updateButton;

    public void selectCheckBoxPlanningPhaseBeforeExecution() {
        if (!checkBoxPlanningPhaseBeforeExecution.isSelected()) {
            commonActions.click(checkBoxPlanningPhaseBeforeExecution);
        }
    }

    public void pushUpdateButton() {
        commonActions.click(updateButton);
    }

    public void refreshMerchantConfigPage() {
        commonActions.refreshPage();
    }

    public void verifyIfPlanningPhaseBeforeExecutionChecked() {
        verification.assertCheckBoxChecked(checkBoxPlanningPhaseBeforeExecution);
    }
}
