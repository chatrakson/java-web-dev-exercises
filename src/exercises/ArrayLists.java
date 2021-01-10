package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists {
    static Integer evenSum (ArrayList<Integer> someArrayList) {
        Integer sumOfEven = 0;
        for (Integer evenNum : someArrayList) {
            if (evenNum % 2 == 0) {
                sumOfEven += evenNum;
            }
        }
        return sumOfEven;
    }

    static void wordLength (List<String> someWordArrayList, Integer wordLength) {
        for (String word : someWordArrayList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }

    public static void main (String[] args) {
        ArrayList<Integer> testArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            testArrayList.add(i);
        }

        Integer testSum = evenSum(testArrayList);
        System.out.println(testSum);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word length you're looking for:");
        Integer wordLength = input.nextInt();

        String exerciseSentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitExerciseSentence = exerciseSentence.split("\\W+");
        /* ^^ string converted into an Array from 'Array exercise' ^^ */

        List<String> stringArrayList = new ArrayList<String>(); // a String List called, stringArrayList, is a new string arrayList
        stringArrayList = Arrays.asList(splitExerciseSentence); // stringArrayList is assign the 'splitExerciseSentence' Array as an ArrayList

        wordLength(stringArrayList, wordLength);
    }
}
