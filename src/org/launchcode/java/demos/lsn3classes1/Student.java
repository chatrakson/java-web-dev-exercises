package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setStudent(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
        name = aName;
        studentId = aStudentId;
        numberOfCredits = aNumberOfCredits;
        gpa = aGpa;
    }

    public String getStudent() {
        return "Student Name: " + name +
                "\nStudent ID: " + studentId +
                "\nNumber of credits: " + numberOfCredits +
                "\nGPA: " + gpa;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentScore = this.gpa * this.numberOfCredits;
        double newScore = currentScore + (courseCredits * grade);
        this.numberOfCredits += courseCredits;
        this.gpa = newScore / this.numberOfCredits;
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        String result = (this.numberOfCredits < 29) ? "Freshman" :
                (this.numberOfCredits < 59) ? "Sophomore" :
                        (this.numberOfCredits < 89) ? "Junior" :
                                (this.numberOfCredits > 90) ? "Senior":
                                        "Error";
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && numberOfCredits == student.numberOfCredits && Double.compare(student.gpa, gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}