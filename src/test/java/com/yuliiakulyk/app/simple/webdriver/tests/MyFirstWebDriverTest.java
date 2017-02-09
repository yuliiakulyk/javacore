package com.yuliiakulyk.app.simple.webdriver.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Yuliia Kulyk on 07.12.2016.
 */
public class MyFirstWebDriverTest {

    By searchField = By.name("q");
    //By searchResultElementsLink = By.xpath("//*[@class='g']//a");

    @Test
    public void myFirstWebdriverTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua/");
        WebElement searchInput = driver.findElement(searchField);
        searchInput.sendKeys("Monkey");
        searchInput.submit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> linkList = driver.findElements(By.xpath("//*[@class='g']"));
        Assert.assertTrue(linkList.get(0).getText().contains("Monkey"));
        driver.close();
    }
}
