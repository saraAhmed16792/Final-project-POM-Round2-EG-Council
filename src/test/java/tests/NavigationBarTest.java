package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationBarPage;
import pages.ProductsPage;

public class NavigationBarTest extends BaseTest {
    private NavigationBarPage navigationBarPage;


    @Test
    public void testProductsNavigation() {

        navigationBarPage = new NavigationBarPage(driver);
        ProductsPage productsPage = navigationBarPage.clickOnproductsFromNavBar();
        Assert.assertEquals(productsPage.getAllProductsTxt(), "ALL PRODUCTS");
    }
}

