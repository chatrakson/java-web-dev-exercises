package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter how many miles you've driven:");
        int miles = input.nextInt();
        System.out.println("Next, please enter the amount of gas you used (in gallons):");
        int gas = input.nextInt();
        System.out.println("You have driven '" + miles
                + " miles' and used '" + gas + " gallon(s)' of gas. Your MPH is: " + miles / gas);
    }
}
