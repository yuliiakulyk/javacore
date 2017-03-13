package com.yuliiakulyk.app.anywayanyday;

import com.yuliiakulyk.runners.convertors.and.files.classes.FileWork;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

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
    public void checkReverseFlightButton() {
        page.fillCity(page.inputAirportFrom, "kbp")
                .fillCity(page.inputAirportTo, "cdg")
                .fillDate(5);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(!driver.findElement(page.backFlightButton).getAttribute("class").contains("disabled"));
    }

    @Test
    public void testFillDate() {
        page.fillDate(5);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFillDate2() {
        driver.findElement(page.departureDayButton).click();
        driver.findElement(By.xpath(".//*[@id='sidebar']/div/div/div/div/div[2]/div[3]/div/div[5]/div/div[2]/div[1]/table/tbody/tr[3]/td[2]")).click();
        page.fillCity(page.inputAirportFrom, "kbp");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}