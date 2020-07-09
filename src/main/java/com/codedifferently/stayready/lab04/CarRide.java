package com.codedifferently.stayready.lab04;
import java.util.Scanner;

public class CarRide {

    public boolean answerEval(String input) {
        boolean output;
        if (input.equals("Yes")) {
            output = true;
        }
        else if (input.equals("No")) {
            output = false;
        } else {
            output = false;
        }
        return output;
    }


    public void areWeThereYet() {
        Scanner in = new Scanner(System.in);
        String answer = "";
        boolean evaluation;
        do {
            System.out.println("Are we there yet?");
            answer = in.nextLine();
            evaluation = answerEval(answer);
            System.out.println(evaluation);
        }
        while(!evaluation);
        System.out.println("Good!");
    }
}
