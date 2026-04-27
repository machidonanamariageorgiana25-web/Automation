package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    By productName = By.xpath("//h1[@data-test='product-name']");
    By productPrice = By.xpath("//span[@data-test='unit-price']");
    By addToCart = By.xpath("//button[@data-test='add-to-cart']");
    By goToMeniu = By.xpath("//a[@data-test='nav-cart']");
    public ProductPage(WebDriver driver){
        super(driver);
    }
    public String getproductName(){
        return getText(productName);
    }
    public String getproductPrice(){
        String priceText = getText(productPrice);
        return priceText;
    }
    public void addtoCart(){
        click(addToCart);
    }
    public void goToMeniu(){
        click(goToMeniu);
    }
}
