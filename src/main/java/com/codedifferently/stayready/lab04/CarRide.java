package com.codedifferently.stayready.lab04;

import java.util.Scanner;


public class CarRide {
    //method is a behavior for the class CarRide
    public String areWeThereYet() {
        //we need input
        Scanner in = new Scanner(System.in);

        System.out.println("Are we there yet?");

        //While is another form of loop, different from a for loop, it uses boolean
        // logic and repeats until the condition is false. ... See Chapter 3, page 94 in Core Java
        // this line reads: while the user input is not (!) true, keep printing out "Are we there yet?"
        while (isYes(in.nextLine())) {


        }
        //issue, does not return after loop fails, just ends program
        return "";
    }

    //returns true or false is the user input is the expected input
    //issue, what if the user says yes in lowercase
    public boolean isYes(String Input) {
        return null;
    }

    public static void main(String[] args) {
        CarRide carRide = new CarRide();
        carRide.areWeThereYet();
    }

}


