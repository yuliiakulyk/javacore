package com.yuliiakulyk.app.equerest_site_page_factory.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by Yuliia Kulyk on 30.12.2016.
 */
public class RegisterEntrepreneurPage2 extends EquerestBasePage {
    public String radioButtonStageLocator = "div.input-radio-group>div";
    //public String errorProjectName = "input#title~div>div";
    public String errorAdvantages = "textarea#advantages~div[ng-messages = 'e_r_s_two.advantages.$error']>div";
    public String errorRequiredAmount = "input#required_amount~div[ng-messages = 'e_r_s_two.required_amount.$error']>div";
    public String helpRequiredAmount = "input#required_amount~div.field-help";

    @FindBy(how = How.CSS, using = "input#title")
    public WebElement projectNameField;

    @FindBy(how = How.CSS, using = "input#title~div>div")
    public WebElement errorProjectName;

    @FindBy(how = How.CSS, using = "textarea#full_description")
    public WebElement projectDescriptionField;

    @FindBy(how = How.CSS, using = "textarea#full_description~div[ng-messages = 'e_r_s_two.full_description.$error']>div")
    public WebElement errorDescription;

    @FindBy(how = How.CSS, using = "textarea#advantages")
    public WebElement advantagesField;

    @FindBy(how = How.CSS, using = "textarea#advantages~div.field-help")
    public WebElement advantagesHelp;

    @FindBy(how = How.CSS, using = "textarea#monetization_model")
    public WebElement monetizationField;

    @FindBy(how = How.CSS, using = "textarea#monetization_model~div[ng-messages = 'e_r_s_two.monetization_model.$error']>div")
    public WebElement monetizationError;

    @FindBy(how = How.CSS, using = "textarea#monetization_model~div.field-help")
    public WebElement monetizationHelp;

    @FindBy(how = How.CSS, using = "input#sale_sum")
    public WebElement amountField;

    @FindBy(how = How.CSS, using = "input#sale_sum~div[ng-messages = 'e_r_s_two.required_amount.$error']>div")
    public WebElement amountError;

    @FindBy(how = How.CSS, using = "input#sale_sum~div.field-help")
    public WebElement amountHelp;

    @FindBy(how = How.CSS, using = "label[for='checkbox_agree']")
    public WebElement checkboxAgree;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement submitButton;

    @FindBy(how = How.CSS, using = "textarea#full_description~div.field-help")
    public WebElement helpProjectDescription;

    public void fillAllFields(WebDriver driver, String projectName, String projectDescription, int stage, String advantages, String monetization, String sum) {
        projectNameField.sendKeys(projectName);
        projectDescriptionField.sendKeys(projectDescription);
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector(radioButtonStageLocator));
        radiobuttons.get(stage - 1).click();
        advantagesField.sendKeys(advantages);
        monetizationField.sendKeys(monetization);
        amountField.sendKeys(sum);
        Assert.assertEquals("https://equerest.com/register#/entrepreneur/finish", driver.getCurrentUrl());
    }

}
