package actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static utils.PropertyReader.getPathToScreenshotFolder;

public class CommonActions {

    Actions builder;
    WebDriver driver;
    WebDriverWait wait;

    public CommonActions(Actions builder, WebDriver driver, WebDriverWait wait) {
        this.builder = builder;
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
        threadSleep(2000);
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

    Date dateNow = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("hh_mm_ss");
    String fileName = dateFormat.format(dateNow);

    public void doScreenShot(){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshot, new File(getPathToScreenshotFolder() + fileName + "- screen.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void threadSleep(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
