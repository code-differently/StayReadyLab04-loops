package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes shapes = new Shapes();
        //: When
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";
        String actual = shapes.triangle();
        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes shapes = new Shapes(); 

        //: When
        String expected = "tableSquare()\n*** Output ***\n"+"A 4 x 4 table square\n"+
        "|  1 |  2 |  3 |  4 |\n" +
        "|  2 |  4 |  6 |  8 |\n" +
        "|  3 |  6 |  9 | 12 |\n" +
        "|  4 |  8 | 12 | 16 |\n" ;
        String actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tableSquareTest2(){
        //Given
        Shapes shapes = new Shapes();
        //When
        String expected = "tableSquare()\n*** Output ***\n"+"A 6 x 6 table square\n"+
                "|  1 |  2 |  3 |  4 |  5 |  6 |\n" +
                "|  2 |  4 |  6 |  8 | 10 | 12 |\n" +
                "|  3 |  6 |  9 | 12 | 15 | 18 |\n" +
                "|  4 |  8 | 12 | 16 | 20 | 24 |\n" +
                "|  5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "|  6 | 12 | 18 | 24 | 30 | 36 |\n";
        int stop = 6;
        String actual = shapes.tableSquares(stop);
        //Then
        Assert.assertEquals(expected,actual);

    }
}
