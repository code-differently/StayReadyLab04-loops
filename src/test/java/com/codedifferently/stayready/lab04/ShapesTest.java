package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){
        //: Given
        Shapes tri = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****\n";

        //: When
        String actual = tri.triangle();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes sq = new Shapes();
        String expected = "tableSquare()\n*** Output ***\nA 4x4 Table Square\n" +  "  1 |  2 |  3 |  4 |\n" +
                "  2 |  4 |  6 |  8 |\n" +
                "  3 |  6 |  9 | 12 |\n" +
                "  4 |  8 | 12 | 16 |\n";

        //: When
        String actual = sq.tableSquare();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        //: Given
        Shapes tbSq = new Shapes();
        int size = 7;
        String expected = "tableSquares()\n*** Output ***\n A 7x7 Table Square\n" +  "  1 |  2 |  3 |  4 |  5 |  6 |  7 |\n" +
                "  2 |  4 |  6 |  8 | 10 | 12 | 14 |\n" +
                "  3 |  6 |  9 | 12 | 15 | 18 | 21 |\n" +
                "  4 |  8 | 12 | 16 | 20 | 24 | 28 |\n" +
                "  5 | 10 | 15 | 20 | 25 | 30 | 35 |\n" +
                "  6 | 12 | 18 | 24 | 30 | 36 | 42 |\n" +
                "  7 | 14 | 21 | 28 | 35 | 42 | 49 |\n";

        //: When
        String actual = tbSq.tableSquares(size);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquaresTest2(){
        //: Given
        Shapes tbSq = new Shapes();
        int size = 5;
        String expected = "tableSquares()\n*** Output ***\n A 5x5 Table Square\n" +  "  1 |  2 |  3 |  4 |  5 |\n" +
                "  2 |  4 |  6 |  8 | 10 |\n" +
                "  3 |  6 |  9 | 12 | 15 |\n" +
                "  4 |  8 | 12 | 16 | 20 |\n" +
                "  5 | 10 | 15 | 20 | 25 |\n";

        //: When
        String actual = tbSq.tableSquares(size);

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }
}
