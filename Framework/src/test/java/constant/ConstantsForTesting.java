package constant;

public class ConstantsForTesting {

    public static final String WEB_SITE_URL = "https://pzz.by/";

    public static final String OPEN_CART_BUTTON_XPATH = "//*[@class='pzz-navigation no-print']//*[@href='/cart']";
    public static final String OPEN_FILTER_BUTTON_XPATH = "//*[@id=\"filters\"]/span";
    public static final String CLOSE_FILTER_BUTTON_XPATH = "//*[@class='filters__hide']/i";
    public static final String FILTER_CRITERIA_BUTTON_XPATH = "//*[@data-id='3']";
    public static final String OPTION_PICKUP_DELIVERY_BUTTON_XPATH = "//*[@href=\"#pickup\"]";
    public static final String CHOOSE_PICKUP_ADDRESS_BUTTON_XPATH = "//*[@id=\"bypickup-2\"]";
    public static final String NAME_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@class=\"cart-selected-list cart-list\"]/li[1]//span";
    public static final String COST_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@class=\"cart-selected-list cart-list\"]/li[1]//*[@class=\"pizza-price\"]";
    public static final String SIZE_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@class=\"cart-selected-list cart-list\"]/li[1]//*[@class=\"subname\"]";
    public static final String NAME_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@class=\"cart-selected-list cart-list\"]/li[2]//span";
    public static final String COST_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@class=\"cart-selected-list cart-list\"]/li[2]//*[@class=\"pizza-price\"]";
    public static final String SIZE_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@class=\"cart-selected-list cart-list\"]/li[2]//*[@class=\"subname\"]";
    public static final String FINAL_PRICE_ELEMENT_XPATH = "//*[@class='cart-total']";
    public static final String NAME_OF_PIZZA_APPEARED_AFTER_FILTER_ELEMENT_XPATH = "//*[@class='goods__list__li pizzas']//*[@class='goods__list__title ']//*";
    public static final String CLOSE_ADDRESS_PAGE_BUTTON_XPATH = "//*[@id=\"addressModal\"]/div/div/span";
    public static final String ORDER_PRICE_COUNTER_ELEMENT_XPATH = "//*[@class=\"pzz-navigation no-print\"]//*[@class=\"pzz-cart__summ cart-sum\"]";
    public static final String OPEN_ADDRESS_PAGE_BUTTON_XPATH = "//*[@class=\"pzz-cart__delivery pzz-cart__delivery-embedded\"]//*";
    public static final String OPTION_MY_ADDRESSES_BUTTON_XPATH = "//*[@href=\"#client-addresses\"]";
    public static final String PHONE_NUMBER_INPUT_XPATH = "//*[@id=\"client-auth-phone\"]";
    public static final String PASSWORD_INPUT_XPATH = "//*[@id=\"client-auth-pass\"]";
    public static final String LOG_IN_BUTTON_XPATH = "//*[@id=\"login\"]";
    public static final String PHONE_NUMBER_ELEMENT_XPATH = "//*[@class=\"client-menu-item\"]//*[@class=\"phone\"]";
    public static final String LOG_OUT_BUTTON_XPATH = "//*[@id=\"logout\"]";
    public static final String CONFIRM_LOG_OUT_BUTTON_XPATH = "//*[@id=\"confirm-logout\"]";
    public static final String LOG_OUT_MESSAGE_ELEMENT_XPATH = "//*[@id=\"client-addresses\"]//*[@class='client-info-msg']//*";

    public static final String EXPECTED_FIRST_PIZZA_NAME_IN_CART = "3 сезона микс";
    public static final String EXPECTED_FIRST_PIZZA_COST_IN_CART = "21,90";
    public static final String EXPECTED_FIRST_PIZZA_SIZE_IN_CART = "Большая";
    public static final String EXPECTED_SECOND_PIZZA_NAME_IN_CART = "Цыпленок, ветчина и маслины";
    public static final String EXPECTED_SECOND_PIZZA_COST_IN_CART = "18,90";
    public static final String EXPECTED_SECOND_PIZZA_SIZE_IN_CART = "Большая";
    public static final String EXPECTED_FINAL_PRICE = "40,80";
    public static final String EXPECTED_PIZZA_NAME_AFTER_FILTER = "Острая чили";
    public static final String EXPECTED_ORDER_PRICE_COUNTER_VALUE = "21,90";
    public static final String PHONE_NUMBER = "+375298102930";
    public static final String PASSWORD = "qwerty";
    public static final String EXPECTED_LOG_OUT_MESSAGE = "Вы успешно вышли";
}
