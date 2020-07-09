package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

public class CarRideTest {
    @Test
    public void answerYesTest(){
        // Given
        CarRide carRide = new CarRide();
        String input = "Yes";
        boolean expected = true;

        // When
        boolean actual = carRide.answerEval(input);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void answerNoTest(){
        // Given
        CarRide carRide = new CarRide();
        String input = "No";
        boolean expected = false;

        // When
        boolean actual = carRide.answerEval(input);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void answerAnythingTest(){
        // Given
        CarRide carRide = new CarRide();
        String input = "East Side";
        boolean expected = false;

        // When
        boolean actual = carRide.answerEval(input);

        // Then
        Assert.assertEquals(expected,actual);
    }
}

