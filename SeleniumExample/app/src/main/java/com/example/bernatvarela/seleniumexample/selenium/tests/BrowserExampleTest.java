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

import static junit.framework.Assert.assertEquals;

public class BrowserExampleTest {
    private static final String URL = "http://qaautomated.blogspot.in";
    private static final String EXPECTED = "The Art of Manual to Automation";
    private static final String SITE_DESCRIPTIONPBT = "site-descriptionpbt";
    private WebDriver driver;
    private SeleniumBase seleniumBase;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        seleniumBase = SeleniumBase.getInstance();
    }

    @Test public void pageShouldBeOpened() throws InterruptedException {
        driver.get(URL);
        WebElement webElement = driver.findElement(By.id("pagepbt"));
        Assert.assertNotNull(webElement);
    }

    @Test public void subtitleShouldBeExpected() throws InterruptedException {
        String title;
        driver.get(URL);
        WebElement webElement = seleniumBase.findByClassName(driver, SITE_DESCRIPTIONPBT);
        title = webElement.getText();
        assertEquals(EXPECTED, title);
    }

    @After
    public void onFinish() {
        driver.quit();
        driver = null;
    }
}
