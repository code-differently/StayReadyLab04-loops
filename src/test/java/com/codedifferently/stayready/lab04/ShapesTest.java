package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {
    @Test
    public void triangleTest(){
        Shapes shapes = new Shapes();
        String expected =
                            "*\n" +
                            "**\n" +
                            "***\n" +
                            "****\n"+
                            "*****\n";
        String actual = shapes.triangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "| 1 | 2 | 3 | 4 | \n" +
                          "| 2 | 4 | 6 | 8 | \n"+ 
                          "| 3 | 6 | 9 | 12 | \n"+
                          "| 4 | 8 | 12 | 16 | \n";
        //: When
        String actual = shapes.tableSquare();
        //: Then    
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "| 1 | 2 | 3 | 4 | \n" +
                          "| 2 | 4 | 6 | 8 | \n"+ 
                          "| 3 | 6 | 9 | 12 | \n"+
                          "| 4 | 8 | 12 | 16 | \n";
        //: When
        int n = 4;
        String actual = shapes.tableSquares(n);
        //: Then    
        Assert.assertEquals(expected, actual);
    }
}
