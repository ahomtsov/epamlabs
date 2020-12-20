package test;

import constant.ConstantsForTesting;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.AddressPage;
import page.CartPage;
import page.LandingPage;

import java.util.ArrayList;

public class AddPizzaToCartTest {

    private static WebDriver driver;

    @BeforeClass
    public static void browserSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void selectedPizzaAppearsInBasketAndFinalPriceChanges() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        AddressPage addressPage = landingPage.openAddressPageByAddingPizzaToCart(ConstantsForTesting.addPizzaToCartButtonXPath);
        addressPage.chooseOptionPickUpDelivery(ConstantsForTesting.optionPickUpDeliveryButtonXPath);
        addressPage.choosePickUpAddress(ConstantsForTesting.choosePickUpAddressButtonXPath);

        CartPage cartPage = landingPage.openCartPage(ConstantsForTesting.openCartButtonXPath);

        ArrayList<String> namesOfPizzasInCartElementsXPaths = new ArrayList<>();
        namesOfPizzasInCartElementsXPaths.add(ConstantsForTesting.nameOfPizzaInCartElementXPath);

        Assert.assertEquals(ConstantsForTesting.EXPECTED_PIZZA_NAME_IN_CART, cartPage.getNamesOfPizzasInCart(namesOfPizzasInCartElementsXPaths).get(0));
        Assert.assertEquals(ConstantsForTesting.EXPECTED_FINAL_PRICE, cartPage.getFinalPrice(ConstantsForTesting.finalPriceElementXPath));
    }

    @Test
    public void neededPizzaAppearsAfterFilterByOneCriteria() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        landingPage.openFilter(ConstantsForTesting.openFilterButtonXPath);

        ArrayList<String> filterCriteriaButtonsXPaths = new ArrayList<>();
        filterCriteriaButtonsXPaths.add(ConstantsForTesting.filterCriteriaButtonXPath);
        landingPage.chooseFilterCriteria(filterCriteriaButtonsXPaths);

        landingPage.closeFilter(ConstantsForTesting.closeFilterButtonXPath);

        ArrayList<String> namesOfPizzasAppearedAfterFilterElementsXPaths = new ArrayList<>();
        namesOfPizzasAppearedAfterFilterElementsXPaths.add(ConstantsForTesting.nameOfPizzaAppearedAfterFilterElementXPath);

        Assert.assertEquals(ConstantsForTesting.EXPECTED_PIZZA_NAME_AFTER_FILTER, landingPage.getNamesOfPizzasAppearedAfterFilter(namesOfPizzasAppearedAfterFilterElementsXPaths).get(0));
    }

    @AfterClass
    public static void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
