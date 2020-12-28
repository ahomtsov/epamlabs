package test;

import constant.ConstantsForTesting;
import model.Pizza;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LandingPage;

import java.util.ArrayList;

public class OrderPriceCounterTest extends CommonConditions {

    @Test
    public void orderPriceCounterChanges() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        Pizza pizza = new Pizza(false, ConstantsForTesting.EXPECTED_FIRST_PIZZA_NAME_IN_CART, ConstantsForTesting.EXPECTED_FIRST_PIZZA_COST_IN_CART, ConstantsForTesting.EXPECTED_FIRST_PIZZA_SIZE_IN_CART);

        landingPage
                .openAddressPageByAddingPizzaToCart(pizza)
                .chooseOptionPickUpDelivery()
                .choosePickUpAddress();

        Assert.assertEquals(ConstantsForTesting.EXPECTED_ORDER_PRICE_COUNTER_VALUE, landingPage.getOrderPriceCounterValue());
    }
}
