package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarRideTest {

    CarRide carRide;

    @Before
    public void setup(){

        this.carRide = new CarRide();
    }

    @Test
     public void inputDeciderYesTest(){
        //Given
        String expected = "Yes";
        //When
        String actual = carRide.inputDecider("Yes");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inputDecidertNoTest(){
        //Given
        String expected = "No";
        //When
        String actual = carRide.inputDecider("No");
        //Then
        Assert.assertEquals("No", expected, actual);
    }
}
