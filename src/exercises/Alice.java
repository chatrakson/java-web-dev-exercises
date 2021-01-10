package exercises;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";

        String newSentence;

        System.out.println("Hello, please enter a word:");
        String word = input.nextLine();

        String firstSentenceLower = firstSentence.toLowerCase();
        String wordLower = word.toLowerCase();

        while (!word.equals("quit")) {
            if (firstSentenceLower.contains(wordLower)) {
                System.out.println(firstSentenceLower.indexOf(wordLower));
                System.out.println(wordLower.length());
                newSentence = firstSentence.toLowerCase().replaceFirst(wordLower + " ", "");
                System.out.println(newSentence);
            } else {
                System.out.println("false");
            }
            System.out.println("Hello, please enter a word:");
            word = input.nextLine().toLowerCase();
        }
    }
}
