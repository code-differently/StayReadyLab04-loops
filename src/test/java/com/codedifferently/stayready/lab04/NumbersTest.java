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
        //: Given
        Numbers numberstest = new Numbers();
        String expected = "1\n4\n9\n16\n25\n36\n49\n64\n81\n100";
        //: When
        String actual = numberstest.squares();
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void random4Test(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void evenTest(){
        //: Given
        Numbers numberstest = new Numbers();
        int n = 10;
        String expected = "2\n4\n6\n8\n10";
        //: When
        String actual = numberstest.even(n);
        //: Then
        Assert.assertEquals(expected.trim(), actual);
    }

    @Test
    public void powersTest(){
        //: Given
        Numbers numberTest = new Numbers();
        int n = 6; 
        String expected = "2\n4\n8\n16\n32\n64";
        //: When
        String actual = numberTest.powers(n);
        //: Then
        Assert.assertEquals(expected, actual);
    }

}
