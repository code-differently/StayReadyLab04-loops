package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {

    @Test
    public void triangleTest(){
        //Given
        String expected ="triangle()\n*** Output ***\n"
              + "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" ;
        //When
        Shapes shape = new Shapes ();
        String actual = shape.triangle();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tableSquareTest(){
       String expected = "tableSquare()\n*** Output ***\nA 4x4 table square\n"                      
            +   "  1 |  2 |  3 |  4 |\n" +
                "  2 |  4 |  6 |  8 |\n" +
                "  3 |  6 |  9 | 12 |\n" +
                "  4 |  8 | 12 | 16 |\n" ;

        Shapes shape = new Shapes ();
        String actual = shape.tableSquare();

        Assert.assertEquals(expected, actual);
    }

  @Test   
    public void tableSquaresTest(){
        String expected = "tableSquares(6)\n*** Output ***\nA 6x6 table square\n"
      + "  1 |  2 |  3 |  4 |  5 |  6 |\n" +
        "  2 |  4 |  6 |  8 | 10 | 12 |\n" +
        "  3 |  6 |  9 | 12 | 15 | 18 |\n" +
        "  4 |  8 | 12 | 16 | 20 | 24 |\n" +
        "  5 | 10 | 15 | 20 | 25 | 30 |\n" +
        "  6 | 12 | 18 | 24 | 30 | 36 |\n" ;

        Shapes shape = new Shapes ();
        String actual = shape.tableSquares(6);

        Assert.assertEquals(expected, actual);
    } 
}
