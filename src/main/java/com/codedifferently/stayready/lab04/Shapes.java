package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(){
        String triangle = "triangle()\n"
        +"*** Output ***";
        for(int i = 1; i<=5; i++){
            triangle += "\n";
            for(int j = 1; j<=i; j++){
                triangle += "*";
            }
        }
        return triangle;
    }

    public String tableSquare(){
        String output= "tableSquare()\n"
        +"*** Output ***\n"+"A 4 x 4 table square\n";
        int num= 1;
        for(int i=1; i<=4; i++){
            for(int j=1;j<=4; j++){
                num = j*i;
                output=output+ String.format("| %2d"+" ",num );
            }
            output+="|\n";
        }
        return output;
    }

    public String tableSquares(int n){
        String output= "tableSquare()\n"
                +"*** Output ***\n"+"A 6 x 6 table square\n";
        int num= 1;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n; j++){
                num = j*i;
                output=output+ String.format("| %2d"+" ",num );
            }
            output+="|\n";
        }
        return output;
    }
}
