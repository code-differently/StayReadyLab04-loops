package com.codedifferently.stayready.lab04;

import org.junit.Test;
import org.junit.Assert;

import java.nio.channels.NetworkChannel;

import com.codedifferently.stayready.lab04.CarRide;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        
        //Given
        boolean expected = true;

        //When
        CarRide carRide = new CarRide();
        boolean actual = carRide.areWeThereYet("Yes");
        
        //Then
        Assert.assertEquals(expected, actual);
        
    }
    @Test
    public void evalInputTest(){
        //Given
        String expected = "Good!";
        String exp = "\"Are we there yet?\"";

        //When
        CarRide carRide = new CarRide();
        String actual = carRide.evalInput(true);
        String act = carRide.evalInput(false);

        //Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(exp, act);
    }
}