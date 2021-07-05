package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchResultPage extends BasePages {

    @FindBy(css = ".heading-counter")
    private WebElement resultRow;

    @FindBy(css = ".heading-counter")
    private List<WebElement> resultRows;

    @FindBy(css = "a[title='Return to Home']")
    private WebElement returnHome;

    public SearchResultPage() {
        super();
    }

    public void assertThatResultContainsCorrectText(String expected) {
        wait.until(ExpectedConditions.visibilityOfAllElements(resultRows));
        assertThat(resultRows.stream().map(e -> e.getText()).collect(Collectors.toList()).toString())
                .as("Wrong attribute has been displayed!").contains(expected);
    }

    public void assertThatResultContainsProperAttributeText(String expected) {
        assertThat(resultRow.getAttribute("isConnected"))
                .as("Wrong attribute text!").contains(expected);
    }

    public void pressHomeButton(){
       commonActions.click(returnHome);
    }
}
