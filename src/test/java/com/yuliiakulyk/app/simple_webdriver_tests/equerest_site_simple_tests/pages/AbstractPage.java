package com.yuliiakulyk.app.simple_webdriver_tests.equerest_site_simple_tests.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Yuliia Kulyk on 21.12.2016.
 */
public abstract class AbstractPage {
    WebDriver driver;
    public static final String BASE_URL = "https://equerest.com/";

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}
