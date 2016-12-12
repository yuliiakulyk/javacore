package com.yuliiakulyk.app.homework.lesson20;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 10.12.2016.
 */
public class WebdriverTests {
    WebDriver driver;

    @Before
    public void preconditions() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/123/Documents/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void testContainsWordInPageTitle() {
        driver.get("https://facebook.com");
        Assert.assertTrue(driver.getTitle().contains("Фейсбук"));
    }

    @Test
    public void testContainsElementById() {
        driver.get("https://facebook.com");
        Assert.assertTrue(driver.findElement(By.id("blueBarDOMInspector")).isDisplayed());
        driver.quit();
    }

    @Test
    public void testContainsElementByName() {
        driver.get("https://facebook.com");
        WebElement submitButton = driver.findElement(By.name("websubmit"));
        submitButton.click();
        Assert.assertTrue(submitButton.isDisplayed());
    }

    @Test
    public void testContainsElementByClassName() {
        driver.get("https://facebook.com");
        WebElement background = driver.findElement(By.className("clearfix"));
        Assert.assertTrue(background.isDisplayed());
    }

    @Test
    public void testContainsElementByTagName() {
        driver.get("https://accounts.google.com/ServiceLogin?service=cl&passive=1209600&osid=1&continue=https://calendar.google.com/calendar/render?pli%3D1&followup=https://calendar.google.com/calendar&scc=1#identifier");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.tagName("input")).isEnabled());
    }

    @Test
    public void testContainsElementsByLinkName() {
        driver.get("https://google.com.ua");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("Monkey");
        searchField.submit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List searchResults = driver.findElements(By.partialLinkText("onkey"));
        Assert.assertTrue(searchResults.size() >= 10);
    }

    @Test
    public void testContainsElementByCssSelector() {
        driver.get("https://habrahabr.ru/post/143129/");
        Assert.assertTrue(driver.findElement(By.cssSelector("code.delphi.hljs")).isDisplayed());
    }

    @Test
    public void testContainsElementByXPath() {
        driver.get("https://habrahabr.ru/post/143129/");
        Assert.assertTrue(driver.findElement(By.xpath("/html[@class='no-js fonts-loaded']/body[@class='nl']/div[@class='layout']/div[@class='layout__base']/div[@class='content_wrapper column-wrapper_content']/div[@class='column-wrapper js-sticky-wrapper']/div[@class='content_left js-content_left']/div[@class='post_show']/div[@id='post_143129']/div[@class='post__body post__body_full']/div[@class='content html_format']")).isDisplayed());
    }

    @After
    public void postcondition() {
        driver.quit();
    }
}
