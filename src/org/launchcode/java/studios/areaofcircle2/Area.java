package org.launchcode.java.studios.areaofcircle2;

import org.launchcode.java.studios.areaofacircle.Circle;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Area {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        double userInput = input.nextDouble();

        while(userInput < 0) {
            System.out.println("Please enter a positive radius: ");
            userInput = input.nextDouble();
        }
        System.out.println("The area of a circle of radius " + userInput + " is: " + Circle.getArea(userInput));

//        if (userInput < 0 || String.valueOf(userInput).equals("")) {
//            System.out.println("Invalid entry. Program closing.");
//        } else {
//            System.out.println("The area of a circle of radius " + userInput + " is: " + Circle.getArea(userInput));
//        }

        // Ask how to enter in an empty string
    }
}
