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

    public void assertRedirectToPage(String currentUrl, String expectedUrl) {
        assertThat(currentUrl).as("Redirect to incorrect page").isEqualTo(expectedUrl);
    }

    public void assertCheckBoxChecked(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("checked")).as("Check box unchecked !!!").isEqualTo("true");
    }

    public void assertThatDriverAdded(List<WebElement> driversNames, String expectedName) {

        assertThat(driversNames.stream().anyMatch(e -> e.getText().equals(expectedName))).isEqualTo(true);
    }

    public void assertNumberOfOrder(WebElement element, int expectedNumber) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("textContent")).as("").isEqualTo("Test TeamOrders: " + expectedNumber + " | On Shift: 0 | Online Drivers: 0");
    }

    public void assertThatANewTeamAdded(List<WebElement> teamsList, String expectedDescription) {
        wait.until(ExpectedConditions.visibilityOfAllElements(teamsList));
        assertThat(teamsList.stream().map(e -> e.getText()).anyMatch(el -> el.contains(expectedDescription))).isEqualTo(true);
    }
}
