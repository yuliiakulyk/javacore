package com.yuliiakulyk.app.homework.lesson23;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
public class RegisterEntrepreneurPage extends EquerestBasePage {

    @FindBy(how = How.ID, using = "fio")
    public WebElement nameField;

    @FindBy(how = How.ID, using = "city")
    public WebElement city;

    @FindBy(how = How.ID, using = "tel")
    public WebElement phone;

    @FindBy(how = How.ID, using = "mail")
    public WebElement email;

    @FindBy(how = How.ID, using = "pass")
    public WebElement password;

    @FindBy(how = How.CSS, using = "div[ng-messages='e_r_s_one.fio.$error']>div")
    public WebElement errorNameRequired;

    @FindBy(how = How.CSS, using = "input#city~div>div[ng-message='required']")
    public WebElement cityError;

    @FindBy(how = How.CSS, using = "input#city~div.field-help")
    public WebElement cityHint;

    @FindBy(how = How.CSS, using = "input#tel~div[ng-messages='e_r_s_one.tel.$error']>div")
    public WebElement errorPhoneFormat;

    @FindBy(how = How.CSS, using = "input#tel~div.field-help")
    public WebElement phoneHint;

    @FindBy(how = How.CSS, using = "input#mail~div>div")
    public WebElement errorEmailRequired;

    @FindBy(how = How.CSS, using = "input#pass~div>div.error-message")
    public WebElement errorPwdRequired;

    @FindBy(how = How.CSS, using = "input#pass~div.field-help")
    public WebElement pwdHint;

}
