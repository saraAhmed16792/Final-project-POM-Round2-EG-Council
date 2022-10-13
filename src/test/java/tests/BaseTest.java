package tests;

import static fileReadermanager.ReadFromFiles.getPropertyByKey;

import fileReadermanager.ReadFromFiles;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    public static String configPropertyFileName = "configurationData.properties";

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get(getPropertyByKey(configPropertyFileName, "App_URL"));
    }

    @AfterMethod

    public void takeScreenShotUponFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("./screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @AfterMethod
    public void z_quitDriver() {
    }

}


