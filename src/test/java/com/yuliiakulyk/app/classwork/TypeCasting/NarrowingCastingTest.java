package com.yuliiakulyk.app.classwork.TypeCasting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 123 on 19.10.2016.
 */
public class NarrowingCastingTest {
    @Test
    public void cast() {
        NarrowingCasting casting = new NarrowingCasting();
        float float1 = 17.99f;
        int expRes = 17;
        Assert.assertEquals(expRes, casting.narrowing(float1));
    }

}
