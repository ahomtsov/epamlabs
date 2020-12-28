package page;

import constant.ConstantsForTesting;
import model.Pizza;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.CustomWait;

import java.util.ArrayList;

public class LandingPage extends AbstractPage {

    @FindBy(xpath = ConstantsForTesting.OPEN_FILTER_BUTTON_XPATH)
    private WebElement openFilterButton;

    @FindBy(xpath = ConstantsForTesting.CLOSE_FILTER_BUTTON_XPATH)
    private WebElement closeFilterButton;

    @FindBy(xpath = ConstantsForTesting.CLOSE_ADDRESS_PAGE_BUTTON_XPATH)
    private WebElement closeAddressPageButton;

    @FindBy(xpath = ConstantsForTesting.ORDER_PRICE_COUNTER_ELEMENT_XPATH)
    private WebElement orderPriceCounterElement;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage openAddressPageByAddingPizzaToCart(Pizza pizzaToCart) {
        String addPizzaToCartButtonXPath = "//*[contains(text(),'" + pizzaToCart.getName() + "')]/../../..//*[@class='in-cart ']";
        openNextPage(addPizzaToCartButtonXPath);
        return new AddressPage(webDriver);
    }

    public LandingPage addPizzaToCart(Pizza pizzaToCart) {
        String addPizzaToCartButtonXPath = "//*[contains(text(),'" + pizzaToCart.getName() + "')]/../../..//*[@class='in-cart ']";
        webDriver.findElement(By.xpath(addPizzaToCartButtonXPath)).click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public LandingPage closeAddressPage() {
        closeAddressPageButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public CartPage openCartPage() {
        openNextPage(ConstantsForTesting.OPEN_CART_BUTTON_XPATH);
        return new CartPage(webDriver);
    }

    public LandingPage openFilter() {
        openFilterButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public LandingPage closeFilter() {
        closeFilterButton.click();
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

    public String getOrderPriceCounterValue() {
        return orderPriceCounterElement.getText();
    }

    public AddressPage openAddressPage() {
        openNextPage(ConstantsForTesting.OPEN_ADDRESS_PAGE_BUTTON_XPATH);
        return new AddressPage(webDriver);
    }
}
