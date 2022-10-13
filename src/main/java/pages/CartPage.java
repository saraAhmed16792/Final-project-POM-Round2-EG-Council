package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By cartMenuColumn =By.xpath("//tr[@class=\"cart_menu\"]/td");

    By getAllColumnTxt= By.xpath("//tr[(@class=\"cart_menu\")]");
    By getQuantityOfBlueTop =By.xpath("//*[@id=\"product-1\"]/td[4]/button") ;
    By deleteBlueTop = By.className("cart_quantity_delete");
    By getCartEmptyMsg= By.id("empty_cart");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getSizeOfColumns() {
        return this.locateListOfElement(this.cartMenuColumn).size();
    }
    public String getAllColumnTxt(){
        return getTextOfWebElement(getAllColumnTxt);
    }
    public int getQuantityNumber(){
        return Integer.parseInt(getTextOfWebElement(getQuantityOfBlueTop));
    }
    public void clickOnXSign(){
        clickElement(deleteBlueTop);
    }

    public String getGetCartEmptyMsg(){
        return getTextOfWebElement(getCartEmptyMsg);
    }


}
