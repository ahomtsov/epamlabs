package test;

import constant.ConstantsForTesting;
import model.Pizza;
import org.openqa.selenium.WebDriver;
import page.CartPage;
import page.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CartTest extends CommonConditions {

    @Test
    public void twoSelectedPizzasAppearInBasketAndFinalPriceChanges() {

        Pizza expectedFirstPizza = new Pizza(false, ConstantsForTesting.EXPECTED_FIRST_PIZZA_NAME_IN_CART, ConstantsForTesting.EXPECTED_FIRST_PIZZA_COST_IN_CART, ConstantsForTesting.EXPECTED_FIRST_PIZZA_SIZE_IN_CART);
        Pizza expectedSecondPizza = new Pizza(false, ConstantsForTesting.EXPECTED_SECOND_PIZZA_NAME_IN_CART, ConstantsForTesting.EXPECTED_SECOND_PIZZA_COST_IN_CART, ConstantsForTesting.EXPECTED_SECOND_PIZZA_SIZE_IN_CART);

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        landingPage
                .openAddressPageByAddingPizzaToCart(expectedFirstPizza)
                .chooseOptionPickUpDelivery()
                .choosePickUpAddress()
                .addPizzaToCart(expectedSecondPizza);

        CartPage cartPage = landingPage.openCartPage();

        Pizza firstPizza = new Pizza(true, ConstantsForTesting.NAME_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH, ConstantsForTesting.COST_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH, ConstantsForTesting.SIZE_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH);
        Pizza secondPizza = new Pizza(true, ConstantsForTesting.NAME_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH, ConstantsForTesting.COST_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH, ConstantsForTesting.SIZE_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH);

        ArrayList<Pizza> pizzasInCartElementsXPaths = new ArrayList<>();
        pizzasInCartElementsXPaths.add(firstPizza);
        pizzasInCartElementsXPaths.add(secondPizza);

        ArrayList<Pizza> expectedPizzasInCart = new ArrayList<>();
        expectedPizzasInCart.add(expectedFirstPizza);
        expectedPizzasInCart.add(expectedSecondPizza);

        Assert.assertEquals(expectedPizzasInCart, cartPage.getPizzasInCart(pizzasInCartElementsXPaths));
        Assert.assertEquals(ConstantsForTesting.EXPECTED_FINAL_PRICE, cartPage.getFinalPrice());
    }
}
