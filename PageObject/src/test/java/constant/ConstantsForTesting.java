package constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class ConstantsForTesting {
    private static WebDriver driver;

    public static final String WEB_SITE_URL = "https://pzz.by/";

    public static final String addPizzaToCartButtonXPath = "//*[@id=\"mainDiv\"]/div[1]/ul[1]/li[1]/div[4]/div/button/span[1]";
    public static final String openCartButtonXPath = "//*[@id=\"content\"]/div[2]/div[2]/div[2]/a";
    public static final String openFilterButtonXPath = "//*[@id=\"filters\"]/span";
    public static final String closeFilterButtonXPath = "//*[@id=\"filters\"]/div/span[1]/i";
    public static final String filterCriteriaButtonXPath = "//*[@id=\"filters\"]/div/div[1]/ul/li[9]/label/input";
    public static final String optionPickUpDeliveryButtonXPath = "//*[@id=\"addressModal\"]/div/div/div[1]/ul/li[2]";
    public static final String choosePickUpAddressButtonXPath = "//*[@id=\"pickup\"]/form/div/p[1]";
    public static final String nameOfPizzaInCartElementXPath = "//*[@id=\"pizza-70-big\"]/div[1]/span[1]";
    public static final String finalPriceElementXPath = "//*[@id=\"cartContent\"]/div[2]/div/div[1]/ul/li/span[2]/strong";
    public static final String nameOfPizzaAppearedAfterFilterElementXPath = "//*[@id=\"mainDiv\"]/div[1]/ul[2]/li[14]/div[3]/h3/a";

    public static final String ZERO_PRICE = "0,00";
    public static final String EXPECTED_PIZZA_NAME_IN_CART = "3 сезона микс";
    public static final String EXPECTED_FINAL_PRICE = "21,90";
    public static final String EXPECTED_PIZZA_NAME_AFTER_FILTER = "Острая чили";
}
