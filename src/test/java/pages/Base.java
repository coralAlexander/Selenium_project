package pages;

import actions.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import verification.Verification;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static tests.BaseTest.getDriver;


public abstract class Base {

    WebDriver driver;
    WebDriverWait wait;
    CommonActions commonActions;
    Verification verification;
    Actions builder;
    JavascriptExecutor executor;

    public Base() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
        verification = new Verification(wait);
        builder = new Actions(driver);
        executor = (JavascriptExecutor) driver;
        commonActions = new CommonActions(builder,executor,driver,wait);

    }
}
