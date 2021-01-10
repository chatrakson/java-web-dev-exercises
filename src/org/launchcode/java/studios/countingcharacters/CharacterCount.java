package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    static void getOccuringChar (String str) { // HH
        int UNICODE_MAX_VALUE = 95211;
        int count[] = new int[UNICODE_MAX_VALUE];
        char chr[] = new char[str.length()];
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            // starting at zero, incrementing by 1, stop after greater than length of pass through string
            // when we find a letter in the sentence, it increments the letter's value in the index by 1
            // meaning, if the sentence contains 'h' its index 104 (its unicode value)
            // will increment that index value's by 1
        }

        for (int i = 0; i < str.length(); i++) { // for every character in the passthrough sentence
            chr[i] = str.charAt(i); // putting each character from the passthrough sentence into the chr array
            int find = 0;

            for (int j = 0; j <= i; j++) { // for every character in the passthrough sentence
                if (str.charAt(i) == chr[j]) { // if a character from the passthrough sentence is IN the chr array
                    characterCount.put(str.charAt(i), count[str.charAt(i)]); // put the character and its count into the characterCount HashMap
                }
            }
        }

        for (Map.Entry<Character, Integer> uniqueCharacter : characterCount.entrySet()) {
            System.out.println(uniqueCharacter.getKey() + ": " + uniqueCharacter.getValue());
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String testSentence = "If the product of two terms is zero then common sense says at least one of the two" +
                " terms has to be zero to start with. So if you move all the terms over to one side, you can put" +
                " the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";

        System.out.println("Please enter a string of words:");
        String userInput = input.nextLine();

        getOccuringChar(userInput);
    }
}
