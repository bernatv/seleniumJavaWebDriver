package com.example.bernatvarela.seleniumexample.selenium.tests;

// Example open chrome tab with selenium chrome web driver
// http://www.phptravels.net/    demo site

import com.example.bernatvarela.seleniumexample.selenium.SeleniumBase;
import com.example.bernatvarela.seleniumexample.selenium.pages.HomePage;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static com.example.bernatvarela.seleniumexample.selenium.SeleniumDriver.driver;
import static junit.framework.Assert.assertEquals;

public class HomePageTests {
    private static final String EXPECTED = "The Art of Manual to Automation";
    private static final String SITE_DESCRIPTIONPBT = "site-descriptionpbt";
    private static final String PAGE = "page";
    private HomePage homePage;
    private SeleniumBase seleniumBase;

    @Before
    public void setup() {
        homePage = new HomePage();
        seleniumBase = SeleniumBase.getInstance();
    }

    @Test public void pageShouldBeOpened() throws InterruptedException {
        homePage.open();
        WebElement webElement = homePage.getFeaturedHotelsElement();
        Assert.assertNotNull(webElement);
    }

    @Test public void checkTitleHomePage() {
        homePage.open();
        //seleniumBase.waitForElementByClassName(SeleniumDriver.getInstance().getDriver(), );
    }

    @Test public void subtitleShouldBeExpected() throws InterruptedException {
        String title;
        homePage.open();
        WebElement webElement = seleniumBase.findByClassName(
                driver,
                SITE_DESCRIPTIONPBT
        );
        title = webElement.getText();
        assertEquals(EXPECTED, title);
    }

    @After
    public void onFinish() {
        driver.quit();
    }
}
