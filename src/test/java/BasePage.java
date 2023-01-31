import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

        public void clickElement(By locator) {
            getWebElement(locator).click();
        }
        public void sendKeysToElement(By locator, String text) {
            getWebElement(locator).sendKeys(text);
        }
//        public WebElement getElemet (By locator) {
//            return (WebElement) getWebElement(locator);
//        }
        private WebElement getWebElement(By locator) {
            return
            DriverSingleton.getDriverInstance().findElement(locator);
        }
    }
