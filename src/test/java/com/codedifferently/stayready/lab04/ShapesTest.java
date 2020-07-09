package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {


    @Test
    public void triangleTest(){
        //Given
        int n = 5;
        Shapes triangle = new Shapes();
        String expected ="triangle()\n*** Output ***\n"
                + "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" ;
        //When
        Shapes shape = new Shapes ();
        String actual = shape.triangle(n);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //Given
        Shapes table = new Shapes();
        String expected = "tableSquare()\n*** Output ***\nA 4x4 table square\n"
                +   "  1 |  2 |  3 |  4 |\n" +
                "  2 |  4 |  6 |  8 |\n" +
                "  3 |  6 |  9 | 12 |\n" +
                "  4 |  8 | 12 | 16 |\n" ;

        //When
        String actual = table.tableSquare();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        //Given
        Shapes table = new Shapes();
        int n = 6;
        String expected = "tableSquares(n)\n*** Output ***\nA nxn table square\n"
                + "  1 |  2 |  3 |  4 |  5 |  6 |\n" +
                "  2 |  4 |  6 |  8 | 10 | 12 |\n" +
                "  3 |  6 |  9 | 12 | 15 | 18 |\n" +
                "  4 |  8 | 12 | 16 | 20 | 24 |\n" +
                "  5 | 10 | 15 | 20 | 25 | 30 |\n" +
                "  6 | 12 | 18 | 24 | 30 | 36 |\n" ;

        //When
        String actual = table.tableSquares(n);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
