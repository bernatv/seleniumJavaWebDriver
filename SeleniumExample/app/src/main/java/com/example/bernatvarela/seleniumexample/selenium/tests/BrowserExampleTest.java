package com.example.bernatvarela.seleniumexample.selenium.tests;

// Example open chrome tab with selenium chrome web driver
// http://www.qaautomated.com/2016/04/setting-up-selenium-webdriver-in.html

import com.example.bernatvarela.seleniumexample.selenium.SeleniumBase;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserExampleTest {
    private static final String URL = "http://qaautomated.blogspot.in";
    private static final String EXPECTED = "The Art of Manual to Automation";
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test public void openUrl() throws InterruptedException {
        driver.get(URL);
        WebElement webElement = driver.findElement(By.id("pagepbt"));
        Assert.assertNotNull(webElement);
    }

    @Test public void checkSubtitle() throws InterruptedException {
        String title;
        driver.get(URL);
        WebElement webElement = driver.findElement(By.className("site-descriptionpbt"));
        title = webElement.getText();
        SeleniumBase.getInstance().assertEquals(EXPECTED, title);
    }

    @After
    public void onFinish() {
        driver.quit();
        driver = null;
    }
}
