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
        String sqrs = "squares()\n"
                         +"*** Output ***";;
        for (int i=1;i<=100;i++){
            i=i*i;
            sqrs = Integer.toString(i);
        }
        return sqrs;
    }


    public String random4(){
        int numRands = 4;
        String listRands = "1: random4()\n" + "2: *** Output ***";
        Random random = new Random();
        for (int i=0; i<numRands; i++){
            listRands += "\n";
            listRands = listRands + (i+3) + ":";
            listRands += random.nextInt(10)-1;
        }
 
        return listRands;
    }

    public String even(int n){
        String evens = "even()\n"
                        +"*** Output ***";
        for (int i =0; i<=n;i++){
            if(i%2==0){
                String num = Integer.toString(i);
                evens = evens+num;
            }
        }
        return evens;
    }


    public String powers(int n){
        String pows ="powers()\n"
                    +"*** Output ***";
        for (int i=1; i<=n; i++){
            i = (int) Math.pow(i, n);
            pows = pows+i;
        }
        return pows;
    }    

}
