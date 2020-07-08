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
        String range = "";
        int to100 = 10;
        Integer i  = 0; 
        for(i= 1; i<=to100; i++)
        {
            Double toInt = Math.pow(i, 2);
            range = range + toInt.intValue();
            range = range + "\n";
        }
        return range.trim();
    }

    public String random4(){
        Random random  = new Random();
        String randomnumString = "";
        for(int i=0;i<4;i++)
        {
            randomnumString = randomnumString + random.nextInt(10);
        }
        return randomnumString.trim();
    }

    public String even(int n){
        String range = ""; 
        Integer i = 0; 
        for (i = 1; i <= n; i++)
        {
            if(i % 2 ==0)
            {
                range = range + i.toString();
            }
            range = range + "\n";
        }
        return range.trim();
    }

    public String powers(int n){
        String range = "";
        Integer i = 0; 
        for (i = 1; i <= n; i++ )
        {
            Double toInt = Math.pow(2, i);
            range = range + toInt.intValue();
            range = range + "\n";
        }
        return range.trim();
    }

}
