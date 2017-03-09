package com.yuliiakulyk.app.anywayanyday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public abstract class BaseTest {
    public WebDriver driver = new FirefoxDriver();



    public boolean hasFocus (WebElement inputField) {
        return inputField.equals(driver.switchTo().activeElement());
    }

}
