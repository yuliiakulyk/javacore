package com.yuliiakulyk.app.utils;

import com.yuliiakulyk.runners.convertors_and_files.classes.FileWork;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Yuliia Kulyk on 22.11.2016.
 */

public class FileWorkTest {
    FileWork fileWork;

    @Before
    public void createObject() {
        fileWork = new FileWork();
    }

    @Test
    public void readFileLinesTest() {
        String[] arrayExp = {
                "hello",
                "world",
                "",
                "anna",
                "ASCII stands for American Standard Code for Information Interchange.",
                "wow",
                "0",
                "qwewq",
                "Computers can only understand numbers.",
                "Bob"
        };
        String[] arrayAct = fileWork.readFileLines("src/test/resources/FileWorkTest-readFileLines.txt");
        Assert.assertArrayEquals(arrayExp, arrayAct);
    }

    @Test
    public void writeFileLinesTest() {
        String[] info = {
                "abcdefxyz",
                "ABCDEFXYZ",
                "",
                "01237890",
                ".,?- "
        };
        fileWork.writeFileLines(info, "src/test/resources/writeFileLinesOutput.txt");
        boolean areEqual = true;
        String lineExp;
        String lineAct;
        try {
            BufferedReader readerExp = new BufferedReader(new FileReader("src/test/resources/writeFileLinesOutput.txt"));
            BufferedReader readerAct = new BufferedReader(new FileReader("src/test/resources/writeFileLinesOutput.txt"));
            while (((lineExp = readerExp.readLine()) != null)&&((lineAct = readerAct.readLine()) != null)) {
                if (!lineExp.equals(lineAct)) {
                    areEqual = false;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(true, areEqual);
    }

}
