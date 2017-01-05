package com.yuliiakulyk.app.homework.lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Yuliia Kulyk on 15.12.2016.
 */
public class ActionsOnPage {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://trello.com/");
        WebElement loginButton = driver.findElement(By.cssSelector("a[data-track=\"Login\"]"));
        loginButton.click();
        WebElement user = driver.findElement(By.cssSelector("input#user"));
        user.sendKeys("kulik_yulia@mail.ru");
        WebElement password = driver.findElement(By.cssSelector("password"));
        password.submit();
        WebElement welcomeBoard = driver.findElement(By.cssSelector("a[href=\"/b/qWSej42Q/welcome-board\"]"));
        welcomeBoard.click();
        WebElement card = driver.findElement(By.partialLinkText("This is a card"));
    }
}
