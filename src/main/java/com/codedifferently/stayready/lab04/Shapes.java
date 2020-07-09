package com.codedifferently.stayready.lab04;


public class Shapes {

    public String triangle(int n){
        String output = "triangle()\n"
                +"*** Output ***\n";
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
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
        for(int i = 1; i < 5;i++) {
            for(int c = 1; c < 5; c++) {
                if(i*c < 10) {
                    output += "  " +i*c +" |";
                } else {
                    output += " " +i*c + " |";
                }
            }
            output += "\n";
        }
        return output;
    }

    public String tableSquares(int n){
        String output = "tableSquares(n)\n"
                +"*** Output ***\n"
                +"A nxn table square\n";
        for(int i = 1; i <= n;i++) {
            for(int c = 1; c <= n; c++) {
                if(i*c < 10) {
                    output += "  " +i*c +" |";
                }
                else if(i*c >= 10 && i*c <100) {
                    output +=" " +i*c +" |";
                }else{
                    output += i*c + " |";
                }
            }
            output += "\n";
        }
        return output;
    }
}
