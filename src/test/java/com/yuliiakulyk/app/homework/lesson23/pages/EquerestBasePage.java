package com.yuliiakulyk.app.homework.lesson23.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
public abstract class EquerestBasePage {
    public String urlHome = "https://equerest.com";

    @FindBy(how = How.CSS, using = "a[href='/info/mission']")
    public WebElement MissionMenu;

    @FindBy(how = How.CSS, using = "a[href='/info/entrepreneur']")
    public WebElement EntrepreneurMenu;

    @FindBy(how = How.CSS, using = "a[href='/info/investor']")
    public WebElement InvestorMenu;

    @FindBy(how = How.CSS, using = "a[href='/catalog']")
    public WebElement ProjectsMenu;

    @FindBy(how = How.CSS, using = "a[href='/register#/']")
    public WebElement SignIn;

    @FindBy(how = How.CSS, using = "a[href='/register#/investor']")
    public WebElement registerInvestor;

    @FindBy(how = How.CSS, using = "a[href='/register#/entrepreneur']")
    public WebElement registerEntrepreneur;

}
