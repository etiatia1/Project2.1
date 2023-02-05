import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{

    private WebDriver driver;

    public Login (){this.driver =DriverSingleton.getDriverInstance() ; }
//    private static WebDriverWait wait;


//    public static void runOnceBeforeClass() {
//        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.get("https://buyme.co.il");

//        }

    public void login() {
        clickElement(By.className("notSigned"));
        sendKeysToElement(By.id("ember1835"),"Etiatia1@gmail.com");
        sendKeysToElement(By.id("ember1842"),"Noel135o");
        clickElement(By.id("ember1852"));

    }
}