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
        String output= "squares()\n"
        +"*** Output ***";
        for(int x=1; x<=10; x++){
            output+= "\n"+(int)Math.pow(x, 2);
        }
        return output;
    }

    public String random4(){
        Random random= new Random();
        String newRandom= "random4()\n"
        +"*** Output ***";
        //get 4 random numbers
        for(int i =1; i<=4;i++){
            newRandom+="\n"+random.nextInt(10);
        }
        return newRandom;

    }

    public String even(int n){
        String output = "even()\n"
        +"*** Output ***";
        //intitiation; verification; step
        for(int i = 2; i < n; i+=2){
            output += "\n" + i; 
        }
        return output;
    }
//ASK TARIQ EHY THEY NEED AN INITIATION INSIDE LOOP
    public String powers(int n){
        String output = "powers()\n"
                +"*** Output ***";
        Integer number = 1;
        //for(int i=1 ; i <= n; i++);{
        int i = 1;
        while(i<=n){
            number =(int)Math.pow(2, i);
            output +="\n"+ number;
            i++;
        }    
        return output;
    }

}
