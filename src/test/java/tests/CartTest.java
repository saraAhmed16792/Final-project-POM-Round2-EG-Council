package tests;

import io.netty.handler.codec.spdy.SpdyWindowUpdateFrame;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.CartPage;
import pages.NavigationBarPage;

public class CartTest extends BaseTest {
    NavigationBarPage navigationBarPage;

    //precondition
    @BeforeMethod
    public void openApp() {

        navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnproductsFromNavBar();
    }

    @Test(priority = 0)
    public void TestCart() {
        //Check the correctence of the Quantity field.
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.hoverOnBlueTop();
        addToCartPage.clickOnViewCartBlueTop();

        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(cartPage.getQuantityNumber(), 1, "Quantity Should be 1");
    }

    @Test(priority = 1)
    public void testXSign() {
        //Check the functionality of X sign.
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.hoverOnBlueTop();
        addToCartPage.clickOnViewCartBlueTop();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnXSign();
        Assert.assertEquals(cartPage.getGetCartEmptyMsg(), "Cart is empty! Click here to buy products.");

    }

}
