package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected = "*\n"+
                          "**\n"+
                          "***\n"+
                          "****\n";
 
        //: When
        String actual = shapes.triangle(4);
 
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
         //: Given
         Shapes shapes = new Shapes();
         String expected = 
                           "  1 |  2 |  3 |  4 |\n"+
                           "  2 |  4 |  6 |  8 |\n"+
                           "  3 |  6 |  9 | 12 |\n"+
                           "  4 |  8 | 12 | 16 |\n"; 
  
         //: When
         String actual = shapes.tableSquare();
  
         //: Then
         Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void tableSquaresTest(){
        //Given
        Shapes shapes = new Shapes();
        String expected = 
                          "  1 |  2 |  3 |  4 |\n"+
                          "  2 |  4 |  6 |  8 |\n"+
                          "  3 |  6 |  9 | 12 |\n"+
                          "  4 |  8 | 12 | 16 |\n"+
                          "  5 | 10 | 15 | 20 |\n"+
                          "  6 | 12 | 18 | 24 |\n";
                          
        //When
        String actual = shapes.tableSquares(6);
 
        //Then
        Assert.assertEquals(expected, actual);
    }

}
