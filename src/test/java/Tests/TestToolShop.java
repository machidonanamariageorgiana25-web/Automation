package Tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

import java.time.Duration;

public class TestToolShop {

    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void Test1adaugareProduseInCos(){

        homePage.url();
        homePage.clickOnProduct("Combination Pliers");
        String productName = productPage.getproductName();
        productPage.addtoCart();
        productPage.goToMeniu();
        cartPage.isProductInCart(productName);
      //  Assert.assertTrue(cartPage.isProductInCart(productName));

    }
    @Test
    public void Test2VerificareDetalii(){
        homePage.url();
        homePage.clickOnProduct("Bolt Cutters");

        String name = productPage.getproductName();
        String pret = productPage.getproductPrice();

        Assert.assertFalse(name.isEmpty(), "Numele produsului lipsește din pagină");
        Assert.assertTrue( Double.parseDouble(pret) >0, "Pretul afista este incorect");

        }
    }

