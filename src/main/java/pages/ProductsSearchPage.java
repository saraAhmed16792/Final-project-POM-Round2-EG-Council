package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsSearchPage extends BasePage{
    public ProductsSearchPage (WebDriver driver){
        super(driver);
    }

    //Verifiy that all search result contain the search keyword.
    By allProductsContainTxt = By.xpath("//*[@class=\"features_items\"]");

    public String getAllProductsContainTxt(){
        this.scrollVertically(300);

        return getTextOfWebElement(allProductsContainTxt);
    }

}
