package temp.tests.base;

import temp.common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import temp.common.pages.base.BasePage;
import temp.common.pages.loans.CarLoansPage;
import temp.common.pages.telecomunications.MobilePhoneReplenishmentPage;

import static temp.common.Config.CLEAR_COOKIES;
import static temp.common.Config.HOLD_BROWSER_OPEN;

public abstract class BaseTest {

    protected WebDriver driver = CommonAction.createDiver();
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoans = new CarLoansPage(driver);
    protected MobilePhoneReplenishmentPage mobilePhoneReplenishmentPage = new MobilePhoneReplenishmentPage(driver);

    @AfterClass
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterClass
    public void close() {
        if (!HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }
}
