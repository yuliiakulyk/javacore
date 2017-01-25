package com.yuliiakulyk.app.homework.lesson23.tests;

import com.yuliiakulyk.app.homework.lesson23.pages.InfoEntrepreneurPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuliia Kulyk on 06.01.2017.
 */
public class InfoEntrepreneurPageTest extends EquerestBaseTest {
    InfoEntrepreneurPage page;
    String targetUrl = page.urlHome + "1/register#/entrepreneur";

    @Before
    public void setUpInfoPage() {
        page = PageFactory.initElements(driver, InfoEntrepreneurPage.class);
        driver.get(page.infoEntrepreneurUrl);
    }

    @Test
    public void check1ButtonLink() {
        page.submitProject1Button.click();
        Assert.assertEquals(targetUrl, driver.getCurrentUrl());
    }

    @Test
    public void check2ButtonLink() {
        page.submitProject2Button.click();
        Assert.assertEquals(targetUrl, driver.getCurrentUrl());
    }

    @Test
    public void check3ButtonLink() {
        page.submitProject3Button.click();
        Assert.assertEquals(targetUrl, driver.getCurrentUrl());
    }

}
