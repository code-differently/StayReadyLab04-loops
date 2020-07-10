package com.codedifferently.stayready.lab04;

import java.util.*;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n" + "*** Output ***";
    	for(int i = 1; i <= 10; i++){ // loops from 1 to 10 by 1
    		output += "\n" + i;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n" +"*** Output ***";
    	for(int i = 1; i < 20 ; i += 2){ // loops from 1 to 19 by 2s
    		output += "\n" + i;
    	}

        return output;
    }

    public String squares(){
        String output = "squares()\n" +"*** Output ***";
        for (int i = 1; i <= 10; i++){ // loops 1 to 10 by 1
            output += "\n" + i * i; // squares i
        }

        return output;
    }

    public String random4(){
        String output = "";
        Random rand = new Random(); //initialize rand
        for (int i = 1; i <= 4; i++){ // i starts at 1 and prints up to 4 times
            int randomNum = rand.nextInt(10)+1; // generate random number in range 0-9 then add 1;
            output += "\n" + randomNum;
        }
        return output;
    }

    public String evenNumbers(int n){
        String output = "even(n)\n*** Output ***";

        for (int i = 2; i < n; i += 2) { // loops from 2

            output += "\n" + i;

        }

        return output;
    }

    public String powers(int n){
        String output = "powers(8)\n*** Output ***";
        for (int i = 1; i <= n; i++){
            output += "\n" + (int)Math.pow(2, i); // casting 2 to the power of n
        }
        return output;
    }

}
