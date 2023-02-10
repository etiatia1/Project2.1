import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    WebDriver driver=DriverSingleton.getDriverInstance();
    //    public static WebDriver driver;
//    private static WebDriverWait wait;
    @BeforeTest
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        Login login=new Login();
        login.login();

    }
    @Test
    public void test01_new(){
        CreateNew newUser = new CreateNew();
        newUser.newUser();
    }
    @Test
    public void test_login(){
        Login login=new Login();
        login.login();
        System.out.println(driver.getCurrentUrl());


    }
    @Test
    public void test_findgift() throws InterruptedException {
        HomePage finggift=new HomePage();
       finggift.findgift();
    }


}


