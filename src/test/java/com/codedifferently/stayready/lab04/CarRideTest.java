package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {

    @Test
    public void areWeThereYetTest(){
        CarRide iceCube = new CarRide();

        boolean actual = iceCube.areWeThereYet("no");

        Assert.assertFalse(actual);
    }

    @Test
    public void areWeThereYetTest2(){
        CarRide iceCube = new CarRide();

        boolean actual = iceCube.areWeThereYet("yes");

        Assert.assertTrue(actual);
    }

}
