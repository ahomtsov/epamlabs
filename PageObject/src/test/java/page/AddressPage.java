package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.CustomWait;

public class AddressPage extends AbstractPage {

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public void chooseOptionPickUpDelivery(String optionPickUpDeliveryButtonXPath) {
        webDriver.findElement(By.xpath(optionPickUpDeliveryButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
    }

    public void choosePickUpAddress(String choosePickUpAddressButtonXPath) {
        webDriver.findElement(By.xpath(choosePickUpAddressButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
    }
}
