package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavigationBarPage;
import pages.ProductsPage;

public class ProductsPageTest extends BaseTest {
    NavigationBarPage navigationBarPage;

    //precondition
    @BeforeMethod
    public void openApp() {

        navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnproductsFromNavBar();
    }

    @Test
    public void testProductsPage() {
        //User Story 2:Check the functionality of the search Btn.
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.typeOnSearchField("Tshirt");
        productsPage.clickOnSearchBtn();
        Assert.assertEquals(productsPage.getAllProductsTxt(), "SEARCHED PRODUCTS");
        Assert.assertEquals(productsPage.getSizeOfProducts(), 7, "Searched Products is 7");


    }
}
