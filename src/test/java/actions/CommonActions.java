package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {

    Actions builder;
    JavascriptExecutor executor;
    WebDriver driver;
    WebDriverWait wait;

    public CommonActions(Actions builder, JavascriptExecutor executor, WebDriver driver, WebDriverWait wait) {
        this.builder = builder;
        this.executor = executor;
        this.driver = driver;
        this.wait = wait;
    }
    
    public void pressEnter(WebElement searchField) {
        waitForElement(searchField);
        searchField.sendKeys(Keys.ENTER);
    }

    public void enter(WebElement element) {
        threadSleep(2000);
        builder.sendKeys(Keys.ENTER).perform();
    }

    public void click(WebElement element) {
        waitForElement(element);
        element.click();
    }

    public void addText(WebElement element, String text) {
        waitForElement(element);
        builder.sendKeys(element, text).build().perform();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void waitForElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void threadSleep(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
