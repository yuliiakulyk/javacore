package com.yuliiakulyk.app.homework.lesson20;

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
 * Created by Yuliia Kulyk on 13.12.2016.
 */
public class CssSelectors {
    WebDriver driver;

    @Before
    public void preconditions() {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");
        WebElement inputField = driver.findElement(By.id("lst-ib"));
        inputField.sendKeys("Monkey");
        inputField.submit();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void cssSelector1() {
        WebElement searchResult = driver.findElement(By.cssSelector("h3.r > a"));
        Assert.assertTrue(searchResult.isDisplayed());
    }

    @Test
    public void cssSelector2() {
        WebElement resultSite = driver.findElement(By.cssSelector("cite._Rm"));
        Assert.assertTrue(resultSite.isDisplayed());
    }

    @Test
    public void cssSelector3() {
        WebElement picturesLink = driver.findElement(By.cssSelector("div.hdtb-mitem>a.q"));
        Assert.assertTrue(picturesLink.isDisplayed() && picturesLink.getText().equals("Картинки"));
    }

    @After
    public void postconditions() {
        driver.quit();
    }
}
