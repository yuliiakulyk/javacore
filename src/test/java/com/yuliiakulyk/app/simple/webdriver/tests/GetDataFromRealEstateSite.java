package com.yuliiakulyk.app.simple.webdriver.tests;

import com.yuliiakulyk.runners.convertors.and.files.classes.FileWork;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 07.02.2017.
 */
public class GetDataFromRealEstateSite {

    @Test
    public void saveDataByCondo () {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.get("http://www.sunnyislesmiamirealestate.com/Sunny-Isles-Beach/");
        List<WebElement> condosLinks = driver.findElements(By.cssSelector("b"));
        ArrayList<String> linesToSave = new ArrayList<>();
        StringBuilder infoOnCondo;
        StringBuilder builder;
        int num;
        for (int i = 1; i < condosLinks.size(); i++) {
            infoOnCondo = new StringBuilder("");
            builder = new StringBuilder("");
            infoOnCondo.append(condosLinks.get(i).getAttribute("linkText"));
            condosLinks.get(i).click();
            builder.append(driver.findElement(By.id("countSale")).getText() + ", ");
            for (int j = 0; j < builder.length(); j++) {
                if (Character.isDigit(builder.charAt(j))) {
                    infoOnCondo.append(builder.charAt(j));
                } else {
                    break;
                }
            }
            infoOnCondo.append(", ");
            driver.findElement(By.id("tab2")).click();
            builder = new StringBuilder(driver.findElement(By.id("countRent")).getText());
            for (int k = 0; k < builder.length(); k++) {
                if (Character.isDigit(builder.charAt(k))) {
                    infoOnCondo.append(builder.charAt(k));
                } else {
                    break;
                }
            }
            linesToSave.add(infoOnCondo.toString());
        }
        String[] linesToWrite = linesToSave.toArray(new String[linesToSave.size()]);
        FileWork fileWork = new FileWork();
        fileWork.writeFileLines(linesToWrite, "src/test/resources/InfoOnCondos.txt");
        driver.quit();
    }
}
