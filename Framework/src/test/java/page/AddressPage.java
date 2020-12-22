package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wait.CustomWait;

public class AddressPage extends AbstractPage {

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage chooseOptionPickUpDelivery(String optionPickUpDeliveryButtonXPath) {
        webDriver.findElement(By.xpath(optionPickUpDeliveryButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public LandingPage choosePickUpAddress(String choosePickUpAddressButtonXPath) {
        webDriver.findElement(By.xpath(choosePickUpAddressButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
        return new LandingPage(webDriver);
    }
}
