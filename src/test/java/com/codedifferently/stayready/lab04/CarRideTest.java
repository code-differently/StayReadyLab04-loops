package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void areWeThereYetYesTest(){
        //Given 
        CarRide carRide = new CarRide();
        String expected = "Good";
 
        //When
        String actual = carRide.areWeThereYetTest("Yes");
 
        //Then
        Assert.assertEquals(expected, actual);
    }
 
    @Test 
    public void areWeThereYetNoTest(){
        CarRide carRide = new CarRide();
        String expected = "Are we there yet?";
 
        String actual = carRide.areWeThereYetTest("No");
 
        Assert.assertEquals(expected, actual);
 
    }
 
}
