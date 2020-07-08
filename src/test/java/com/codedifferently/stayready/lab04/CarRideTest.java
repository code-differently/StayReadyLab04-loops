package com.codedifferently.stayready.lab04;
import org.junit.Assert;
import org.junit.Test;
public class CarRideTest {
    @Test
    public void evalStringTrueTest(){
        // Given : what do we need to run this test?
        CarRide carRide = new CarRide();
        // When : the running of the method being tested
        boolean expected = true;
        boolean actual = carRide.evalString("Yes");
        // Then : making sure that what we expect it to be is correct
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void evalStringFalseTest(){
        // Given : what do we need to run this test?
        CarRide carRide = new CarRide();
        // When : the running of the method being tested
        boolean expected = false;
        boolean actual = carRide.evalString("No");
        // Then : making sure that what we expect it to be is correct
        Assert.assertEquals(expected,actual);
    }
}