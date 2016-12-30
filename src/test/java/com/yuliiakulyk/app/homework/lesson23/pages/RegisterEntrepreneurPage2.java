package com.yuliiakulyk.app.homework.lesson23.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuliia Kulyk on 30.12.2016.
 */
public class RegisterEntrepreneurPage2 extends EquerestBasePage {
    public String radioButtonStageLocator = "div.input-radio-group>div";

    @FindBy(how = How.CSS, using = "input#title")
    public WebElement projectNameField;

    @FindBy(how = How.CSS, using = "textarea#full_description")
    public WebElement projectDescriptionField;

    @FindBy(how = How.CSS, using = "textarea#advantages")
    public WebElement advantagesField;

    @FindBy(how = How.CSS, using = "textarea#monetization_model")
    public WebElement monetizationField;

    @FindBy(how = How.CSS, using = "input#required_amount")
    public WebElement amountField;

    @FindBy(how = How.CSS, using = "input#checkbox_agree")
    public WebElement checkboxAgree;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement submitButton;
}
