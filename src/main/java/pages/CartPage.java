package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }
    public boolean isProductInCart(String productName) {

        By cartItem = By.xpath("//input[@data-test='product-quantity']");
        try {


            return driver.findElement(cartItem).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
