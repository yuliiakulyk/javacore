package com.yuliiakulyk.app.anywayanyday;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPage extends BasePage {
    public By inputAirportFrom = By.cssSelector("input.ui-input-filed.city-field");
    public By inputAirportTo = By.cssSelector("div.ui-input.arrival-airport.col100>div>input");
    public By geoSuggest = By.cssSelector("ul.geo-suggest>li");
    public By recognizedAirportCodeCityFrom = By.cssSelector("div.ui-input.departure-airport.col100>span.airport-code");
    public By recognizedAirportCodeCityTo = By.cssSelector("div.ui-input.arrival-airport.col100>span.airport-code");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkFieldActive(By inputField) {
        WebElement element = driver.findElement(inputField);
        element.click();
        WebElement activeElement = driver.switchTo().activeElement();
        return element.getAttribute("placeholder").equals(activeElement.getAttribute("placeholder"));
    }

    public int numberOfGeoSuggests(String city, By inputField) {
        driver.findElement(inputField).sendKeys(city);
        List<WebElement> suggestions = driver.findElements(geoSuggest);
        return suggestions.size();
    }

    @Step("Check airpost with code [1]")
    public void checkOneCode(By inputField, String code, By recognizedCode, ArrayList<String> unrecognizedCodes) {
        WebElement field = driver.findElement(inputField);
        field.clear();
        field.sendKeys(code);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        field.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(recognizedCode);
        if (!element.getText().equals(code)) {
            unrecognizedCodes.add(code);
        }
    }
}
