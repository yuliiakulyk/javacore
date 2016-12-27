package com.yuliiakulyk.app.homework.lesson23.tests;

import com.yuliiakulyk.app.homework.lesson23.pages.RegisterEntrepreneurPage1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
public class RegisterEntrepreneurTest extends BaseTest {
    RegisterEntrepreneurPage1 page;

    @Before
    public void setUpEntrepreneur() {
        page = PageFactory.initElements(driver, RegisterEntrepreneurPage1.class);
        driver.get(page.url);
    }

    @Test
    public void fillFirstPart() {
        page.fillAllFields("Yuliia", "Kiev", "+380630000000", "test2@test.com", "Qwerty12");
        page.nextButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://equerest.com/register#/entrepreneur/project");
    }

    @Test
    public void checkNameRequiredMessage() {
        page.nameField.click();
        page.cityField.click();
        Assert.assertTrue(page.errorNameRequired.isDisplayed());
    }

    @Test
    public void checkCityHint() {
        page.cityField.click();
        Assert.assertTrue(page.cityHint.isDisplayed());
    }

    @Test
    public void checkCityRequiredMessage() {
        page.cityField.click();
        page.phoneField.click();
        Assert.assertTrue(page.cityError.isDisplayed());
    }

    @Test
    public void checkPhoneHint() {
        page.phoneField.click();
        Assert.assertTrue(page.phoneHint.isDisplayed());
    }

    @Test
    public void checkPhoneRequiredMessage() {
        page.phoneField.click();
        page.emailField.click();
        Assert.assertTrue(page.errorPhoneFormat.isDisplayed());
    }

    @Test
    public void checkEmailRequiredMessage() {
        page.emailField.click();
        page.passwordField.click();
        Assert.assertTrue(page.errorEmailRequired.isDisplayed());
    }

    @Test
    public void checkPasswordHint() {
        page.passwordField.click();
        Assert.assertTrue(page.pwdHint.isDisplayed());
    }

    @Test
    public void checkPasswordRequiredMessage() {
        page.passwordField.click();
        page.emailField.click();
        Assert.assertTrue(page.errorPwdRequired.isDisplayed());
    }

    @Test
    public void checkEmailValidation() {
        page.emailField.sendKeys("t");
        page.passwordField.click();
        Assert.assertTrue(page.errorEmailFormat.isDisplayed());
    }

}
