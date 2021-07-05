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

    public void verifyThat(WebElement element, String failedMessage, String expected){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getText()).as("Message not sent !").isEqualTo("Your message has been successfully sent to our team.");
    }
}
