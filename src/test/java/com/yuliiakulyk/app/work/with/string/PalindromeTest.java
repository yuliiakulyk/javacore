package com.yuliiakulyk.app.work.with.string;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Yuliia Kulyk on 06.11.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void prepare() {
        palindrome = new Palindrome();
    }

    @Test
    @FileParameters(value = "src/test/resources/Palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void palindrome1Test(String word, boolean expRes) {
        Assert.assertEquals(expRes, palindrome.isPalindrome1(word));
    }

    @Test
    @FileParameters(value = "src/test/resources/Palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void palindrome2Test(String word, boolean expRes) {
        Assert.assertEquals(expRes, palindrome.isPalindrome2(word));
    }

    @Test
    @FileParameters(value = "src/test/resources/Palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void palindrome3Test(String word, boolean expRes) {
        Assert.assertEquals(expRes, palindrome.isPalindrome3(word));
    }

    @Test
    @FileParameters(value = "src/test/resources/Palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void palindrome4Test(String word, boolean expRes) {
        Assert.assertEquals(expRes, palindrome.isPalindrome4(word));
    }

    @Test
    @FileParameters(value = "src/test/resources/Palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void palindrome5Test(String word, boolean expRes) {
        Assert.assertEquals(expRes, palindrome.isPalindrome5(word));
    }

    @Test
    @FileParameters(value = "src/test/resources/Palindrome.csv", mapper = CsvWithHeaderMapper.class)
    public void palindrome6Test(String word, boolean expRes) {
        Assert.assertEquals(expRes, palindrome.isPalindrome6(word));
    }

}
