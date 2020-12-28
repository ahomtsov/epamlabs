package page;

import constant.ConstantsForTesting;
import model.Pizza;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class CartPage extends AbstractPage {

    @FindBy(xpath = ConstantsForTesting.FINAL_PRICE_ELEMENT_XPATH)
    private WebElement finalPriceElement;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public ArrayList<Pizza> getPizzasInCart(ArrayList<Pizza> pizzasInCartElementsXPaths) {
        ArrayList<Pizza> pizzasInCart = new ArrayList<>();
        for (int i = 0; i < pizzasInCartElementsXPaths.size(); i++)
            pizzasInCart.add(new Pizza(false, webDriver.findElement(By.xpath(pizzasInCartElementsXPaths.get(i).getNameXPath())).getText(),
                            webDriver.findElement(By.xpath(pizzasInCartElementsXPaths.get(i).getCostXPath())).getText(),
                            webDriver.findElement(By.xpath(pizzasInCartElementsXPaths.get(i).getSizeXPath())).getText()));
        return pizzasInCart;
    }

    public String getFinalPrice() {
        return finalPriceElement.getText();
    }
}
