package com.yuliiakulyk.app.homework.lesson21;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 18.12.2016.
 */
public class EquerestTestCases {
    WebDriver driver;
    String home = "https://equerest.com/";
    String projects = home + "catalog#/";
    String mission = home + "info/mission";
    String entrepreneur = home + "info/entrepreneur";
    String dropdownStatus = "*#filter-selector";
    String dropdownStage = "*#filter-stage";
    String projectNames = "h4.title.ng-binding";
    String entrepreneurRegister = home + "register#/entrepreneur";
    String emptyNameErrorMessage = "div[ng-messages='e_r_s_one.fio.$error']";

    @Before
    public void preconditions() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @Test
    public void checkLinkOfMissionButton() {
        driver.get(home);
        threadSleep(driver);
        WebElement button = driver.findElement(By.cssSelector("div.controls > *:first-child"));
        button.click();
        threadSleep(driver);
        Assert.assertTrue(driver.getCurrentUrl().equals(mission));
    }

    @Test
    public void checkLinkToMoreNewProjects() {
        driver.get(home);
        threadSleep(driver);
        WebElement link = driver.findElement(By.linkText("Больше новых проектов"));
        link.click();
        threadSleep(driver);
        Assert.assertTrue(driver.getCurrentUrl().equals(projects));
    }

    @Test
    public void checkFilterInvested() {
        driver.get(projects);
        threadSleep(driver);
        WebElement dropdown = driver.findElement(By.cssSelector(dropdownStatus));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        dropdown = driver.findElement(By.cssSelector(dropdownStage));
        select = new Select(dropdown);
        select.selectByIndex(1);
        threadSleep(driver);
        List<WebElement> investedSeedProjects = driver.findElements(By.cssSelector(projectNames));
        boolean pass = true;
        String project1 = "Pickoose (Seed)";
        String project2 = "Молоток (Seed)";
        boolean pr1Found = false;
        boolean pr2Found = false;
        for (int i = 0; i < investedSeedProjects.size(); i++) {
            WebElement element = investedSeedProjects.get(i);
            if (element.getText().equals(project1)) {
                pr1Found = true;
            }
            if (element.getText().equals(project2)) {
                pr2Found = true;
            }
        }
        Assert.assertTrue(pr1Found && pr2Found);
    }

    @Test
    public void entrepreneur3ButtonsToSubmitProject() {
        driver.get(entrepreneur);
        threadSleep(driver);
        Assert.assertEquals(3, driver.findElements(By.cssSelector("a.button.button-orange.bordered")).size());
    }

    @Test
    public void checkFilterSearchingForInvestment() {
        driver.get(projects);
        WebElement dropdown = driver.findElement(By.cssSelector(dropdownStatus));
        Select lookingForInvestmentOption = new Select(dropdown);
        lookingForInvestmentOption.selectByIndex(1);
        threadSleep(driver);
        List<WebElement> pages = driver.findElements(By.cssSelector("li.ng-scope"));
        List<WebElement> searchResultsOnPage;
        boolean pass = true;
        for (int i = 0; i < pages.size(); i++) {
            pages.get(i).click();
            threadSleep(driver);
            searchResultsOnPage = driver.findElements(By.cssSelector("div.status>span.ng-binding"));
            for (WebElement status: searchResultsOnPage) {
                if (!status.getText().equals("в поиске инвестиций")) {
                    pass = false;
                    break;
                }
            }
        }
        Assert.assertTrue(pass);
    }

    @Test
    public void entrepreneurEmptyNameError() {
        driver.get(entrepreneurRegister);
        threadSleep(driver);
        driver.findElement(By.cssSelector("input#fio")).click();
        driver.findElement(By.cssSelector("input#cityField")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(emptyNameErrorMessage)).isDisplayed());
    }

    public static void threadSleep(WebDriver driver) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void postconditions() {
        driver.quit();
    }

}
