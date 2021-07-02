package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyCreditSlipsPage extends BasePages {

    @FindBy(css = "h1[class='page-heading bottom-indent']")
    private WebElement myCreditSlips;

    public MyCreditSlipsPage() {
        super();
    }

   public void verifyThatSectionNameIsCorrect(String text){
       wait.until(ExpectedConditions.visibilityOfAllElements(myCreditSlips));
        assertThat(myCreditSlips.getAttribute("innerText")).as("Wrong attribute text!").isEqualTo(text);
    }
}
