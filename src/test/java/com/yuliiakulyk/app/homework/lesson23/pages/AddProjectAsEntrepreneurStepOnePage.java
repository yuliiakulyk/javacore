package com.yuliiakulyk.app.homework.lesson23.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Yuliia Kulyk on 21.01.2017.
 */
public class AddProjectAsEntrepreneurStepOnePage extends AbstractPage {

    public By name = By.id("fio");
    public By city = By.id("city");
    public By phone = By.id("tel");
    public By email = By.id("mail");
    public By password = By.id("pass");
    public By step2Button = By.xpath("//*[@class = 'button button-blue button-next']");
    public By toastMessage = By.xpath("//*[@class='toast-message']");

    public AddProjectAsEntrepreneurStepOnePage(WebDriver driver) {
        super(driver);
    }

    public AddProjectAsEntrepreneurStepOnePage fillField(By name, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(name));
        WebElement webElement = driver.findElement(name);
        scrollTo(driver.findElement(name));
        webElement.clear();
        webElement.sendKeys(text);
        Assert.assertEquals(text, driver.findElement(name).getAttribute("value"));
        return this;
    }

    public AddProjectAsEntrepreneurStepTwoPage clickOnGoToStep2() {
        driver.findElement(step2Button).click();
        return new AddProjectAsEntrepreneurStepTwoPage(driver);
    }

    public void assertValidationMessage(String alertText) {
        WebElement em = driver.findElement(toastMessage);
        String actualEm = em.getAttribute("aria-label");
        Assert.assertEquals(alertText, actualEm);
    }
}
