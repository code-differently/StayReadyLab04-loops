package com.codedifferently.stayready.lab04;

import java.util.*;


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
        String emptyString = "";
        for (int i = 1; i < 11; i++){

            String numberString = Integer.toString(i * i);
            emptyString = emptyString.concat(numberString) +"\n";


        }
        return emptyString;
    }

    public String random4(){
        String output = "";
        Random ran = new Random(); 
        for(int i=0; i < 4 ; i++) {
            int nxt = ran.nextInt(10);
            output += Integer.toString(nxt) + "\n";} 
        return output;
    }

    public String even(int n){
        String emptyString = "";
        for (int i = 2; i < n; i++){
            if (i % 2 == 0){
                String numberString = Integer.toString(i);
                emptyString = emptyString.concat(numberString) + "\n";
            }

        }
        return emptyString;
    }

    public String powers(int n){
        String emptyString = "";
        for (int i = 1; i <= n; i++){      
            String numberString = Double.toString(Math.pow(2.0, i));
            emptyString = emptyString.concat(numberString) + "\n";
        }
        return emptyString;
    }

}
