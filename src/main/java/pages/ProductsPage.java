package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage  extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By allProductsTxt = By.className("title");
    By searchProductsField = By.xpath("//*[@id=\"search_product\"]");
    By searchBtn = By.xpath("//*[@id=\"submit_search\"]");
    By getSearchedProducts= By.xpath("//div[@class=\"features_items\"]/div");


    public String getAllProductsTxt() {
        return getTextOfWebElement(allProductsTxt);
    }

    public ProductsSearchPage typeOnSearchField(String productName) {
        this.typeOnInputField(searchProductsField, productName);
        return new ProductsSearchPage(driver);
    }
    public void clickOnSearchBtn (){
        clickElement(searchBtn);
    }

    public int getSizeOfProducts() {
        return this.locateListOfElement(this.getSearchedProducts).size();
    }



}




