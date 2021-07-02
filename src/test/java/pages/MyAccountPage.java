package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyAccountPage {

    @FindBy(css="span[class='navigation_page']")
    private WebElement myAccountPage;

    public void verifyThatCurrentPageIsMyAccountPage(){
        assertThat(myAccountPage.getAttribute("outerText")).as("Login Failed , wrong page !").isEqualTo("My account");
    }
}
