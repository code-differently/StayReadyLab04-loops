package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {

    public String inputVerify(String input)
    {
        String output = "";
        if (input.equals("yes"))
        {
            output ="Good!";
        }
        return output;
    }

    public String areWeThereYetTest(){
        String correctInput = "yes";
        String input = "";
        String response = "";
        Scanner scanin = new Scanner(System.in);
        do
        {
            System.out.println("Are we there yet?");
            input = scanin.nextLine();
            response = inputVerify(input);
            System.out.println(response);
        }
        while(input.equals(correctInput)==false);
        scanin.close();
        return "";
    }
    
    
}
