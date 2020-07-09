package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(){
        String value = "triangle()\n*** Output ***";

        for(int i=1; i<=5; i++){

        }

        return "";
    }

    public String tableSquare(){
        String value = "tableSquare()\n*** Output ***\nA 4x4 Table Square\n";

        for(int i=1; i<4+1; i++){
            for( int j=1; j<=4; j++){
                value = value + String.format("%3d |",i*j);
            }
            value = value + String.format("\n");
        }

        return value;
    }

    public String tableSquares(int n){
        String value = "tableSquares()\n*** Output ***\n A "+(n)+"x"+(n)+" Table Square\n";

        for(int i=1; i<=n; i++){
            for( int j=1; j<=n; j++){
                value = value + String.format("%3d |",i*j);
            }
            value = value + String.format("\n");
        }

        return value;
    }
}
