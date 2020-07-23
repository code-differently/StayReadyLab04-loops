package com.codedifferently.stayready.lab04;


public class Shapes {
    public String triangle(){
        int count = 6;
        int count2 = 3;
        String newerString = "\n1: triangle()\n"  + "2: *** Output *** \n";
        //Creates an empty string builder with a capacity of 16
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < count; i++) {
            stringBuilder.append("*");
            String newString = stringBuilder.toString();
            String tracker= Integer.toString(count2);
            if(i == 5 ){
                newerString += tracker + ": "+ newString + " " ;
            }
            else {
                newerString += tracker + ": " + newString + " \n";
            }
            count2 += 1;
        }
        return newerString;
    }
    public String tableSquare(){
        String newString = "";
        int product;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                product = i * j;
                newString =  String.format( "%s%3s |", newString, Integer.toString(product) );
            }
            newString += "\n";
        }
        return newString;
    }
    public String tableSquareInput(int n){
        int userInput = n;
        String newString = "";
        int product;
        for (int i = 1; i <= userInput; i++) {
            for (int j = 1; j <= userInput; j++) {
                product = i * j;
                newString =  String.format( "%s%3s |", newString, Integer.toString(product) );
            }
            newString += "\n";
        }
        return newString;
    }
}
