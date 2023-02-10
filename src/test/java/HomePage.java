import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage {
    private WebDriver driver;


    public HomePage (){this.driver =DriverSingleton.getDriverInstance() ; }

public void findgift()throws InterruptedException{

    Thread.sleep(3000);
//    clickElement(By.className("selected-name"));
    clickElement(By.cssSelector("div[data-ember-action='1073']"));
//    clickElement(By.id("ember1076")); //200שח
    clickElement(By.xpath("//*[@id=\"ember1076\"]"));
    clickElement(By.xpath("//div[@data-ember-action='1108']"));
    clickElement(By.id("ember1114"));            //ירושלים
//    clickElement(By.id("ember1120"));
//    clickElement(By.id("ember1171"));
    clickElement(By.id("ember1199"));


    clickElement(By.id("ember2082"));
    clickElement(By.id("ember2351"));

}

}
