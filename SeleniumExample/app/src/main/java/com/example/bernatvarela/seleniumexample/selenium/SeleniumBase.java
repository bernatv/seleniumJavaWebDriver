package com.example.bernatvarela.seleniumexample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {
    private static final int TIME_OUT = 20;
    private static SeleniumBase instance = null;

    public static SeleniumBase getInstance() {
        if(instance == null) {
            instance = new SeleniumBase();
        }
        return instance;
    }

    public void waitForElementByClassName(WebDriver driver, String id) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        WebElement element =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                By.className(id)
                        ));
    }

    public WebElement findByClassName(WebDriver driver, String className) {
        WebElement webElement = driver.findElement(By.className(className));
        return webElement;
    }
}
