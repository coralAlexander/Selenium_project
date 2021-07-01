package temp.common.smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


      //  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));




        try {
            driver.get("https://pagination.js.org/");
            Thread.sleep(2000);

            List<WebElement> elements  = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
            List<WebElement> pages  = driver.findElements(By.xpath("//div[@class='paginationjs-temp.common.pages']/ul/li"));

            String text = elements.get(5).getText();

            System.out.println(text);

            pages.get(2).click();

            ///wait.until(ExpectedConditions.stalenessOf(elements.get(5)));

            elements  = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));

            text = elements.get(5).getText();

            System.out.println(text);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            driver.quit();
        }

     /*   try {
            driver.get("https://www.crossbrowesertesting.github.oi/drug-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.xpath(""));

            Actions actions = new Actions();

            actions
                    .moveToElement()
                    .keyDown()
                    .keyUp()
                    .clickAndHold()
                    .release()
                    .release()
                    .build().perform();

            actions.dragAndDropBy(element, 100,100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            Thread.sleep(20000);
            driver.quit();
        }*/





       // driver.get("https://www.udemy.com");

       /* WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

       element.sendKeys("Java", Keys.ENTER);*/
        //element.clear();

        //element.sendKeys("C:\\path\\",Keys.ENTER);


        /*driver.get("https://www.avito.ru/rossiya");

        WebElement element = driver.findElement(By.cssSelector(".category-with-counters-link-1zX0y"));

        System.out.println(element.getText());*/


        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123")));

        driver.get("https://google.com");*/

        //WebElement input = driver.findElement(By.xpath("//input[@title='חיפוש']"));
        /*WebElement input1 = driver.findElement(By.cssSelector("//input[@title='חיפוש']"));
        WebElement input2 = driver.findElement(By.className("//input[@title='חיפוש']"));
        WebElement input3 = driver.findElement(By.id("//input[@title='חיפוש']"));
        WebElement input4 = driver.findElement(By.linkText("//input[@title='חיפוש']"));
        WebElement input5 = driver.findElement(By.partialLinkText("//input[@title='חיפוש']"));
        WebElement input6 = driver.findElement(By.tagName("//input[@title='חיפוש']"));
        WebElement input7 = driver.findElement(By.name("//input[@title='חיפוש']"));*/
        //input.click();



     /*   String baseUrl = "https://www.facebook.com";
        String tagName = "";

        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        driver.close();
        System.exit(0);*/

    }
}
