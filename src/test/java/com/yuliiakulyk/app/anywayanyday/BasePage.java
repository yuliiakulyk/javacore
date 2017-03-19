package com.yuliiakulyk.app.anywayanyday;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

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

    @Step("Click on an element")
    public <T extends BasePage> T click(By element, T page) {
        driver.findElement(element).click();
        return page;
    }

    @Step("Fill field with \"{1}\"")
    public <T extends BasePage> T fillField(By fieldBy, String text, T page) {
        WebElement field = driver.findElement(fieldBy);
        field.clear();
        field.sendKeys(text);
        field.sendKeys(Keys.ENTER);
        Assert.assertTrue(field.getAttribute("value").equalsIgnoreCase(text));
        return page;
    }

    @Step("Check field is empty: {0}")
    public <T extends BasePage> T checkFieldEmpty(By field, T page) {
        Assert.assertTrue(driver.findElement(field).getAttribute("value").equals(""));
        return page;
    }

    @Step("Check element is displayed")
    public <T extends BasePage> T  checkElementIsDisplayed(By element, T page) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return page;
    }
}
