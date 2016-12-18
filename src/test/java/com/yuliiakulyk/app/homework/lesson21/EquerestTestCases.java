package com.yuliiakulyk.app.homework.lesson21;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yuliia Kulyk on 18.12.2016.
 */
public class EquerestTestCases {
    WebDriver driver;
    String home = "https://equerest.com/";

    @Before
    public void preconditions() {
        driver = new FirefoxDriver();
    }

    @Test
    public void checkLinkOfMissionButton() {
        driver.get(home);
    }

    @After
    public void postconditions() {
        driver.quit();
    }

}
