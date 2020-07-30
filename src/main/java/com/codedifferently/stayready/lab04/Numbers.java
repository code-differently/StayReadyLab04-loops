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
        String output = "squares()\n"
                        +"*** Output ***";
        for (int i = 1; i <= 10; i++){
            output += "\n" + (i * i);
        }
        return output;
    }

//    public String random4(){
//        Random rand = new Random();
//        String result = "";
//        for (int i = 0; i < 4; i++){
//            //Integer r1 = rand.ints(1,10);
//            result += Integer.toString(r1);
//        }
//        return result;
//    }

    public String even(int n){
        String output = "even(20)\n"
                +"*** Output ***";
        for (int i = 1; i < n; i++){
            if (i % 2 == 0){ // if i even
                output += "\n" + i;
            }
        }
        return output;
    }

    public String powers(int n){
        String output = "powers(8)\n"
                +"*** Output ***";
        for (int i = 1; i <= n; i++) {
            output += "\n" + (int)Math.pow(2, i);
        }
        return output;
    }

}
