package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyAccountPage extends BasePages {

    @FindBy(css="div[class='header_user_info']")
    private WebElement myAccountPage;

    public MyAccountPage() {
        super();
    }

    public void verifyThatCurrentPageIsMyAccountPage(){
        wait.until(ExpectedConditions.visibilityOfAllElements(myAccountPage));
        assertThat(myAccountPage.getAttribute("innerText")).as("Login Failed , wrong page !").isEqualTo("Alexander Alex");
    }
}
