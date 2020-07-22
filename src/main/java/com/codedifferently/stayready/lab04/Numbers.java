package com.codedifferently.stayready.lab04;


import java.util.Random;
import java.util.Scanner;

public class Numbers {

    public String oneToTen() {
        String output = "oneToTen()\n" + "*** Output ***";
        for (int x = 1; x <= 10; x++) {
            output += "\n" + x;
        }
        return output;
    }

    public String oddNumbers() {
        String output = "oddNumbers()\n"
                + "*** Output ***";
        for (int x = 1; x < 20; x += 2) {
            output += "\n" + x;
        }

        return output;
    }

    public String squares() {
        String output = "squares()\n" + "*** Output ***";
        for (int x = 1; x <= 10; x++) {
            output += "\n" + (x * x);
        }
        return output;
    }

//    public String random4() {
//        return "";
//        String output = "random4()\n*** Output ***\n1\n2\n3\n4";
//        Random number = new Random();
//
//        for (int x = 1; x <= 4; x++) {
//            int temp = number.nextInt(10);
//            output += "\n" + temp;
//        }
//        return output;
//    }

    public String even(int n){
        String output ="even()\n" +"*** Output ***";
        for(int x=2; x<n; x+=2){
            output += "\n"+x; }
        return output;
    }

    public String powers(int n){
     String output ="powers()\n" +"*** Output ***";
        int num = 1;
     for(int x=0; x<n; x++){
         num*=2;
         output += "\n"+num;
     }
        return output;
    }
}

