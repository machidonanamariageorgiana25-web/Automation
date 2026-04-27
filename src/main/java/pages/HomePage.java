package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage {

    By productItem = By.xpath("(//a[@class='card'])[1]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void url() {
        driver.get("https://practicesoftwaretesting.com/");

    }

    public void clickProduct(){
        click(productItem);
    }

    public void clickOnProduct(String productName) {
        By productLocator = By.xpath(" //h5[normalize-space()='" + productName + "']");
        click(productLocator);
    }

    }








