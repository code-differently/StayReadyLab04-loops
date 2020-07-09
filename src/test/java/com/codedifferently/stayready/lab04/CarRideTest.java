package com.codedifferently.stayready.lab04;

import org.junit.Test;

import junit.framework.Assert;

public class CarRideTest {
    @Test 
    public void areWeThereYetTest(){
        //Given
        CarRide cRide = new CarRide();
        //When
        Boolean expected =  false;
        Boolean actual = cRide.areWeThereYet("spoons");
        //Then
        Assert.assertFalse(actual);
    }


}
