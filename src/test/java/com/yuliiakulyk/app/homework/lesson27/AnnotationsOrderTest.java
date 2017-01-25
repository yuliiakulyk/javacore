package com.yuliiakulyk.app.homework.lesson27;

import org.junit.After;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by Yuliia Kulyk on 25.01.2017.
 */
public class AnnotationsOrderTest {

    @Rule
    public TestWatcher test = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
            System.out.println("succeeded method");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("failed method");
        }

        @Override
        protected void finished(Description description) {
            System.out.println("finished method");
        }
    };

    @After
    public void tearDown() {
        System.out.println("after tearDown method");
    }

    @Test
    public void successfulTest() {
        System.out.println("successful test: 2*2 = 4");
        Assert.assertEquals(4, 2*2);
    }

    @Test
    public void failingTest() {
        System.out.println("failing test: 2*2 = 5");
        Assert.assertEquals(5, 2*2);
    }

}
