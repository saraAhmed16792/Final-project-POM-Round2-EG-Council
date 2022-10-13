package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

        WebDriver driver;
        WebDriverWait wait;

        public BasePage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        }

        public WebElement locateElement(By elementLocator) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
            wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
            return driver.findElement(elementLocator);

        }

        //GetTxt
        public String getTextOfWebElement(By elementLocator) {
            return this.locateElement(elementLocator).getText();
        }


        //Click
        public void clickElement(By elementLocator) {
            locateElement(elementLocator).click();

        }

        //Display
        public boolean isElementDisplayedOnPage(By elementLocator) {
            return this.locateElement(elementLocator).isDisplayed();
        }

        //Type
        public void typeOnInputField(By elementLocator, String text) {

            this.locateElement(elementLocator).sendKeys(new CharSequence[]{text});

        }

        public void hoverOverElement(By elementLocator) {
            Actions actions = new Actions(this.driver);
            actions.moveToElement(this.locateElement(elementLocator)).perform();
        }
    public void forceClickOnElement(By elmentLocator) {
        WebElement elementToClick = this.locateElement(elmentLocator);
        JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("arguments[0].click()", new Object[]{elementToClick});
    }
    public List<WebElement> locateListOfElement(By elementsLocator) {

        return this.driver.findElements(elementsLocator);
    }
    public void scrollVertically(int deltaY) {
        Actions actions = new Actions(this.driver);
        actions.scrollByAmount(0, deltaY).perform();
    }
}




