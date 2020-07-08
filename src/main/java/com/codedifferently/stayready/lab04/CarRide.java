package com.codedifferently.stayready.lab04;
import java.util.Scanner;
public class CarRide {
    public String areWeThereYet(){
        Scanner in = new Scanner(System.in);
        System.out.println("Are we there yet?");
        while(!evalString(in.nextLine())){
            System.out.println("Are we there yet?");
        }
        return "Good!";
    }
    public boolean evalString(String str){
        return str.equals("Yes");
    }
    public static void main(String[] args){
        CarRide carRide = new CarRide();
        carRide.areWeThereYet();
    }
}