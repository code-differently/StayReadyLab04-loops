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
        String str = "squares()\n*** Output ***\n";
        for(int i = 1; i <= 10; i++){
            if(i != 10){
            str += (int)Math.pow(i, 2) + "\n";
            }
            else{
                str += (int)Math.pow(i, 2); 
            }

        }
        return str;
    }

    public String random4(){
        String str = "random4()\n*** Output ***";
        Random rand = new Random();
        for(int i = 1; i <=4; i++){
            str += "\n" + rand.nextInt(10);
        }
        return str;
    }

    public String even(int n){
        String output = "evenNumbers()\n"
    					+"*** Output ***";
    	for(int i = 2; i < n ; i += 2){
    		output += "\n"+ i;
    	}
        return output;
    }

    public String powers(int n){
        String str = "powers()\n"
                      + "*** Output ***";
        for(int i = 1; i <= n; i++){
            str += "\n" + ((int)Math.pow(2, i));
        }
        return str;
    }

}
