package com.codedifferently.stayready.lab04;
public class Shapes {
    public static String getRow(int width) {
        String result = "";
        for(int i = 1; i <= width; i++){
            result += "*";
        }
        return result;
    }
    public String triangle(){
        String result = "triangle()\n" +
                "*** Output ***\n";
        for(int row = 1; row <= 5; row++){
            result += getRow(row) + "\n";
        }
        return result;
    }
    public String tableSquare(){
        String result = "tableSquare()\n" +
                "*** Output ***\n";
        for(int col = 1; col <= 4; col++){
            for(int row = 1; row <= 4; row++){
                result += String.format("%3d |", col * row);
            }
            result += "\n";
        }
        return result;
    }
    public String tableSquares(int tableSize){
        String result = "tableSquare()\n" +
                "*** Output ***\n";
        for(int col = 1; col <= tableSize; col++){
            for(int row = 1; row <= tableSize; row++){
                result += String.format("%3d |", col * row);
            }
            result += "\n";
        }
        return result;
    }
}