package com.yuliiakulyk.app.anywayanyday;

import com.yuliiakulyk.runners.convertors.and.files.classes.FileWork;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Yuliia Kulyk on 08.03.2017.
 */
public class MainPageTest extends BaseTest {
    public MainPage page;

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
        //System.out.println(unrecognizedCodes.toArray().toString());
        System.out.println(Arrays.toString(unrecognizedCodes.toArray()));
        Assert.assertEquals(0, unrecognizedCodes.size());
    }



}
