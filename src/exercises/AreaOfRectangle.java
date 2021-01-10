package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter the length of the rectangle:");
        int length = input.nextInt();
        System.out.println("Next, please enter the width of the rectangle:");
        int width = input.nextInt();
        System.out.println("The area of the rectangle with the length of '" + length
                + "' and the width of '" + width + "' is: " + width * length);
    }
}
