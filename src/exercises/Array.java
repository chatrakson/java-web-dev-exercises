package exercises;

import java.util.Arrays;

public class Array {
    public static void main (String[] args) {
        int[] someArray = {1, 1, 2, 3, 5, 8};

        for (int num : someArray) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        String exerciseSentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitExerciseSentence = exerciseSentence.split("\\W+");

        System.out.println(Arrays.toString(splitExerciseSentence));
    }
}
