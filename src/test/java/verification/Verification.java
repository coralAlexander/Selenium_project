package verification;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Verification {

    WebDriverWait wait;

    public Verification(WebDriverWait wait) {
        this.wait = wait;
    }

    public void assertCurrentPageUrl(String currentUrl, String expectedUrl) {
        assertThat(currentUrl).as("Redirect to incorrect page").isEqualTo(expectedUrl);
    }

    public void assertThatCheckBoxChecked(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("checked")).as("Check box unchecked !!!").isEqualTo("true");
    }

    public void assertThatElementAdded(List<WebElement> elements, String expectedName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
        assertThat(elements.stream().anyMatch(e -> e.getText().equals(expectedName))).isEqualTo(true);
    }

    public void assertElementText(WebElement element, int expectedNumber, String order) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("textContent")).as("").isEqualTo(order+": " + expectedNumber + " | On Shift: 0 | Online Drivers: 0");
    }

    public void assertThatElementContainsText(List<WebElement> teamsList, String expectedDescription) {
        wait.until(ExpectedConditions.visibilityOfAllElements(teamsList));
        assertThat(teamsList.stream().map(e -> e.getText()).anyMatch(el -> el.contains(expectedDescription))).isEqualTo(true);
    }
}
