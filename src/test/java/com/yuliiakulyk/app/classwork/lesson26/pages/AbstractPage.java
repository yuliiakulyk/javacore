package com.yuliiakulyk.app.classwork.lesson26.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Yuliia Kulyk on 21.01.2017.
 */
public class AbstractPage {
        WebDriver driver;
        public static final String BASE_URL = "https://dev.equerest.com/";

        public AbstractPage(WebDriver driver, String url){
            this.driver = driver;
            driver.navigate().to(url);
        }
        public AbstractPage(WebDriver driver){
            this.driver = driver;
        }

        public void clickJS(By locator){
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(locator));
        }

        public void scrollTo(WebElement element) {

            String scrollElementIntoMiddle =
                    "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                            + "var elementTop = arguments[0].getBoundingClientRect().top;"
                            + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

            ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
        }

}
