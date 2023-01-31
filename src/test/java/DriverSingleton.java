import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriverInstance(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver",Constants.CHROMEDRIVER_PATH);
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("https://buyme.co.il");
        }
        return driver;
    }
        }
