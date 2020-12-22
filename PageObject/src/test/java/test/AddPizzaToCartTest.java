package test;

import constant.ConstantsForTesting;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

        landingPage
                .openAddressPageByAddingPizzaToCart(ConstantsForTesting.ADD_PIZZA_TO_CART_BUTTON_XPATH)
                .chooseOptionPickUpDelivery(ConstantsForTesting.OPTION_PICKUP_DELIVERY_BUTTON_XPATH)
                .choosePickUpAddress(ConstantsForTesting.CHOOSE_PICKUP_ADDRESS_BUTTON_XPATH);

        CartPage cartPage = landingPage.openCartPage(ConstantsForTesting.OPEN_CART_BUTTON_XPATH);

        ArrayList<String> namesOfPizzasInCartElementsXPaths = new ArrayList<>();
        namesOfPizzasInCartElementsXPaths.add(ConstantsForTesting.NAME_OF_PIZZA_IN_CART_ELEMENT_XPATH);

        Assert.assertEquals(ConstantsForTesting.EXPECTED_PIZZA_NAME_IN_CART, cartPage.getNamesOfPizzasInCart(namesOfPizzasInCartElementsXPaths).get(0));
        Assert.assertEquals(ConstantsForTesting.EXPECTED_FINAL_PRICE, cartPage.getFinalPrice(ConstantsForTesting.FINAL_PRICE_ELEMENT_XPATH));
    }

    @AfterClass
    public static void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
