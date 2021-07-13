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

    public void assertRedirectToPage(String currentUrl, String expectedUrl) {
        assertThat(currentUrl).as("Redirect to incorrect page").isEqualTo(expectedUrl);
    }

    public void assertCheckBoxChecked(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("checked")).as("Check box unchecked !!!").isEqualTo("true");
    }

    public void assertTotalNumberOfDrivers(WebElement element, int expectedNumber) {
        assertThat(element.getAttribute("textContent")).as("").isEqualTo("Total number of drivers: " + expectedNumber);
    }

    public void assertNumberOfOrder(WebElement element, int expectedNumber) {
        assertThat(element.getAttribute("textContent")).as("").isEqualTo(" Test team (" + expectedNumber + "orders | 0 on-shift | 0 online drivers)");
    }

    public void assertNumberOfTeams(WebElement element, int expectedNumber){
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        assertThat(element.getAttribute("textContent")).as("").isEqualTo("Total number of teams: " + expectedNumber);

    }
}
