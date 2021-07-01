package temp.common.pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {

    private final WebDriver driver;

    public CarLoansPage(WebDriver driver) {
        this.driver=driver;
    }


    public CarLoansPage selectAgreementsTab(){
        driver.findElement(By.xpath(CarLoansPageLocators.TAB_AGREEMENTS.getLocator())).click();
        return this;
    }
}
