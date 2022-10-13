package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.CartPage;
import pages.NavigationBarPage;
import pages.ProductsPage;

public class AddToCartTest extends BaseTest {
    NavigationBarPage navigationBarPage;

    //precondition
    @BeforeMethod
    public void openApp() {

        navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnproductsFromNavBar();
    }

    @Test
    public void testAddToCart() {
        //add products to cart
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.hoverFirstProduct();
        addToCartPage.clickContinueBtn();
        addToCartPage.hoverSecondProduct();
        addToCartPage.clickAddToCart2();
        addToCartPage.openCartPage();
        // User Story 2 The table of the products contain:
        // 6 column (Item, Description, Price, Quantity, Total,Remove)
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getSizeOfColumns(), 6, "The table of products details should have six column");

        Assert.assertEquals(cartPage.getAllColumnTxt(), "Item Description Price Quantity Total Remove");


    }

}
