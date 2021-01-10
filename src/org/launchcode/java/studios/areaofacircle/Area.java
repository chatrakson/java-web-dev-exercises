package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the radius:");
        double radius = input.nextDouble();
        String stringCheck = String.valueOf(radius);

        while (radius < 0 || stringCheck.equals("")) {
            System.out.println("Hello, please enter the radius:");
            radius = input.nextDouble();
        }
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
