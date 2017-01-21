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
public class AddProjectAsEntrepreneurStepTwoPage extends AbstractPage {

    public By projectName = By.id("title");
    public By projectDescription = By.id("full_description");
    public By radiobutton = By.id("radio_2");
    public By advantages = By.id("advantages");
    public By monetizationModel = By.id("monetization_model");
    public By requiredAmount = By.id("sale_sum");
    public By checkboxAgree = By.id("checkbox_agree");
    public By endRegistrationButton = By.xpath("//*[@class = 'button button-blue button-next']");
    public By searchButton = By.xpath("//*[@class = 'button button-white']");

    public AddProjectAsEntrepreneurStepTwoPage(WebDriver driver) {
        super(driver);
    }

    public AddProjectAsEntrepreneurStepTwoPage fillStage() {
        clickJS(radiobutton);
        return this;
    }

    public AddProjectAsEntrepreneurStepTwoPage fillField(By name, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(name));
        WebElement webElement = driver.findElement(name);
        scrollTo(driver.findElement(name));
        webElement.clear();
        webElement.sendKeys(text);
        Assert.assertEquals(text, driver.findElement(name).getAttribute("value"));
        return this;
    }

    public AddProjectAsEntrepreneurStepTwoPage clickOnCheckboxAgree() {
        clickJS(checkboxAgree);
        return this;
    }

    public AddProjectAsEntrepreneurStepTwoPage endRegistration() {
        driver.findElement(endRegistrationButton).click();
        WebElement myProjectButton = driver.findElement(searchButton);
        Assert.assertTrue(myProjectButton.getText().contains("Мой проект"));
        myProjectButton.click();
        return new AddProjectAsEntrepreneurStepTwoPage(driver);
    }
}
