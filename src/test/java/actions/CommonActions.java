package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static utils.PropertyReader.getPathToUploadFile;

public class CommonActions {

    private final static String PATH_TO_FILE = getPathToUploadFile();

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

    public void scrollDown(int fromValue, int toValue) {
        executor.executeScript("window.scrollBy(" + fromValue + "," + toValue + ")");
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

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
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

     public void pasteTextToElementFromClipBoard(WebElement element, String text) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
        clipboard.setContents(stringSelection, null);
        clickable(element);
        element.sendKeys(Keys.CONTROL, "v");
    }

    public void clickWithJavascript(WebElement element) {
        waitForElement(element);
        executor.executeScript("arguments[0].click()", element);
    }

    public void addTextJavaScrip(WebElement element ,String text){
        executor.executeScript("arguments[0].setAttribute('style.ng-hide','isConnected:true;');",element);
        addText(element,text);
    }

    public void dragAndDrop(WebElement from , WebElement to){
         builder.clickAndHold(from)
                .moveToElement(to)
                .release(from)
                .build().perform();
    }
     public void attachFile(WebElement attachFile, String file) {
         waitForElement(attachFile);
         attachFile.sendKeys(PATH_TO_FILE + file);
     }
    public void confirmAlert() {
        driver.switchTo().alert().accept();
    }

    public void clickable(WebElement element) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
