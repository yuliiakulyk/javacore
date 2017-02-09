package com.yuliiakulyk.app.equerest.site.page.factory.tests;

import com.yuliiakulyk.app.equerest.site.page.factory.pages.RegisterEntrepreneurPage1;
import com.yuliiakulyk.app.equerest.site.page.factory.pages.RegisterEntrepreneurPage2;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuliia Kulyk on 02.01.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class RegisterEntrepreneurPage2TestEquerest extends EquerestBaseTest {
    RegisterEntrepreneurPage2 page2;
    RegisterEntrepreneurPage1 page1;

    @Before
    public void setUpEntrepreneurPage2() {
        page1 = PageFactory.initElements(driver, RegisterEntrepreneurPage1.class);
        driver.get(page1.url);
        page1.fillAllFields("Yuliia", "Kiev", "+380630000000", "test3@test.com", "Qwerty12");
        page1.nextButton.click();
        page2 = PageFactory.initElements(driver, RegisterEntrepreneurPage2.class);
    }

    @Ignore
    @Test
    public void fillAllFields() {
        //page2.fillAllFields(driver,"Shop", "Supermarket", 2, "Supreme quality imported products", "Purchases", "100000");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions = new Actions(driver);
        actions.moveByOffset(page2.checkboxAgree.getLocation().getX() + 3, page2.checkboxAgree.getLocation().getY() + 3).click();
        page2.submitButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Assert.assertEquals("https://equerest.com/register#/entrepreneur/finish", driver.getCurrentUrl());
    }

    @Test
    public void titleFieldEmpty() {
        page2.projectNameField.sendKeys(" ");
        page2.projectDescriptionField.click();
        Assert.assertTrue(page2.errorProjectName.isDisplayed());
    }

    @Test
    public void descriptionFieldEmpty() {
        page2.projectDescriptionField.click();
        page2.advantagesField.click();
        Assert.assertTrue(page2.errorDescription.isDisplayed());
    }

    @Test
    public void descriptionFieldSpaces() {
        page2.projectDescriptionField.sendKeys("   ");
        page2.advantagesField.click();
        Assert.assertTrue(page2.errorDescription.isDisplayed());
    }

    @Test
    public void descriptionFieldHelp() {
        page2.projectDescriptionField.click();
        Assert.assertTrue(page2.helpProjectDescription.isDisplayed());
    }

    @Ignore
    @Test
    public void advantagesEmpty() {
        page2.advantagesField.click();
        page2.monetizationField.click();
        Assert.assertTrue(page2.advantagesHelp.isDisplayed());
    }

    @Test
    public void advantagesHelp() {
        page2.advantagesField.click();
        Assert.assertTrue(page2.advantagesHelp.isDisplayed());
    }

    @Test
    public void monetizationEmpty() {
        page2.monetizationField.click();
        page2.advantagesField.click();
        Assert.assertTrue(page2.monetizationError.isDisplayed());
    }

    @Test
    public void monetizationHelp() {
        page2.monetizationField.click();
        Assert.assertTrue(page2.monetizationHelp.isDisplayed());
    }

    @Ignore
    @Test
    public void amountHelp() {
        page2.amountField.click();
        Assert.assertTrue(page2.amountHelp.isDisplayed());
    }

}
