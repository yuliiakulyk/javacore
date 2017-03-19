package com.yuliiakulyk.app.anywayanyday;

import com.yuliiakulyk.runners.convertors.and.files.classes.FileWork;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
@RunWith(JUnitParamsRunner.class)
public class MainPageTest extends BaseTest {
    public MainPage page;
    public String cityFromCode = "kbp";
    public String cityToCode = "cdg";
    public int maxPassengers = 9;
    public int maxAdults = 6;
    public int maxChildren = 4;
    public int maxInfants = 2;
    public int daysToDeparture = 5;

    @Before
    public void preconditions() {
        page = new MainPage(driver);
        driver.get(page.baseUrlBegginning + page.baseUrlEnd);
    }

    @Title("Check field is active on click")
    @Description("Check city from is active")
    @Test
    public void checkCityFromActive() {
        Assert.assertTrue(page.checkFieldActive(page.inputAirportFrom));
    }

    @Title("Check field is active on click")
    @Description("Check city to is active")
    @Test
    public void checkCityToActive() {
        Assert.assertTrue(page.checkFieldActive(page.inputAirportTo));
    }

    @Title("Check geo suggestions")
    @Description("Check city from suggestions of multiple airports")
    @Test
    public void checkCityFromMultipleSuggestions() {
        Assert.assertTrue(page.numberOfGeoSuggests("Paris", page.inputAirportFrom) >= 2);
    }

    @Title("Check geo suggestions")
    @Description("Check city to suggestions of multiple airports")
    @Test
    public void checkCityToMultipleSuggestions() {
        Assert.assertTrue(page.numberOfGeoSuggests("Paris", page.inputAirportTo) >= 2);
    }

    @Title("Check geo suggestions")
    @Description("Check airport codes are recognized in city from field")
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

    @Title("Check geo suggestions")
    @Description("Check airport codes are recognized in city to field")
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
        Assert.assertTrue(!driver.findElement(page.returnFlightButton).getAttribute("class").contains("disabled"));
    }

    @Test
    public void checkReverseFlightForm() {
        page.fillAllFields(cityFromCode, cityToCode, daysToDeparture)
                .click(page.returnFlightButton, page)
                .checkElementIsDisplayed(page.tripInfoContainer, page)
                .checkElementIsDisplayed(page.inputAirportFrom, page)
                .checkElementIsDisplayed(page.inputAirportTo, page)
                .checkElementIsDisplayed(page.departureDateButton, page);
        Assert.assertTrue(driver.findElement(page.recognizedAirportCodeCityFrom).getText().equalsIgnoreCase(cityToCode));
        Assert.assertTrue(driver.findElement(page.recognizedAirportCodeCityTo).getText().equalsIgnoreCase(cityFromCode));
    }

    @Test
    public void checkAnotherFlightButton() {
        page.fillAllFields(cityFromCode, cityToCode, daysToDeparture);
        driver.findElement(page.anotherDestinationButton).click();
        page.checkElementIsDisplayed(page.tripInfoContainer, page)
                .checkElementIsDisplayed(page.inputAirportFrom, page)
                .checkElementIsDisplayed(page.inputAirportTo, page)
                .checkElementIsDisplayed(page.departureDateButton, page);
        Assert.assertTrue(driver.findElement(page.recognizedAirportCodeCityFrom).getText().equalsIgnoreCase(cityToCode));
    }

    @Test
    public void checkPassengersCounterAppear() {
        driver.findElement(page.passengersButton).click();
        page.checkElementIsDisplayed(page.adults, page)
                .checkElementIsDisplayed(page.children, page)
                .checkElementIsDisplayed(page.infants, page);
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

    @Test
    public void checkMaxInfants() {
        page.changeAdults(MainPage.Action.INCREASE, maxInfants - 1, MainPage.CounterChange.YES)
                .changeInfants(MainPage.Action.INCREASE, maxInfants, MainPage.CounterChange.YES);
    }

    @Test
    public void checkAboveMaxInfants() {
        page.changeAdults(MainPage.Action.INCREASE, maxInfants - 1, MainPage.CounterChange.YES)
                .changeInfants(MainPage.Action.INCREASE, maxInfants, MainPage.CounterChange.YES)
                .changeInfants(MainPage.Action.INCREASE, maxInfants, MainPage.CounterChange.NO);
    }

    @Test
    @FileParameters(value = "src\\test\\java\\com\\yuliiakulyk\\app\\anywayanyday\\maxpassengers.txt", mapper = CsvWithHeaderMapper.class)
    public void checkMaxPassengers(int adults, int children, int infants, String excessPassenger) {
        page.changeAdults(MainPage.Action.INCREASE, adults - 1, MainPage.CounterChange.YES)
                .changeChildren(MainPage.Action.INCREASE, children, MainPage.CounterChange.YES)
                .changeInfants(MainPage.Action.INCREASE, infants, MainPage.CounterChange.YES);
        switch (excessPassenger) {
            case "adult":
                page.changeAdults(MainPage.Action.INCREASE, 1, MainPage.CounterChange.NO);
                break;
            case "child":
                page.changeChildren(MainPage.Action.INCREASE, 1, MainPage.CounterChange.NO);
                break;
            case "infant":
                page.changeInfants(MainPage.Action.INCREASE, 1, MainPage.CounterChange.NO);
                break;
            default:
                break;
        }
    }

    @Test
    @Title("Check clear button")
    @Description("1-way trip without changing planes")
    public void checkClearButton1WayTrip() {
        page.fillAllFields(cityFromCode, cityToCode, daysToDeparture)
                .checkElementIsDisplayed(page.clearButton, page)
                .click(page.clearButton, page)
                .checkFieldEmpty(page.inputAirportFrom, page)
                .checkFieldEmpty(page.inputAirportTo, page)
                .checkElementIsDisplayed(page.departureDateButton, page);
    }

    @Test
    @Title("Check clear button")
    @Description("Trip with return flight")
    public void checkClearButtonReturnFlight() {
        page.fillAllFields(cityFromCode, cityToCode, daysToDeparture)
                .checkElementIsDisplayed(page.clearButton, page)
                .click(page.returnFlightButton, page)
                .click(page.departureDateButton, page)
                .fillDate(daysToDeparture + 2)
                .click(page.clearButton, page)
                .checkFieldEmpty(page.inputAirportTo, page)
                .checkElementIsDisplayed(page.departureDateButton, page);
    }
    
}