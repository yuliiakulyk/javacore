package com.yuliiakulyk.app.simple.webdriver.tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuliia Kulyk on 24.12.2016.
 */
public class GoogleSRPageTest extends BaseTests{

    @Test
    public void searchForQ() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        driver.get("http://www.google.com");
        GoogleSRPage page = PageFactory.initElements(driver, GoogleSRPage.class);
        page.searchFor("Cheese");
    }
}
