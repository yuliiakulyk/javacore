package com.yuliiakulyk.app.equerest_site_page_factory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
public class RegisterEntrepreneurPage1 extends EquerestBasePage {
    public String url = urlHome + "/register#/entrepreneur";
    public String errorEmailLocator = "input#mail~div.error-message-container.ng-active";
    public String errorPhoneLocator = "input#tel~div[ng-messages='e_r_s_one.tel.$error']>div";
    public String errorPasswordLocator = "input#pass~div[ng-messages='e_r_s_one.pass.$error']>div";


    @FindBy(how = How.ID, using = "fio")
    public WebElement nameField;

    @FindBy(how = How.ID, using = "city")
    public WebElement cityField;

    @FindBy(how = How.ID, using = "tel")
    public WebElement phoneField;

    @FindBy(how = How.ID, using = "mail")
    public WebElement emailField;

    @FindBy(how = How.ID, using = "pass")
    public WebElement passwordField;

    @FindBy(how = How.CSS, using = "div[ng-messages='e_r_s_one.fio.$error']>div")
    public WebElement errorNameRequired;

    @FindBy(how = How.CSS, using = "input#city~div>div[ng-message='required']")
    public WebElement cityError;

    @FindBy(how = How.CSS, using = "input#city~div.field-help")
    public WebElement cityHint;

    @FindBy(how = How.CSS, using = "input#tel~div[ng-messages='e_r_s_one.tel.$error']>div")
    public WebElement errorPhone;

    @FindBy(how = How.CSS, using = "input#tel~div.field-help")
    public WebElement phoneHint;

    @FindBy(how = How.CSS, using = "input#mail~div>div[ng-message='required']")
    public WebElement errorEmailRequired;

    @FindBy(how = How.CSS, using = "input#pass~div>div.error-message")
    public WebElement errorPwdRequired;

    @FindBy(how = How.CSS, using = "input#pass~div.field-help>p")
    public WebElement pwdHint;

    @FindBy(how = How.CSS, using = "button.button-next")
    public WebElement nextButton;

    public void fillAllFields(String name, String city, String phone, String email, String password) {
        nameField.sendKeys(name);
        cityField.sendKeys(city);
        phoneField.clear();
        phoneField.sendKeys(phone);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }
}
