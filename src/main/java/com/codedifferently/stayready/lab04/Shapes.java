package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(int numberOfRows){
        String rows = "";
        String stars = "";
        for(int i=0; i<numberOfRows;i++){
            for (int j=0; j<j+1;j++){
                rows = rows + stars;
            }
            rows = rows + "\n";
        }
        return rows;
    }

    public String tableSquare(){
        String table = "";
        for (int i=1; i<=4; i++){
            for (int j=1; j<=5-1; j++){
                int product = i*j;
                table += String.format("%3d |", product);
            }
            table = table + "\n";
        }
        return table;
    }

    public String tableSquares(int n){
        String table = "";
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-2; j++){
                int product = i*j;
                table += String.format("%3d |", product);
            }
            table = table + "\n";
        }
        return table; 

    }
}
