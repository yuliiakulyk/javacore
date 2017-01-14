package com.yuliiakulyk.app.classwork.lesson24;

import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by Yuliia Kulyk on 14.01.2017.
 */
@Title("This is our cool test suite")
@Description("In this cool suite we will test only cool features") public class SimpleTest {
    @Title("First cool check")
    @Description("In this cool test we will check cool thing")
    @Test
    public void firstSimpleTest() {
        checkResult(getDivisionResult(4, 2), 2);
    }

    @Step("Проверка результата вычислений")
    private void checkResult(int actualResult, int expectedResult) {
        Assert.assertTrue("Actual result(" + actualResult + ") not equals to expected(" + expectedResult + ")", actualResult == expectedResult);
    }

    @Step("{0}")
    private void log(String value) { /* empty method to log some values to test report */}

    @Step("Получение результата деления числа {0} на {1}")
    private int getDivisionResult(int firstInt, int secondInt) {
        checkNotZero(secondInt);
        return firstInt / secondInt;
    }

    @Step("Проверка делителя")
    private void checkNotZero(int intValue) {
        saveTextLogMessage("variale attachment", "Value " + new Integer(intValue).toString());
        log("Значение делителя: " + intValue);
        Assert.assertTrue("Делитель равен 0", intValue != 0);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLogMessage(String attachName, String message) {
        return message;
    }
}