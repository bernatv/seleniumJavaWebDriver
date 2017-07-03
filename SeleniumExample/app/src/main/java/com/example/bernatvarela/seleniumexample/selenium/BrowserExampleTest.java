package com.example.bernatvarela.seleniumexample.selenium;

// Example open chrome tab with selenium chrome web driver
// http://www.qaautomated.com/2016/04/setting-up-selenium-webdriver-in.html

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserExampleTest {
    private static final String URL = "http://qaautomated.blogspot.in";
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test public void openUrl() throws InterruptedException {
        driver.get(URL);
        Thread.sleep(5000);
    }

    @After
    public void onFinish() {
        driver.quit();
        driver = null;
    }
}
