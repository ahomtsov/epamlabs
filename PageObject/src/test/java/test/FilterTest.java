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

public class FilterTest {

    private static WebDriver driver;

    @BeforeClass
    public static void browserSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void neededPizzaAppearsAfterFilterByOneCriteria() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.openThisPage(ConstantsForTesting.WEB_SITE_URL);

        ArrayList<String> filterCriteriaButtonsXPaths = new ArrayList<>();
        filterCriteriaButtonsXPaths.add(ConstantsForTesting.FILTER_CRITERIA_BUTTON_XPATH);

        landingPage
                .openFilter(ConstantsForTesting.OPEN_FILTER_BUTTON_XPATH)
                .chooseFilterCriteria(filterCriteriaButtonsXPaths)
                .closeFilter(ConstantsForTesting.CLOSE_FILTER_BUTTON_XPATH);

        ArrayList<String> namesOfPizzasAppearedAfterFilterElementsXPaths = new ArrayList<>();
        namesOfPizzasAppearedAfterFilterElementsXPaths.add(ConstantsForTesting.NAME_OF_PIZZA_APPEARED_AFTER_FILTER_ELEMENT_XPATH);

        Assert.assertEquals(ConstantsForTesting.EXPECTED_PIZZA_NAME_AFTER_FILTER, landingPage.getNamesOfPizzasAppearedAfterFilter(namesOfPizzasAppearedAfterFilterElementsXPaths).get(0));
    }

    @AfterClass
    public static void browserTearDown(){
        driver.quit();
        driver = null;
    }
}
