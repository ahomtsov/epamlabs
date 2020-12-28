package page;

import constant.ConstantsForTesting;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import wait.CustomWait;

public class AddressPage extends AbstractPage {

    @FindBy(xpath = ConstantsForTesting.OPTION_PICKUP_DELIVERY_BUTTON_XPATH)
    private WebElement optionPickUpDeliveryButton;

    @FindBy(xpath = ConstantsForTesting.CHOOSE_PICKUP_ADDRESS_BUTTON_XPATH)
    private WebElement choosePickUpAddressButton;

    @FindBy(xpath = ConstantsForTesting.OPTION_MY_ADDRESSES_BUTTON_XPATH)
    private WebElement optionMyAddressesButton;

    @FindBy(xpath = ConstantsForTesting.PHONE_NUMBER_INPUT_XPATH)
    private WebElement phoneNumberInput;

    @FindBy(xpath = ConstantsForTesting.PASSWORD_INPUT_XPATH)
    private WebElement passwordInput;

    @FindBy(xpath = ConstantsForTesting.LOG_IN_BUTTON_XPATH)
    private WebElement logInButton;

    @FindBy(xpath = ConstantsForTesting.PHONE_NUMBER_ELEMENT_XPATH)
    private WebElement phoneNumberElement;

    @FindBy(xpath = ConstantsForTesting.LOG_OUT_BUTTON_XPATH)
    private WebElement logOutButton;

    @FindBy(xpath = ConstantsForTesting.CONFIRM_LOG_OUT_BUTTON_XPATH)
    private WebElement confirmLogOutButton;

    @FindBy(xpath = ConstantsForTesting.LOG_OUT_MESSAGE_ELEMENT_XPATH)
    private WebElement logOutMessageElement;

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public AddressPage chooseOptionPickUpDelivery() {
        optionPickUpDeliveryButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public LandingPage choosePickUpAddress() {
        choosePickUpAddressButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return new LandingPage(webDriver);
    }

    public AddressPage chooseOptionMyAddresses() {
        optionMyAddressesButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public AddressPage logIn(User user) {
        phoneNumberInput.sendKeys(user.getPhoneNumber());
        passwordInput.sendKeys(user.getPassword());
        logInButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public boolean isUserLoggedIn(User user) {
        return (phoneNumberElement.getText().equals(user.getPhoneNumber()));
    }

    public AddressPage logOut() {
        logOutButton.click();
        confirmLogOutButton.click();
        CustomWait.waitForPageLoaded(webDriver);
        return this;
    }

    public boolean isUserLoggedOut() {
        return (logOutMessageElement.getText().equals(ConstantsForTesting.EXPECTED_LOG_OUT_MESSAGE));
    }
}
