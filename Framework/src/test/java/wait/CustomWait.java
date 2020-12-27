package wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CustomWait {

    private static final int WAIT_TIMEOUT_SECONDS = 20;

    public static void waitForPageLoaded(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(CustomCondition.jQueryAJAXsCompleted());
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(CustomCondition.waitForLoad());
    }
}
