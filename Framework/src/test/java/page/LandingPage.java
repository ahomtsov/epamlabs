package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wait.CustomWait;

import java.util.ArrayList;

public class LandingPage extends AbstractPage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage openAddressPageByAddingPizzaToCart(String addPizzaToCartButtonXPath) {
        openNextPage(addPizzaToCartButtonXPath);
        return new AddressPage(webDriver);
    }

    public CartPage openCartPage(String openCartButtonXPath) throws InterruptedException {
        Thread.sleep(5000);
        openNextPage(openCartButtonXPath);
        return new CartPage(webDriver);
    }

    public LandingPage openFilter(String openFilterButtonXPath) {
        webDriver.findElement(By.xpath(openFilterButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public LandingPage closeFilter(String closeFilterButtonXPath) {
        webDriver.findElement(By.xpath(closeFilterButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public LandingPage chooseFilterCriteria(ArrayList<String> filterCriteriaButtonsXPaths) {
        for (String filterCriteriaButtonXPath : filterCriteriaButtonsXPaths)
            webDriver.findElement(By.xpath(filterCriteriaButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public ArrayList<String> getNamesOfPizzasAppearedAfterFilter(ArrayList<String> namesOfPizzasAppearedAfterFilterElementsXPaths) {
        ArrayList<String> namesOfPizzasAppearedAfterFilter = new ArrayList<>();
        for (String nameOfPizzaAppearedAfterFilterElementXPath : namesOfPizzasAppearedAfterFilterElementsXPaths)
            namesOfPizzasAppearedAfterFilter.add(webDriver.findElement(By.xpath(nameOfPizzaAppearedAfterFilterElementXPath)).getText());
        return namesOfPizzasAppearedAfterFilter;
    }
}
