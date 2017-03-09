package com.yuliiakulyk.app.anywayanyday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPage extends BasePage {
    public By inputAirportFrom = By.cssSelector("input.ui-input-filed.city-field");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkFieldActive(By inputField) {
        WebElement element = driver.findElement(inputField);
        element.click();
        WebElement activeElement = driver.switchTo().activeElement();
        return element.getAttribute("placeholder").equals(activeElement.getAttribute("placeholder"));
    }
}
