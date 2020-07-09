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
        String output = "squares()\n" + "*** Output ***";
        for (int x =1; x<= 10; x++){
            int num = x*x;
            output += "\n"+ num;
        }
        return output;
    }

    public String random4() {
        Random rn = new Random();
        String output = "random4()\n"
                +"*** Output ***";
        for (int i = 1; i <= 4; i++) {
            int nxt = rn.nextInt(10);
            output += "\n" + nxt;
        }

        return output;
    }

    public String even(int n){
        String output = "even(20)\n" + " *** Output ***";
        for ( int x=1; x < 20; x++) {
            if (x % 2 == 0) {
                output += "\n" + x;
            }
        }
        return output;
    }

    public String powers(int n){
        String output = "powers(8)\n" + " *** Output ***";
        for( int x=1; x <= 8; x++) {
            output += "\n" + (int) Math.pow(2,x);
        }
        return output;
    }

}
