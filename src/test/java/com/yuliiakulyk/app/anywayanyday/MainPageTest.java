package com.yuliiakulyk.app.anywayanyday;

import com.yuliiakulyk.runners.convertors.and.files.classes.FileWork;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPageTest extends BaseTest {
    public MainPage page;
    public String cityFromCode = "kbp";
    public String cityToCode = "kbp";
    public int maxPassengers = 9;
    public int maxAdults = 6;
    public int maxChildren = 4;
    public int maxInfants = 2;

    @Before
    public void preconditions() {
        page = new MainPage(driver);
        driver.get(page.baseUrlBegginning + page.baseUrlEnd);
    }

    @Test
    public void checkCityFromActive() {
        Assert.assertTrue(page.checkFieldActive(page.inputAirportFrom));
    }

    @Test
    public void checkCityToActive() {
        Assert.assertTrue(page.checkFieldActive(page.inputAirportTo));
    }

    @Test
    public void checkCityFromMultipleSuggestions() {
        Assert.assertTrue(page.numberOfGeoSuggests("Paris", page.inputAirportFrom) >= 2);
    }

    @Test
    public void checkCityToMultipleSuggestions() {
        Assert.assertTrue(page.numberOfGeoSuggests("Paris", page.inputAirportTo) >= 2);
    }

    @Test
    public void checkRecognitionOfAirportCodesCityFrom() {
        FileWork fileWork = new FileWork();
        String[] airportCodes = fileWork.readFileLines("src/test/java/com/yuliiakulyk/app/anywayanyday/airportcodes.txt");
        ArrayList<String> unrecognizedCodes = new ArrayList<>();
        for (int i = 0; i < airportCodes.length; i++) {
            page.checkOneCode(page.inputAirportFrom, airportCodes[i], page.recognizedAirportCodeCityFrom, unrecognizedCodes);
        }
        System.out.println(Arrays.toString(unrecognizedCodes.toArray()));
        Assert.assertEquals(0, unrecognizedCodes.size());
    }

    @Test
    public void checkRecognitionOfAirportCodesCityTo() {
        FileWork fileWork = new FileWork();
        String[] airportCodes = fileWork.readFileLines("src/test/java/com/yuliiakulyk/app/anywayanyday/airportcodes.txt");
        ArrayList<String> unrecognizedCodes = new ArrayList<>();
        for (int i = 0; i < airportCodes.length; i++) {
            page.checkOneCode(page.inputAirportTo, airportCodes[i], page.recognizedAirportCodeCityTo, unrecognizedCodes);
        }
        System.out.println(Arrays.toString(unrecognizedCodes.toArray()));
        Assert.assertEquals(0, unrecognizedCodes.size());
    }

    @Test
    public void checkReverseFlightButtonEnabled() {
        page.fillAllFields(cityFromCode, cityToCode, 5);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(!driver.findElement(page.backFlightButton).getAttribute("class").contains("disabled"));
    }

    @Test
    public void checkReverseFlightForm() {
        page.fillAllFields(cityFromCode, cityToCode, 5)
                .elementIsDisplayed(page.tripInfoContainer)
                .elementIsDisplayed(page.inputAirportFrom)
                .elementIsDisplayed(page.inputAirportTo)
                .elementIsDisplayed(page.departureDayButton);
        Assert.assertTrue(driver.findElement(page.recognizedAirportCodeCityFrom).getText().equalsIgnoreCase(cityToCode));
        Assert.assertTrue(driver.findElement(page.recognizedAirportCodeCityTo).getText().equalsIgnoreCase(cityFromCode));
    }

    @Test
    public void checkAnotherFlightButton() {
        page.fillAllFields(cityFromCode, cityToCode, 5);
        driver.findElement(page.anotherDestinationButton).click();
        page.elementIsDisplayed(page.tripInfoContainer)
                .elementIsDisplayed(page.inputAirportFrom)
                .elementIsDisplayed(page.inputAirportTo)
                .elementIsDisplayed(page.departureDayButton);
        Assert.assertTrue(driver.findElement(page.recognizedAirportCodeCityFrom).getText().equalsIgnoreCase(cityToCode));
    }

    @Test
    public void checkPassengersCounterAppear() {
        driver.findElement(page.passengersButton).click();
        page.elementIsDisplayed(page.adults)
                .elementIsDisplayed(page.children)
                .elementIsDisplayed(page.infants);
    }

    @Test
    public void checkAdultIncrease() {
        page.changeAdults(MainPage.Action.INCREASE, 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkAdultDecrease() {
        page.changeAdults(MainPage.Action.INCREASE, 1, MainPage.CounterChange.YES)
        .changeAdults(MainPage.Action.DECREASE, 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkChildrenIncrease() {
        page.changeChildren(MainPage.Action.INCREASE, 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkChildrenDecrease() {
        page.changeChildren(MainPage.Action.INCREASE, 1, MainPage.CounterChange.YES)
                .changeChildren(MainPage.Action.DECREASE, 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkInfantsIncrease() {
        page.changeInfants(MainPage.Action.INCREASE, 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkInfantsDecrease() {
        page.changeInfants(MainPage.Action.INCREASE, 1, MainPage.CounterChange.YES)
                .changeInfants(MainPage.Action.DECREASE, 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkMaxAdults() {
        page.changeAdults(MainPage.Action.INCREASE, maxAdults - 1, MainPage.CounterChange.YES);
    }

    @Test
    public void checkAboveMaxAdults() {
        page.changeAdults(MainPage.Action.INCREASE, maxAdults - 1, MainPage.CounterChange.YES)
                .changeAdults(MainPage.Action.INCREASE, 1, MainPage.CounterChange.NO);
    }

    @Test
    public void checkMaxChildren() {
        page.changeChildren(MainPage.Action.INCREASE, maxChildren, MainPage.CounterChange.YES);
    }

    @Test
    public void checkAboveMaxChildren() {
        page.changeChildren(MainPage.Action.INCREASE, maxChildren, MainPage.CounterChange.YES)
                .changeChildren(MainPage.Action.INCREASE, 1, MainPage.CounterChange.NO);
    }
}