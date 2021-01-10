package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do { // Get student names and ID numbers
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) { // if the is not done entering a student's name
                System.out.print("ID Number: "); // prompt the user to enter the student's ID number
                Integer newIdNumber = input.nextInt();

                students.put(newIdNumber, newStudent); // put the newStudent and their associated newIdNumber in the 'students' HashMap

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}