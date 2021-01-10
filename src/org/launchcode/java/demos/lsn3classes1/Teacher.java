package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    public void setTeacher(String aFirstName, String aLastName, String aSubject, double aYearsTeaching) {
        firstName = aFirstName;
        lastName = aLastName;
        subject = aSubject;
        yearsTeaching = aYearsTeaching;
    }

    public String getTeacher() {
        return "Teacher name: " + firstName + " " + lastName
                + "\nSubject: " + subject
                + "\nYears teaching: " + yearsTeaching;
    }
}
