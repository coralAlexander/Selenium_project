package temp.common.smoke.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String name){
        driver.findElement(By.id("login")).sendKeys("admin");
    }

    public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys("sdssdsdd");
    }

    public void clickLogin(){

    }

     public void open(){
        driver.get("https://lingualeo.com");
    }

   public boolean atPage(){
        if(driver.getTitle().equals("Login to Lingua Leo")){
            return true;
        }
        return false;
    }
}
