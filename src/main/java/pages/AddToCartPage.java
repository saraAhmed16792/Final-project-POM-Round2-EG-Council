package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage{
    public AddToCartPage (WebDriver driver){
        super(driver);
    }
    //add products to cart
    By addProduct = By.xpath("(//*[@class=\"productinfo text-center\"])[3]");
    By addToCartBtn = By.xpath("(//a[@data-product-id=\"3\"])[1]");
    By continueShoppingBtn = By.xpath("//*[@class=\"btn btn-success close-modal btn-block\"]");
    By addProduct2 = By.xpath("(//*[@class=\"productinfo text-center\"])[5]");
    By addToCartBtn2 =By.xpath("(//a[@data-product-id=\"5\"])[1]");
    By viewCartBtn = By.xpath("(//a[@href=\"/view_cart\"])[2]");
    By addBlueTop = By.xpath("//*[@class=\"single-products\"][1]");
    By addToCartBlueTop = By.xpath("(//*[@data-product-id=\"1\"])[1]");
    By viewCartBlueTop =By.xpath("(//*[@href=\"/view_cart\"])[2]");



    public void hoverFirstProduct() {
        hoverOverElement(addProduct);
        this.forceClickOnElement(this.addToCartBtn);
    }



    public void clickContinueBtn(){
        clickElement(continueShoppingBtn);

    }
    public void hoverSecondProduct() {
        hoverOverElement(addProduct2);}
    public void clickAddToCart2 (){
        clickElement(addToCartBtn2);
    }
    public void openCartPage(){
        clickElement(viewCartBtn);
    }


    public void hoverOnBlueTop() {
        hoverOverElement(addBlueTop);
        this.forceClickOnElement(this.addToCartBlueTop);

    }

    public void clickOnViewCartBlueTop() {
        clickElement(viewCartBlueTop);
    }
}
