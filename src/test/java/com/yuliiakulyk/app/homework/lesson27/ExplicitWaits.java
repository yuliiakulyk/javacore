package com.yuliiakulyk.app.homework.lesson27;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 23.01.2017.
 */
public class ExplicitWaits {

    @Test
    public void WaitUntilElementVisible() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.anywayanyday.com/");
        driver.findElement(By.cssSelector("div.ui-input.departure-airport.col50>div>input"))
                .sendKeys("KBP");
        driver.findElement(By.cssSelector("div.ui-input.arrival-airport.col50>div>input"))
                .sendKeys("AMS");
        driver.findElement(By.cssSelector("div.ui-input.ui-input-date.date.col100")).click();
        WebDriverWait waitDate = new WebDriverWait(driver, 2);
        WebElement calendarDate = waitDate.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("td.day.today")));
        calendarDate.click();
        driver.findElement(By.xpath("(//a[.='Найти'])[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.offers-airlines-switch_option")));
        Assert.assertTrue(driver.findElement(By.cssSelector("span.offers-airlines-switch_option")).isEnabled());
        driver.quit();
    }
}
