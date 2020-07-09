package com.codedifferently.stayready.lab04;

public class CarRide {

    public static void main(String[] args){
        System.out.println("We are gonna get there, but it's okay if you infinitely ask.");
    }

    public Boolean areWeThereYet(String s){
        if (s.equals("Yes")){
            return true;
        }
        return false;
    }
}