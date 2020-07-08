package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(){
         String output = "triangle()\n"
    					+"*** Output ***\n";
        for(int row = 1; row <= 5; row++){
            for(int column = 0; column < row; column++){
                output += "*";
            }
            output += "\n";
        }
        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n"
                        +"*** Output ***\n"
                        +"A 4x4 table square\n";
        for(int row = 1; row <= 4; row++){
            for(int column = 1; column <= 4; column++){
                if((row*column) <= 9){
                    output += "  " + row*column + " |";
                }
                else if((row*column) >= 10){
                    output += " " + row*column + " |";
                }
            }
            output += "\n";
        }
        return output;
    }

    public String tableSquares(int n){
        String output = "tableSquares(6)\n"
                        +"*** Output ***\n"
                        +"A 6x6 table square\n";
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){
                if((row*column) <= 9){
                    output += "  " + row*column + " |";
                }
                else if((row*column) >= 10){
                    output += " " + row*column + " |";
                }
            }
            output += "\n";
        }
        return output;
    }
}
