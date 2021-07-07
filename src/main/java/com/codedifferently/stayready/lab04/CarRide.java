package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {
    public static boolean areWeThereYet(String input) {
        boolean bool = false;
        System.out.print("\"Are we there yet?\"" + "\n");
        while(!bool){
            String result = evalInput(input.equals("Yes"));
            System.out.println(result);
            bool = true;
        }
        return bool;
    }

    public static String evalInput(boolean input) {
        String output = "";
        if(input == true){
            output += "Good!";
        }else{
            output += "\"Are we there yet?\"";
        }
        return output;
    }
}
