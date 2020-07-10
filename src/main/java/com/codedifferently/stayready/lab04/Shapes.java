package com.codedifferently.stayready.lab04;


public class Shapes {

    private static String triangleHelper(int row) {
        String triangle = "";

        for (int j = 0; j < row; j++) { // row is equal to i
            triangle += "*"; // calls empty string and adds star
        }
        return triangle; // goes back to original loop in getTriangle
    }
    public String triangle(){
        String triangle = "";

        for (int i = 1; i < 6; i++) {
            triangle += triangleHelper(i) + "\n"; // calls Helper and creates line break
        }

        return triangle;
    }

    private static String buildTableRow(int i, int length) {
        String rowBuild = "";
        for (int x = 1; x <= length; x++) {
            int number = x * i;
            rowBuild += String.format("|%3d", number);
        }
        return rowBuild;
    }

    public static String TableSquare() {
        String gettableSquare = "";
        for (int i = 1; i <= 4; i++) {
            int length = 4;
            gettableSquare += buildTableRow(i, length) + "|\n";
        }
        return gettableSquare;
    }

    public String tableSquares(int n){
        String gettableSquare = "";
        for (int i = 1; i <= n; i++) {
            int length = n;
            gettableSquare += buildTableRow(i, length) + "|\n";
        }
        return gettableSquare;
    }
}
