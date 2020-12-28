package test;

import constant.ConstantsForTesting;
import model.Pizza;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AddressPage;
import page.LandingPage;

public class ProfileTest extends CommonConditions {

    @Test
    public void logIntoExistingAccount() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        User user = new User(ConstantsForTesting.PHONE_NUMBER, ConstantsForTesting.PASSWORD);

        landingPage
                .openAddressPage()
                .chooseOptionMyAddresses()
                .logIn(user);

        AddressPage addressPage = new AddressPage(driver);

        Assert.assertTrue(addressPage.isUserLoggedIn(user));
    }

    @Test
    public void logOutOfAccount() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        User user = new User(ConstantsForTesting.PHONE_NUMBER, ConstantsForTesting.PASSWORD);

        landingPage
                .openAddressPage()
                .chooseOptionMyAddresses()
                .logIn(user)
                .logOut();

        AddressPage addressPage = new AddressPage(driver);

        Assert.assertTrue(addressPage.isUserLoggedOut());
    }
}
