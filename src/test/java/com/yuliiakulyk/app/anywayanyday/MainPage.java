package com.yuliiakulyk.app.anywayanyday;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.Iterator;
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
    public By backFlightButton = By.className("back-flight");
    public By dayInCalendar1Month = By.xpath(".//*[@id='sidebar']/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[2]/div[1]/table/tbody/tr/td");
    public By departureDayButton = By.cssSelector("div.ui-input.ui-input-date.date.col100");
    public By dayInCalendar2Month = By.xpath(".//*[@id='sidebar']/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[2]/div[2]/table/tbody/tr/td");
    public By anotherDestinationButton = By.className("empty-flight");
    public By tripInfoContainer = By.className("segment-info-container");
    public By passengersButton = By.cssSelector(".col50.select-passenger.ui-black.ui-black-border");
    public By adults = By.cssSelector("li.ui-select-item-adult");
    public By children = By.cssSelector("li.ui-select-item-children");
    public By infants = By.cssSelector("li.ui-select-item-infant");
    public By rate = By.className("select-rate");
    public By adultsPlus = By.cssSelector("li.ui-select-item-adult>div.container-plus");
    public By adultsMinus = By.cssSelector("li.ui-select-item-adult>div.container-minus");
    public By childrenPlus = By.cssSelector("li.ui-select-item-children>div.container-plus");
    public By childrenMinus = By.cssSelector("li.ui-select-item-children>div.container-minus");
    public By infantsPlus = By.cssSelector("li.ui-select-item-infant>div.container-plus");
    public By infantsMinus = By.cssSelector("li.ui-select-item-infant>div.container-minus");
    public By adultCount = By.cssSelector("span.adult-count");
    public By adultQuantity = By.cssSelector("span.quantity-adult");
    public By childrenCount = By.cssSelector("span.children-count");
    public By childrenQuantity = By.cssSelector("span.quantity-children");
    public By infantCount = By.cssSelector("span.infant-count");
    public By infantQuantity = By.cssSelector("span.quantity-infant");


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

    @Step("Check airport with code {1}")
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

    public MainPage fillCity(By cityField, String text) {
        WebElement field = driver.findElement(cityField);
        field.clear();
        field.sendKeys(text);
        field.sendKeys(Keys.ENTER);
        Assert.assertTrue(field.getAttribute("value").equalsIgnoreCase(text));
        return this;
    }

    public MainPage fillDate(int daysFromToday) {
        driver.findElement(departureDayButton).click();
        List<WebElement> availableDays = driver.findElements(dayInCalendar1Month);
        availableDays.addAll(driver.findElements(dayInCalendar2Month));
        Iterator<WebElement> iter = availableDays.iterator();
        while (iter.hasNext()) {
            WebElement e = iter.next();
            if ((e.getText().equals("")) || (e.getAttribute("class").contains("inactive"))) {
                iter.remove();
            }
        }
        availableDays.get(daysFromToday%availableDays.size()).click();
        return this;
    }

    public MainPage fillAllFields (String cityFrom, String cityTo, int daysFromToday) {
        fillCity(inputAirportFrom, cityFrom);
        fillCity(inputAirportTo, cityTo);
        fillDate(daysFromToday);
        return this;
    }

    public MainPage elementIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }

    public enum Action {
        INCREASE,
        DECREASE
    }

    public enum CounterChange {
        YES,
        NO
    }

    public MainPage changeAdults(Action action, int number, CounterChange counterChange) {
        driver.findElement(passengersButton).click();
        for (int i = 0; i < number; i++) {
            if (action == Action.INCREASE) {
                Assert.assertEquals(checkPassengerCountsChange(adultCount, adultQuantity, Action.INCREASE, adultsPlus),
                        counterChange);
            } else {
                Assert.assertEquals(checkPassengerCountsChange(adultCount, adultQuantity, Action.DECREASE, adultsMinus),
                        counterChange);
            }
        }
        driver.findElement(passengersButton).click();
        return this;
    }

    public MainPage changeChildren(Action action, int number, CounterChange counterChange) {
        driver.findElement(passengersButton).click();
        for (int i = 0; i < number; i++) {
            if (action == Action.INCREASE) {
                Assert.assertEquals(checkPassengerCountsChange(childrenCount, childrenQuantity, Action.INCREASE, childrenPlus),
                        counterChange);
            } else {
                Assert.assertEquals(checkPassengerCountsChange(childrenCount, childrenQuantity, Action.DECREASE, childrenMinus),
                        counterChange);
            }
        }
        driver.findElement(passengersButton).click();
        return this;
    }

    public MainPage changeInfants(Action action, int number, CounterChange counterChange) {
        driver.findElement(passengersButton).click();
        for (int i = 0; i < number; i++) {
            if (action == Action.INCREASE) {
                Assert.assertEquals(checkPassengerCountsChange(infantCount, infantQuantity, Action.INCREASE, infantsPlus),
                        counterChange);
            } else {
                Assert.assertEquals(checkPassengerCountsChange(infantCount, infantQuantity, Action.DECREASE, infantsMinus),
                        counterChange);
            }
        }
        driver.findElement(passengersButton).click();
        return this;
    }

    public CounterChange checkPassengerCountsChange(By count, By quantity, Action action, By plusOrMinusButton) {
        int counter0 = Integer.parseInt(driver.findElement(count).getText());
        int quantity0 = Integer.parseInt(driver.findElement(quantity).getText().substring(2));
        driver.findElement(plusOrMinusButton).click();
        int counter1 = Integer.parseInt(driver.findElement(count).getText());
        int quantity1 = Integer.parseInt(driver.findElement(quantity).getText().substring(2));
        if (action == Action.INCREASE) {
            if ((counter1 - counter0) == 1 && (quantity1 - quantity0) == 1) {
                return CounterChange.YES;
            } else {
                return CounterChange.NO;
            }
        } else {
            if ((counter1 - counter0) == -1 && (quantity1 - quantity0) == -1) {
                return CounterChange.YES;
            } else {
                return CounterChange.NO;
            }
        }
    }
}
