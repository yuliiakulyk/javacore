package com.yuliiakulyk.app.classwork.lesson26.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yuliia Kulyk on 21.01.2017.
 */
public class AddProjectAsEntrepreneurStepTwoPage extends AbstractPage {

    public By projectName = By.id("title");
    public By projectDescription = By.id("full_description");
    public By radiobutton0 = By.id("radio_0");
    public By radiobutton1 = By.id("radio_1");
    public By radiobutton2 = By.id("radio_2");
    public By radiobutton3 = By.id("radio_3");
    public By advantages = By.id("advantages");
    public By monetizationModel = By.id("monetization_model");
    public By requiredAmount = By.id("required_amount");
    public By checkboxAgree = By.id("checkbox_agree");
    public By endRegistrationButton = By.xpath("//*[@class = 'button button-blue button-next']");
    public By searchButton = By.xpath("//*[@class = 'button button-white']");

    public AddProjectAsEntrepreneurStepTwoPage(WebDriver driver) {
        super(driver);
    }

    public AddProjectAsEntrepreneurStepTwoPage fillStage() {
        clickJS(radiobutton2);
        return this;
    }

    public AddProjectAsEntrepreneurStepTwoPage fillStageByNumber(int number) {
        ArrayList<By> radioButtons = new ArrayList<>();
        radioButtons.addAll(Arrays.asList(radiobutton0, radiobutton1, radiobutton2, radiobutton3));
        clickJS(radioButtons.get(number));
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
