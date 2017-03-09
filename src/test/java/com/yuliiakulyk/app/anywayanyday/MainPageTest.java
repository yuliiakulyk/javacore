package com.yuliiakulyk.app.anywayanyday;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPageTest extends BaseTest {
    public MainPage page;

    @Before
    public void preconditions() {
        page = new MainPage(driver);
        driver.get(page.baseUrlBegginning + page.baseUrlEnd);
    }

    @Test
    public void checkCityFromActive() {
        Assert.assertTrue(page.checkFieldActive(page.inputAirportFrom));
    }

}
