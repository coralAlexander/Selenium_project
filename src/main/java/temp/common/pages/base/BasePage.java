package temp.common.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static temp.common.constans.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element){
      new WebDriverWait(driver,EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
      return element;
    }

    public void isAuthWidgetPresent(){
        WebElement authFrame = driver.findElement(By.xpath(BasePageLocators.AUTH_WIDGET.getLocator()));
        waitElementIsVisible(authFrame);
    }
}
