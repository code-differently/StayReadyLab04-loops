package com.codedifferently.stayready.lab04;


public class Shapes {

    String output;

    public String triangle() {
        output = "triangle()\n*** Output ***";
        for(int triangleRow = 1; triangleRow <= 5; triangleRow++){
            output += "\n";
            for(int triangleColumn = 0; triangleColumn < triangleRow; triangleColumn++){
                output += "*";
            }
        }
        return output;
    }

    public String tableSquare(){
        output = "tableSquare()\n*** Output ***\n";
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                output += String.format("%3d |", i*j);
            }
            output += "\n";
        }

        return output;
    }


    public String tableSquares(int n){
        output = "tableSquare()\n*** Output ***\n";
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    output += String.format("%3d |", i*j);
                }
                output += "\n";
            }
        return output;
        }
    }

