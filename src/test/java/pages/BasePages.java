package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static tests.BaseTest.getDriver;


public abstract class BasePages {

    WebDriver driver;
    WebDriverWait wait;
    Actions builder;
    JavascriptExecutor executor;

    public BasePages() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
        builder = new Actions(driver);
        executor = (JavascriptExecutor) driver;
    }

    void pasteTextToElementFromClipBoard(WebElement element, String text) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
        clipboard.setContents(stringSelection, null);
        element.sendKeys(Keys.CONTROL, "v");
    }



    void clickWithJavascript(WebElement element){
        executor.executeScript("arguments[0].click()",element);
    }

      /*boolean isElementFound(By by, int timeout) throws InterruptedException {
        List<WebElement> elements = driver.findElements(by);
        for (int i = 0; (i < timeout) && (elements.size() == 0); i++) {
            Thread.sleep(1000);
            elements = driver.findElements(by);
        }
        return elements.size() > 0;
    }*/

}
