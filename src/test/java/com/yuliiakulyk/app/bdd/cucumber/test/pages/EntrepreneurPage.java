package com.yuliiakulyk.app.bdd.cucumber.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Yuliia Kulyk on 21.01.2017.
 */
public class EntrepreneurPage extends AbstractPage {

        public static final String URL = BASE_URL + "info/entrepreneur";
        private static final By ADD_PROJECT_BUTTON = By.xpath("//*[@href = \"/register#/entrepreneur\"]");

        public EntrepreneurPage(WebDriver driver){
            super(driver, URL);
        }

        public AddProjectAsEntrepreneurStepOnePage clickOnSubmitProjectButton() {
            driver.findElement(ADD_PROJECT_BUTTON).click();
            return new AddProjectAsEntrepreneurStepOnePage(driver);
        }

}
