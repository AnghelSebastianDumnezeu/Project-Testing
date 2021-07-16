import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utils {
    final static String CHROME_DRIVER_LOCATION = "chromedriver.exe";
    final static String BASE_URL = "C:/Users/Snuff/Downloads/Testing-Env-master/Testing-Env/index.html";
    final static String BASE_URL2 = "C:/Users/Snuff/Downloads/Testing-Env-master/Testing-Env/routes/enrollment.html";

    public static void waitForElementToLoad(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoad(3);
    }
}