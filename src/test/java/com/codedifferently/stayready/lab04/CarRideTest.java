package com.codedifferently.stayready.lab04;

import org.junit.Test;
import org.junit.Assert;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        //Given
        CarRide newCarRide = new CarRide();
        String expected = "\"Are we there yet?\"" + "\nNo\nAre we there yet?\nSpoons\n\"Are we there yet?\""
        +"\nYes\nGood!\n";

        //When
        String actual = newCarRide.areWeThereYetTest();

        //Then
        Assert.assertEquals(expected, actual);
    }

}