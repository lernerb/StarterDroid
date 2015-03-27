package com.lernerbrandon.starterdroid.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lernerb on 3/26/15.
 */
public class MathUtilTest  {


    @Test
    public void testAddTen()
    {
        int myVar = MathUtil.addTen(10);
        Assert.assertTrue(myVar == 21); // Change this to 20 to see the tests pass!
    }

    @Test
    public void testRemoveTen()
    {
        int myVar = MathUtil.subtractTen(10);
        Assert.assertTrue(myVar == 0);
    }
}
