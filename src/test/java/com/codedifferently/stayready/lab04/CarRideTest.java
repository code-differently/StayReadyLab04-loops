package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void areWeThereYetYesTest(){
        //Given
        CarRide carRide = new CarRide();

        //When
        Boolean actual = carRide.areWeThereYet("Yes");

        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void areWeThereYetNoTest(){
        //Given
        CarRide carRide = new CarRide();

        //When
        Boolean actual = carRide.areWeThereYet("No");

        //Then
        Assert.assertFalse(actual);


    }


}
