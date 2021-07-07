package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {

    public String areWeThereYetTest(String answer){
        Scanner input = new Scanner(System.in);
        answer = input.nextLine();
        String responce = "";
 
        while(!answer.equals("Yes")){
            System.out.print("Are we there yet?");
            responce = "Are we there yet?";
            answer = input.nextLine();
            if (answer.equals("Yes")){
                System.out.println("Good");
                responce = "Good";
            }
        } 
        return responce;   
    }
}    


