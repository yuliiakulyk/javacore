package com.yuliiakulyk.app.classwork.lesson6;

import org.junit.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by 123 on 19.10.2016.
 */
public class BasicTests {
    private static final String INPUT_DATA = "src/test/java/com/yuliiakulyk/app/classwork/lesson6/input.txt";
    private static final String EXPECTED_RESULTS = "src/test/java/com/yuliiakulyk/app/classwork/lesson6/expected.txt";
    private static int[] inputData = null;
    private static int[] expectedResults = null;

    @BeforeClass //input data the same for all tests
    public static void preConditionsForClass() throws IOException {
        inputData = readTheFile(INPUT_DATA);
    }

    @Before
    public void preConditionsForTest() throws IOException {
        expectedResults = readTheFile(EXPECTED_RESULTS);
    }

    @Test
    public void aFirstTest() { //because tests in alphabetical order we use 'a', 'b' to order tests
        System.out.println("Simple sorting test");
        Arrays.sort(inputData);
        Assert.assertArrayEquals(expectedResults, inputData);
    }

    @Test
    public void bSecondTest() {
        System.out.println("Parallel sorting test");
        Arrays.parallelSort(inputData);
        Assert.assertArrayEquals(expectedResults, inputData);
    }

    @Ignore
    @Test(timeout = 1000)
    public void infinityTest() {
        while (true) ;
    }

    @Ignore("Not ready yet")
    @Test(timeout = 1000)
    public void thisTestNotready() {
    }

    @After
    public void postConditionsForTest() {
// of course java has garbage collector and this method now useless
// but imagine if as results of our test we have some data in database
// so after steps used to clean things, that will not be clean automatically
        expectedResults = null;
    }

    @AfterClass
    public static void postConditionsForClass() {
        inputData = null;
    }

    public static int[] readTheFile(String path) throws IOException {
        int[] result = null;
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        if ((line = reader.readLine()) != null) {
            String[] array = new String[line.split(",").length];
            array = line.split(",");
            result = fromStringArray(array);
        }
        reader.close();
        return result;
    }

    public static int[] fromStringArray(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.valueOf(array[i]);
        }
        return result;
    }
}
