package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;



public class CarRideTest {

    @Test
    public void areWeThereYetTestNo(){
        // Given
        CarRide carRide = new CarRide();
        // When
        Boolean actual = carRide.areWeThereYet("yooo");
        // Then
        Assert.assertFalse(actual);
    }
}