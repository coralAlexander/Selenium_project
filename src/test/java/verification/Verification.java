package verification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Verification {

    WebDriverWait wait;

    public Verification(WebDriverWait wait) {
        this.wait = wait;
    }

    public void assertCurrentPageUrl(String currentUrl, String expectedUrl) {
        assertThat(currentUrl).as("Redirect to incorrect page").isEqualTo(expectedUrl);
    }

    public void assertWrongQuantityOfCharactersInUserNameField(WebElement element,String expectedResult){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("innerText")).as("Wrong number of characters in user name field").isEqualTo(expectedResult);
    }

    public void assertWrongQuantityOfCharactersInPasswordField(WebElement element,String expectedResult){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("innerText")).as("Wrong number of characters in password field").isEqualTo(expectedResult);
    }
}
