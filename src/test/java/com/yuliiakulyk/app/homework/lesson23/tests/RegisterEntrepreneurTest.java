package com.yuliiakulyk.app.homework.lesson23.tests;

import com.yuliiakulyk.app.homework.lesson23.pages.RegisterEntrepreneurPage1;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
@RunWith(JUnitParamsRunner.class)
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
        Assert.assertTrue(page.errorPhone.isDisplayed());
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
    @FileParameters(value = "src/test/resources/RegisterEntrepreneurTestEmail.csv", mapper = CsvWithHeaderMapper.class)
    public void checkEmailValidation(String email, int errorMessage) {
        page.emailField.sendKeys(email);
        page.passwordField.click();
        List <WebElement> errorMessages = driver.findElements(By.cssSelector(page.errorEmailLocator));
        Assert.assertEquals(errorMessage, errorMessages.size());
    }

    @Test
    @FileParameters(value = "src/test/resources/RegisterEntrepreneurTestPhone.csv", mapper = CsvWithHeaderMapper.class)
    public void checkPhoneValidation(String phone, int isError) {
        page.phoneField.clear();
        page.phoneField.sendKeys(phone);
        page.passwordField.click();
        List<WebElement> errorMessages = driver.findElements(By.cssSelector(page.errorPhoneLocator));
        Assert.assertEquals(isError, errorMessages.size());
    }

    @Test
    @FileParameters(value = "src/test/resources/RegisterEntrepreneurTestPass.csv", mapper = CsvWithHeaderMapper.class)
    public void checkPasswordValidation(String password, int isError) {
        page.passwordField.clear();
        page.passwordField.sendKeys(password);
        page.phoneField.click();
        List<WebElement> errorMessages = driver.findElements(By.cssSelector(page.errorPasswordLocator));
        Assert.assertEquals(isError, errorMessages.size());
    }

}
