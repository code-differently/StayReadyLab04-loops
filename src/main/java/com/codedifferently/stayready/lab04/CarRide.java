package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {
    public static void main(String[]args){
        System.out.println(areWeThereYetTest());
    }

    public static String areWeThereYetTest() {
        String str = "";
        Scanner in = new Scanner(System.in);
        boolean bool = false;
        str += "\"Are we there yet?\"";
        System.out.print("\"Are we there yet?\"" + "\n");
        while(!bool){
            String input = in.nextLine();
            str += "\n" + input;
            if(input.equals("Yes")){
                bool = true;
                str += "\nGood!";
                System.out.print("Good!" + "\n");
            }
            else if(!input.equals("Yes")){
                str += "\n" + "\"Are we there yet?\"";
                System.out.print("\"Are we there yet?\"" + "\n");
            }
        }
        return str;
    }

}
