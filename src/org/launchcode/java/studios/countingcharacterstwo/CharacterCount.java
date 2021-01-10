package org.launchcode.java.studios.countingcharacterstwo;

import java.io.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main (String[] args) throws IOException {

        String fileName = "D:\\JavaProject\\java-web-dev-exercises\\testDocument.txt";

        getOccuringChar(readFile(fileName));

    }

    public static String readFile (String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Scanner fileInput = new Scanner(path);
        String line = "";

        while(fileInput.hasNextLine()){
            //process each line
            line += fileInput.nextLine();
        }
        fileInput.close();
        return line;
    }

    static void getOccuringChar (String str) {
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");

        int[] count = new int[95221]; // holds the value
        char[] chr = new char[newStr.length()]; // holds the key

        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < newStr.length(); i++) { // looping through every char in a String
            chr[i] = str.charAt(i); // pass "test"
            count[newStr.charAt(i)]++;

            for (int j = 0; j <= i; j++) {
                if (newStr.charAt(i) == chr[j]) { // if passthrough char starting 0 is the same as our chr array at 0
                    result.put(newStr.charAt(i), count[newStr.charAt(i)]);
                }
            }
        }

        for (Map.Entry<Character, Integer> uniqueCharacter : result.entrySet()) {
            System.out.println(uniqueCharacter.getKey() + ": " + uniqueCharacter.getValue());
        }
    }
}
