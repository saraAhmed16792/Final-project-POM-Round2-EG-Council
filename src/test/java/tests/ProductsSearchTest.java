package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavigationBarPage;
import pages.ProductsPage;
import pages.ProductsSearchPage;

public class ProductsSearchTest extends BaseTest {
    NavigationBarPage navigationBarPage;

    //precondition
    @BeforeMethod
    public void openApp() {

        navigationBarPage = new NavigationBarPage(driver);
        navigationBarPage.clickOnproductsFromNavBar();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.typeOnSearchField("Dress");
        productsPage.clickOnSearchBtn();

    }

    @Test
    public void testProductsSearchPage() {
        // User Story 1 :Verify that all search result contain the search keyword.
        ProductsSearchPage productsSearchPage = new ProductsSearchPage(driver);
        productsSearchPage.getAllProductsContainTxt();
        Assert.assertEquals(productsSearchPage.getAllProductsContainTxt(), "Dress");
    }


}
