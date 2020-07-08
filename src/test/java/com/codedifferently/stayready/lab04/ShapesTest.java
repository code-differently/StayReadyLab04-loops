package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {
    @Test
    public void triangleTest(){
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" ;

        String actual = ShapesTest.triangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
        String expected =
                "  1 |  2 |  3 |  4 |\n" +
                "  2 |  4 |  6 |  8 |\n" +
                "  3 |  6 |  9 | 12 |\n" +
                "  4 |  8 | 12 | 16 |\n" ;

        String actual = ShapesTest.tableSquare();
        Assert.assertEquals(expected, actual);
    }

    @Test   
    public void tableSquaresTest(){
        String expected =
        "  1 |  2 |  3 |  4 |  5 |  6 |\n" +
        "  2 |  4 |  6 |  8 | 10 | 12 |\n" +
        "  3 |  6 |  9 | 12 | 15 | 18 |\n" +
        "  4 |  8 | 12 | 16 | 20 | 24 |\n" +
        "  5 | 10 | 15 | 20 | 25 | 30 |\n" +
        "  6 | 12 | 18 | 24 | 30 | 36 |\n" ;

        String actual = ShapesTest.tableSquares(6);
        Assert.assertEquals(expected, actual);
    }
}
