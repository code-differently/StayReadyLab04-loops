package com.codedifferently.stayready.lab04;


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
        
        return "";
    }

    public String even(int n){
        String output = "evenNumbers()\n"
    					+"*** Output ***";
    	for(int i = 2; i < 20 ; i += 2){
    		output += "\n"+x;
    	}
        return output;
    }

    public String powers(int n){
        String str = "powers()\n"
                      + "*** Output ***\n";
        for(int i = 2; i < 300; i++){
            if(i % 2 == 0){
                str += (int) Math.pow(i, 2);
            }
        }
        return str;
    }

}
