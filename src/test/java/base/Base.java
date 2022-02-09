package base;

import actions.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import verification.Verification;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static tests.BaseTest.getDriver;


public abstract class Base {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected CommonActions commonActions;
    protected Verification verification;
    protected Actions builder;

    public Base() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
        verification = new Verification(wait);
        builder = new Actions(driver);
        commonActions = new CommonActions(builder, driver, wait);
    }
}
