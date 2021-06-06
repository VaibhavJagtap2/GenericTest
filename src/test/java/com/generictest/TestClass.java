package com.generictest;

import org.junit.Assert;
import org.junit.Test;


public class TestClass {
    MaxValue findMax = new MaxValue();

    @Test
    public void givenFirstNumberAsMaxNumber_ShouldReturn_FirstNumberAsMax() {

        Integer maximum = findMax.testMaximumInteger(75, 545, 575);
        Assert.assertEquals((Integer) 575, maximum);
    }

    @Test
    public void givenSecondNumberAsMaxNumber_ShouldReturn_SecondNumberAsMax() {
        Integer maximum1 = findMax.testMaximumInteger(78, 34, 21);
        Assert.assertEquals((Integer) 78, maximum1);
    }

    @Test
    public void givenThirdNumberAsMaxNumber_ShouldReturn_ThirdNumberAsMax() {
        Integer maximum2 = findMax.testMaximumInteger(856, 4453, 34);
        Assert.assertEquals((Integer) 4453, maximum2);
    }
}