package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public CartPage openCartPage(String openCartButtonXPath) {
        openNextPage(openCartButtonXPath);
        return new CartPage(webDriver);
    }

    public void openFilter(String openFilterButtonXPath) {
        webDriver.findElement(By.xpath(openFilterButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
    }

    public void closeFilter(String closeFilterButtonXPath) {
        webDriver.findElement(By.xpath(closeFilterButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
    }

    public void chooseFilterCriteria(ArrayList<String> filterCriteriaButtonsXPaths) {
        for (String filterCriteriaButtonXPath : filterCriteriaButtonsXPaths)
            webDriver.findElement(By.xpath(filterCriteriaButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
    }

    public ArrayList<String> getNamesOfPizzasAppearedAfterFilter(ArrayList<String> namesOfPizzasAppearedAfterFilterElementsXPaths) {
        ArrayList<String> namesOfPizzasAppearedAfterFilter = new ArrayList<>();
        for (String nameOfPizzaAppearedAfterFilterElementXPath : namesOfPizzasAppearedAfterFilterElementsXPaths)
            namesOfPizzasAppearedAfterFilter.add(webDriver.findElement(By.xpath(nameOfPizzaAppearedAfterFilterElementXPath)).getText());
        return namesOfPizzasAppearedAfterFilter;
    }
}
