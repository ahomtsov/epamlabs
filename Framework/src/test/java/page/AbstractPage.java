package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import wait.CustomWait;

public abstract class AbstractPage {

    protected final int WAIT_TIMEOUT_SECONDS = 20;
    protected WebDriver webDriver;

    protected AbstractPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(this.webDriver, WAIT_TIMEOUT_SECONDS), this);
    }

    public void openThisPage(String url) {
        webDriver.get(url);
        CustomWait.waitForPageLoaded(webDriver);
    }

    public void openNextPage(String buttonXPath) {
        WebElement element = webDriver.findElement(By.xpath(buttonXPath));
        ((JavascriptExecutor) webDriver).executeScript("scroll(250, 0)", element);
        element.click();
        CustomWait.waitForPageLoaded(webDriver);
    }
}
