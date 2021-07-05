package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static utils.PropertyReader.getPathToUploadFile;

public class CommonActions {

    private final static String PATH_TO_FILE = getPathToUploadFile();

    Actions builder;
    JavascriptExecutor executor;

    public CommonActions(Actions builder, JavascriptExecutor executor) {
        this.builder = builder;
        this.executor = executor;
    }

    public void scrollDown(int fromValue, int toValue) {
        executor.executeScript("window.scrollBy(" + fromValue + "," + toValue + ")");
    }

    public void pasteTextToElementFromClipBoard(WebElement element, String text) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
        clipboard.setContents(stringSelection, null);
        element.sendKeys(Keys.CONTROL, "v");
    }


    public void clickWithJavascript(WebElement element) {
        executor.executeScript("arguments[0].click()", element);
    }

    public void pressEnter(WebElement searchField) {
        searchField.sendKeys(Keys.RETURN);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void attachFile(WebElement attachFile, String file) {
        attachFile.sendKeys(PATH_TO_FILE + file);
    }

    public void addText(WebElement element, String text) {
        element.sendKeys(text);
    }
}
