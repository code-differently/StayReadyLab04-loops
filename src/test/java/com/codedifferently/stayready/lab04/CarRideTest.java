package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTestNo(){
        //given
        CarRide carRide = new CarRide();
        //when
        Boolean actual = carRide.areWeThereYet("No");
        //Then
        Assert.assertFalse(actual);
    }
    public void areWeThereYetTestYes(){
        //given
        CarRide carRide = new CarRide();
        //when
        Boolean actual = carRide.areWeThereYet("Yes");
        //Then
        Assert.assertTrue(actual);
    }

    }






