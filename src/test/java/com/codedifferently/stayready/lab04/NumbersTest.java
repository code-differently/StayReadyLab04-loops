package com.codedifferently.stayready.lab04;

import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

    	String actual = numbers.oddNumbers();
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void squaresTest(){
        Numbers numbers = new Numbers();
        String expected = "squares()\n*** Output ***"+numbers.squares();
 
        //: When
        String actual = numbers.squares();
 
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "random4()\n*** Output ***"+numbers.random4();
 
        //: When
        String actual = numbers.random4();
 
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void evenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "evens()\n*** Output ***"+numbers.even(5);
 
        //: When
        String actual = numbers.even(5);
 
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void powersTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "powers()\n*** Output ***"+numbers.powers(4);
 
        //: When
        String actual = numbers.powers(4);
 
        //: Then
        Assert.assertEquals(expected, actual);
    }

}
