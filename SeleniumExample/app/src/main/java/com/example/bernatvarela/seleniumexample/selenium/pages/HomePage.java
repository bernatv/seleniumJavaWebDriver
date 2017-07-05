package com.example.bernatvarela.seleniumexample.selenium.pages;

import com.example.bernatvarela.seleniumexample.selenium.SeleniumBase;

import org.openqa.selenium.WebElement;

import static com.example.bernatvarela.seleniumexample.selenium.SeleniumDriver.driver;

public class HomePage extends BasePage {
    private static final String URL = "http://www.phptravels.net/";
    public static final String TITLE_CLASS = "fadeInUp.wow.text-center.animated";
    public static final String FEATURED_HOTELS_CLASS = "bgwhite";
    public static final String CAROUSEL_CLASS = "Carousel";

    public static final String TITLE = "Time for Refreshment";

    public void open() {
        driver.get(URL);
    }

    public WebElement getFeaturedHotelsElement() {
        WebElement webElement = SeleniumBase.getInstance().findByClassName(
                driver,
                HomePage.FEATURED_HOTELS_CLASS
        );
        return webElement;
    }
}
