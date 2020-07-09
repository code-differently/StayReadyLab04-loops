package com.codedifferently.stayready.lab04;

import java.util.*;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"+"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
    		
        return output;
    }

    public String squares(){
        String output = "squares()\n"+"*** Output ***";
        for(int i=1; i<=10; i++){
            output += "\n"+(i*i);
        }
        return output;
    }

    public String random4(){
        String output = "random4()\n"+"*** Output ***";
        Random number = new Random();

        for(int i=0; i<4; i++){
            int temp = number.nextInt(10);
            output += "\n"+ temp;
        }
        return output;
    }

    public String even(int n){
        String output = "even()\n"+"*** Output ***";
            for(int i=2; i<n; i+=2) {
                output += "\n" + i;
            }
        return output;
    }

    public String powers(int n){
        String output = "powers()\n"+"*** Output ***";
        int temp = 1;

        for(int i=1; i<=8; i++){
            temp = temp * 2;
            output += "\n" + (temp);
        }
        return output;
    }

}
