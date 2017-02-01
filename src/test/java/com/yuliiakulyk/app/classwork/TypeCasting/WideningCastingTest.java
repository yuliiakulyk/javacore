package com.yuliiakulyk.app.classwork.TypeCasting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 123 on 19.10.2016.
 */
public class WideningCastingTest {
    @Test
    public void cast() {
        WideningCasting casting = new WideningCasting();
        double expRes = 57;
        byte byte1 = 57;
        double delta = 0.0001;
        Assert.assertEquals(expRes, casting.widening(byte1), delta);
    }
}
