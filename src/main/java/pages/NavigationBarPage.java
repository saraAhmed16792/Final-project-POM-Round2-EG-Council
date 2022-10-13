package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends BasePage{

    //Locators
    By productsFromNavBar = By.cssSelector("a[href=\"/products\"]");



    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }

    //Operations

    public ProductsPage clickOnproductsFromNavBar()
    {
        clickElement(productsFromNavBar);
        return new ProductsPage(driver);

    }

}
