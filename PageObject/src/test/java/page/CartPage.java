package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class CartPage extends AbstractPage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public ArrayList<String> getNamesOfPizzasInCart(ArrayList<String> namesOfPizzasInCartElementsXPaths) {
        ArrayList<String> namesOfPizzasInCart = new ArrayList<>();
        for (String nameOfPizzaInCartElementXPath : namesOfPizzasInCartElementsXPaths)
            namesOfPizzasInCart.add(webDriver.findElement(By.xpath(nameOfPizzaInCartElementXPath)).getText());
        return namesOfPizzasInCart;
    }

    public String getFinalPrice(String finalPriceElementXPath) {
        return webDriver.findElement(By.xpath(finalPriceElementXPath)).getText();
    }
}
