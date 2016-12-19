package com.yuliiakulyk.app.homework.lesson21;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 18.12.2016.
 */
public class EquerestTestCases {
    WebDriver driver;
    String home = "https://equerest.com/";

    @Before
    public void preconditions() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @Test
    public void checkLinkOfMissionButton() {
        driver.get(home);
        threadSleep(driver);
        WebElement button = driver.findElement(By.cssSelector("div.controls > *:first-child"));
        button.click();
        threadSleep(driver);
        Assert.assertTrue(driver.getCurrentUrl().equals("https://equerest.com/info/mission"));
    }

    public static void threadSleep(WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void postconditions() {
        driver.quit();
    }

}
