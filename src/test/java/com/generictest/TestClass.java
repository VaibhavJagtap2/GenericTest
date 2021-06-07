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

    @Test
    public void givenFirstFloatAsMaxNumber_ShouldReturnFirstFloatAsMaximum() {
        Double max1 = findMax.testMaximumDouble(20.00, 25.00, 57.00);
        Assert.assertEquals((Double) 57.00, max1);
    }

    @Test
    public void givenSecondFloatAsMaxNumber_ShouldReturnSecondFloatAsMaximum() {
        Double max1 = findMax.testMaximumDouble(7.00, 12.00, 15.44);
        Assert.assertEquals((Double) 15.44, max1);
    }

    @Test
    public void givenThirdFloatAsMaxNumber_ShouldReturnThirdFloatAsMaximum() {
        Double max1 = findMax.testMaximumDouble(71.00, 129.00, 125.44);
        Assert.assertEquals((Double) 129.00, max1);
    }
    @Test
    public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum(){
        String max2 = findMax.testMaximumString("Vaibhav", "Suraj", "Parag");
        Assert.assertEquals((String) "Vaibhav", max2);
    }
    @Test
    public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum(){
        String max2 = findMax.testMaximumString("Suraj", "Vaibhav", "Parag");
        Assert.assertEquals((String) "Vaibhav", max2);
    }
    @Test
    public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum(){
        String max2 = findMax.testMaximumString("Vaibhav", "Parag", "Suraj");
        Assert.assertEquals((String) "Vaibhav", max2);
    }
}