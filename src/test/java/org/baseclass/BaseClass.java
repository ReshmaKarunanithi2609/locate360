package org.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public static WebDriver driver;

    
    public static void launchBrowser() {
    	if(driver== null) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    }
    public static void loadUrl(String url) {
        driver.get(url);
    }

    public static void typeText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static void clickBtn(WebElement element) {
        element.click();
    }

    public static void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public static void quitBrowser() {
        if (driver != null) driver.quit();
    }
    public static void jsType(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "';", element);
    }

    public void takeScreenShot(String fileName) {
        try {
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("./Screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            
        }
    }
}