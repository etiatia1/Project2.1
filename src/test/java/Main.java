import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Main {
     public static WebDriver driver;
     private static WebDriverWait wait;

     @BeforeClass
     public static void runOnceBeforeClass() {
          System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
          driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          driver.get("https://buyme.co.il");
     }

     @Test   //move to asin window
     public void rightOFTest() {
          driver.findElement(By.className("notSigned")).click();

     }
     @Test
     public void test1(){
          driver.findElement(By.xpath("//span[@class=\"text-link theme\"]")).click();
     }

//     @Test   //     התחברות
//     public void test2(){
//          driver.findElement(By.id("ember1835")).sendKeys("Etiatia1@gmail.com");
//     }
//     @Test
//     public void test3(){
//          driver.findElement(By.id("ember1842")).sendKeys("Noel135o");
//     }
//     @Test  // לחיצה על כפתור התחברות
//     public void test4(){
//          driver.findElement(By.id("ember1851")).click();
//     }



}
