package com.yuliiakulyk.app.anywayanyday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPage extends BasePage {
    public By inputAirportFrom = By.cssSelector("div.ui-input.departure-airport.col100");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkFieldActive(By inputField) {
        WebElement element = driver.findElement(inputField);
        element.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return element.equals(driver.switchTo().activeElement());
    }
}
