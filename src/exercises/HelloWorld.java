package exercises;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine(); // the user's input will be stored within the "name" string variable
        System.out.println("Hello " + name);
    }
}
