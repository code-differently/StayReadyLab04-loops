package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {
    @Test
    public void  inputVerifiyTest()
    {
        //Given
        String input = "yes";
        CarRide carRidetest = new CarRide();
        //When
        String actual = carRidetest.inputVerify(input);
        String expected = "Good!";
        //Then 
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void  inputVerifiyTest2()
    {
        //Given
        String input = "No";
        CarRide carRidetest = new CarRide();
        //When
        String actual = carRidetest.inputVerify(input);
        String expected = "Are we there yet?!";
        //Then 
        Assert.assertEquals(expected, actual);
    }   

}
