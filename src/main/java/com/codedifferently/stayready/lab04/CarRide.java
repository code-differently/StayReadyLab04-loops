package com.codedifferently.stayready.lab04;

import java.util.Scanner;

public class CarRide {

    public static void main(String[] args) {
        CarRide carRide = new CarRide();
        carRide.areWeThereYet();
    }

    public void areWeThereYet() {
        Scanner scanner = new Scanner(System.in); // initialize scanner object for user input

        boolean arrived = false; // sets boolean to false
        while (arrived != true) { // checks for input to be Yes or not
            System.out.print("Are we there yet?"); // ask user AWTY?
            String userInput = scanner.nextLine(); // accept user input
            String output = inputDecider(userInput); // call helper function
            arrived = (output.equals("Good!")) ? true : false;
        }
    }

    public String inputDecider(String imp) { // helper function
        if (imp.equals("Yes"))  // if user says Yes
            return "Good!"; // result is Good

        return "No"; // return to AWTY method
        }
    }
