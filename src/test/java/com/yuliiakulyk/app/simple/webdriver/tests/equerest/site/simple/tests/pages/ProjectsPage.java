package com.yuliiakulyk.app.simple.webdriver.tests.equerest.site.simple.tests.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Yuliia Kulyk on 21.12.2016.
 */
public class ProjectsPage extends AbstractPage {
    public static final String URL = BASE_URL + "catalog#/";

    public ProjectsPage(WebDriver driver) {
        super(driver);
    }
}
