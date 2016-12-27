package com.yuliiakulyk.app.homework.lesson23;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
public abstract class EquerestBasePage {
    public String url = "https://equerest.com";
//    public WebElement missionMenu;
//    public WebElement entrepreneurMenu;
//    public WebElement investorMenu;
//    public WebElement projectsMenu;
//    public WebElement signIn;
//    public WebElement registerInvestor;
//    public WebElement registerEntrepreneur;

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
