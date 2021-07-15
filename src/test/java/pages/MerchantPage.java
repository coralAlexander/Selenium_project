package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MerchantPage extends Base {

    public MerchantPage() {
        super();
    }

    @FindBy(css = "input[value='Clean Account From Drivers, Customers and Tasks']")
    private WebElement cleanAccountFromDriversCustomersAndTasks;

    @FindBy(xpath = "//*[text()='Merchant Configuration']")
    private WebElement merchantConf;



    public void pushOnCleanAccountFromDriversCustomersAndTasks(){
        commonActions.click(cleanAccountFromDriversCustomersAndTasks);
    }

    public void confirmAlert(){
        driver.switchTo().alert().accept();
    }

    public void selectMerchantConfiguration(){
        commonActions.click(merchantConf);
    }

}
