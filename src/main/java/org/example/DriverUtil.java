package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverUtil {
    WebDriverWait wait;

    public DriverUtil(ChromeDriver driver) {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public WebElement findElement(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

}
