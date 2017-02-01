package com.yuliiakulyk.app.classwork.UseStringBuilder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Yuliia Kulyk on 16.11.2016.
 */
public class CharsArrayToStringTest {
    CharsArrayToString object;

    @Test
    public void charsArrayToString1() {
        CharsArrayToString object = new CharsArrayToString();
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
        Assert.assertEquals("abcdef", object.charsArrayToString(array));
    }

    @Test
    public void charsArrayToString2() {
        CharsArrayToString object = new CharsArrayToString();
        char[] array = {' ', '3', '6', '/', '.', '&'};
        Assert.assertEquals(" 36/.&", object.charsArrayToString(array));
    }

}
