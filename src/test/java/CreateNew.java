import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNew extends BasePage{
    public static WebDriver driver;
    private static WebDriverWait wait;


    public void newUser(){
        createNewUser();
        enterCreate();
    }
    //move to sigh window
    public void createNewUser() {
        clickElement(By.className("notSigned"));
        clickElement(By.xpath("//span[@class=\"text-link theme\"]"));
        sendKeysToElement(By.id("ember1862"), "newuser");
        sendKeysToElement(By.id("ember1869"), "email@new.com");
        sendKeysToElement(By.id("valPass"), "NewPass1");
        sendKeysToElement(By.id("ember1883"), "NewPass1");
        clickElement(By.className("fill"));
    }
    public void enterCreate(){
         clickElement(By.id("ember1894"));

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