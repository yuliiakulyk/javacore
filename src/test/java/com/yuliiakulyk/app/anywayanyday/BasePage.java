package com.yuliiakulyk.app.anywayanyday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class BasePage {
    WebDriver driver;
    public String baseUrlBegginning = "https://www.";
    public String baseUrlEnd = "anywayanyday.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillField(WebElement field, String text) {
        field.click();
        field.clear();
        field.sendKeys(text);
    }
}
