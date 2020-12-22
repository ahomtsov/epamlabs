package constant;

public class ConstantsForTesting {

    public static final String WEB_SITE_URL = "https://pzz.by/";

    public static final String ADD_FIRST_PIZZA_TO_CART_BUTTON_XPATH = "//*[@id=\"mainDiv\"]/div[1]/ul[1]/li[1]/div[4]/div/button/span[1]";
    public static final String ADD_SECOND_PIZZA_TO_CART_BUTTON_XPATH = "//*[@id=\"mainDiv\"]/div[1]/ul[1]/li[2]/div[5]/div/button/span[1]";
    public static final String OPEN_CART_BUTTON_XPATH = "//*[@id=\"content\"]/div[2]/div[2]/div[2]/a";
    public static final String OPEN_FILTER_BUTTON_XPATH = "//*[@id=\"filters\"]/span";
    public static final String CLOSE_FILTER_BUTTON_XPATH = "//*[@id=\"filters\"]/div/span[1]/i";
    public static final String FILTER_CRITERIA_BUTTON_XPATH = "//*[@id=\"filters\"]/div/div[1]/ul/li[9]/label/input";
    public static final String OPTION_PICKUP_DELIVERY_BUTTON_XPATH = "//*[@id=\"addressModal\"]/div/div/div[1]/ul/li[2]";
    public static final String CHOOSE_PICKUP_ADDRESS_BUTTON_XPATH = "//*[@id=\"pickup\"]/form/div/p[1]";
    public static final String NAME_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@id=\"pizza-70-big\"]/div[1]/span[1]";
    public static final String COST_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@id=\"pizza-70-big\"]/div[2]/strong";
    public static final String SIZE_OF_FIRST_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@id=\"pizza-70-big\"]/div[1]/span[2]";
    public static final String NAME_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@id=\"pizza-72-medium\"]/div[1]/span[1]";
    public static final String COST_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@id=\"pizza-72-medium\"]/div[2]/strong";
    public static final String SIZE_OF_SECOND_PIZZA_IN_CART_ELEMENT_XPATH = "//*[@id=\"pizza-72-medium\"]/div[1]/span[2]";
    public static final String FINAL_PRICE_ELEMENT_XPATH = "//*[@id=\"cartContent\"]/div[2]/div/div[1]/ul/li/span[2]/strong";
    public static final String NAME_OF_PIZZA_APPEARED_AFTER_FILTER_ELEMENT_XPATH = "//*[@id=\"mainDiv\"]/div[1]/ul[2]/li[14]/div[3]/h3/a";

    public static final String EXPECTED_FIRST_PIZZA_NAME_IN_CART = "3 сезона микс";
    public static final String EXPECTED_FIRST_PIZZA_COST_IN_CART = "21,90";
    public static final String EXPECTED_FIRST_PIZZA_SIZE_IN_CART = "Большая";
    public static final String EXPECTED_SECOND_PIZZA_NAME_IN_CART = "Цыпленок, ветчина и маслины";
    public static final String EXPECTED_SECOND_PIZZA_COST_IN_CART = "14,90";
    public static final String EXPECTED_SECOND_PIZZA_SIZE_IN_CART = "Стандартная";
    public static final String EXPECTED_FINAL_PRICE = "36,80";
    public static final String EXPECTED_PIZZA_NAME_AFTER_FILTER = "Острая чили";
}
