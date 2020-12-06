import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddPizzaToCartTest {
    private static final String ZERO_PRICE = "0,00";
    private WebDriver driver;

    @Before
    public void setUpDriverAndAddPizzaToCart() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://pzz.by/");
        WebElement addPizzaToCart = driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[1]/ul[1]/li[1]/div[3]/div/button"));
        addPizzaToCart.click();
        WebElement chooseOptionPickUpDelivery = driver.findElement(By.xpath("//*[@id=\"addressModal\"]/div/div/div[1]/ul/li[2]"));
        chooseOptionPickUpDelivery.click();
        WebElement choosePickUpAddress = driver.findElement(By.xpath("//*[@id=\"pickup\"]/form/div/p[1]"));
        choosePickUpAddress.click();
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Test
    public void counterOrderSumChange() {
        String expectedOrderSum = "21,90";
        WebElement counterOrderSum = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]"), ZERO_PRICE)));
        String actualOrderSum = counterOrderSum.getText();
        Assert.assertEquals(expectedOrderSum, actualOrderSum);
    }

    @Test
    public void selectedPizzaAppearInBasket() {
        WebElement goToCartButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[2]/a"));
        goToCartButton.click();
        String expectedPizzaName = "3 сезона микс";
        WebElement nameOfSelectedPizza = driver.findElement(By.xpath("//*[@id=\"pizza-70-big\"]/div[1]/span[1]"));
        String actualPizzaName = nameOfSelectedPizza.getText();
        Assert.assertEquals(expectedPizzaName, actualPizzaName);
    }

    @Test
    public void finalPriceChange() {
        WebElement goToCartButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[2]/a"));
        goToCartButton.click();
        String expectedFinalPrice = "21,90";
        WebElement finalPrice = driver.findElement(By.xpath("//*[@id=\"cartContent\"]/div[2]/div/div[1]/ul/li/span[2]/strong"));
        String actualFinalPrice = finalPrice.getText();
        Assert.assertEquals(expectedFinalPrice, actualFinalPrice);
    }
}
