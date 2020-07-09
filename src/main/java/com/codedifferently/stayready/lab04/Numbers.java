package com.codedifferently.stayready.lab04;

import java.util.Random;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
        return output;
    }

    public String squares(){
        String output = "squareNumbers()\n"
                +"*** Output ***";
        for (int i = 1; i <= 10; i++) {
            //if (i % i == 0) {
            output += "\n"+ i*i;
            //}
        }
        return output;
    }

    public String random4(){
        Random random = new Random();
        String output = "random4()\n"
                +"*** Output ***";
        for (int i = 1; i<= 4; i++) {
            output += "\n" + random.nextInt(10);
        }
        return output;
    }

    public String evenNumbers(int n){
        String output = "evenNumbers()\n"
                        +"*** Output ***";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                output += "\n"+ i;
            }
        }
        return output;
    }

    public String powers(int n){
        String output = "powerNumbers()\n"
                +"*** Output ***";
        for (int i = 1; i <= n; i++) {
            output += "\n"+ (int)Math.pow(2, i);
        }
        return output;
    }

}
