package org.launchcode.java.studios.areaofcircle3;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        String testTest = input.nextLine();
        double userInput = input.nextDouble();

        while (userInput < 0) {
            System.out.println("Enter a POSITIVE radius: ");
            userInput = input.nextDouble();
        }

        System.out.println("The area of a circle of radius " + userInput + " is: " + Circle.getArea(userInput));

    }
}
