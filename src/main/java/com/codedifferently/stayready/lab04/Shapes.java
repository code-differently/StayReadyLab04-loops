package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(){
        String triangle ="";
        Integer rows =5;
        for(int i =1; i<=rows; i++)
        {
            for (int k = 1; k<=i; k++)
            {
                triangle = triangle + "*";
            }
            triangle = triangle + "\n";
        }
        
        return triangle;
    }

    public String tableSquare(){
        
        Integer dimension= 4;
        Integer[][]multTable4 = new Integer[dimension][dimension];
        String table = "";
        Integer i = 0; 
        int rows = 1; int cols = 1; 
        for (i = 0 ; i<dimension; i++)
        {
            for (Integer k = 0; k<dimension; k++)
            {
                multTable4[i][k] = rows *cols;
                table = table+ multTable4[i][k] +"|";
                cols++;
            }
            rows++;
            cols=1;
            table = table +"\n";
        }
        return table.trim();
    }

    public String tableSquares(int n){

        Integer dimension= n;
        Integer[][]multTable4 = new Integer[dimension][dimension];
        String table = "";
        Integer i = 0; 
        int rows = 1; int cols = 1; 
        for (i = 0 ; i<dimension; i++)
        {
            for (Integer k = 0; k<dimension; k++)
            {
                multTable4[i][k] = rows *cols;
                table = table+ multTable4[i][k] +"|";
                cols++;
            }
            rows++;
            cols=1;
            table = table +"\n";
        }
        return table.trim();
    }
}
