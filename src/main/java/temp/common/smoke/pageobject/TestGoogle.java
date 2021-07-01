package temp.common.smoke.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogle {

    @BeforeTest
    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
    }

    @Test
    public void searchGoogleElement(){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");


        WebElement googleAppsButton = driver.findElement(By.cssSelector("a[title='Google apps']"));

        googleAppsButton.click();

        /*WebElement searchField = driver.findElement(By.name("q"));

        searchField.click();*/

        /*searchField.sendKeys("selenium java");
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();*/
        driver.quit();
    }
}
