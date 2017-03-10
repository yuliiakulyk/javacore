package com.yuliiakulyk.app.anywayanyday;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPage extends BasePage {
    public By inputAirportFrom = By.cssSelector("input.ui-input-filed.city-field");
    public By inputAirportTo = By.cssSelector("div.ui-input.arrival-airport.col100>div>input");
    public By geoSuggest = By.cssSelector("ul.geo-suggest>li");
    public By recognizedAirportCodeCityFrom = By.cssSelector("div.ui-input.departure-airport.col100>span.airport-code");
    public By recognizedAirportCodeCityTo = By.cssSelector("div.ui-input.arrival-airport.col100>span.airport-code");
    public By geoSuggestAirportCodes = By.cssSelector("ul.geo-suggest>li>div.code");

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
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        List<WebElement> geoSuggests = driver.findElements(geoSuggestAirportCodes);
        if (geoSuggests.size() > 0) {
            int rightSuggestion = -1;
            for (int i = 0; i < geoSuggests.size(); i++) {
                if (geoSuggests.get(i).getText().equals(code)) {
                    rightSuggestion = i;
                    geoSuggests.get(i).click();
                }
            }
            if (rightSuggestion == -1) {
                unrecognizedCodes.add(code);
                return;
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(recognizedCode);
        if (!element.getText().equals(code)) {
            unrecognizedCodes.add(code);
        }
    }
}
