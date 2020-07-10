package com.codedifferently.stayready.lab04;


import org.junit.Test;
import java.util.Scanner;
import org.junit.Assert;

public class CarRideTest {

    @Test
    public void AreWeThereYetPassTest(){
        //Given
        Scanner in = new Scanner(System.in);
        CarRide cr = new CarRide();
        //when
        cr.areWeThereYet();
        in.nextLine(); //Us as users will say "Yes" in the terminal.
        String expected = "Good";
        String actual = cr.str;
        //Then
        Assert.assertEquals(expected, actual);

    }

    public void AreWeThereYetFailTest(){
        //Given
        Scanner in = new Scanner(System.in);
        CarRide cr = new CarRide();
        //when
        cr.areWeThereYet(); //Us as users will say anything but "Yes" in the terminal
        String expected = "Are We There Yet?";
        String actual = cr.str;
        //Then
        Assert.assertEquals(expected, actual);

    }
}
