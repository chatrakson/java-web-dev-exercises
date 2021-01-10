package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Course {
    private HashMap<Integer, String> classIdName = new HashMap<>();
    private int numberOfCredits;
    private String fallSpringBoth;

    public void setCourse(Integer[] aCourseId, String[] aCourseName, int aNumberOfCredits, String aFallSpringBoth) {
        for (int i = 0; i < aCourseId.length; i++) {
            classIdName.put(aCourseId[i], aCourseName[i]);
        }
        numberOfCredits = aNumberOfCredits;
        fallSpringBoth = aFallSpringBoth;
    }

    public void getCourse() {
        for (Map.Entry<Integer, String> aCourse : classIdName.entrySet()) {
            System.out.println("Course ID: " + aCourse.getKey()
                    + "\nCourse Name: " + aCourse.getValue()
                    + "\nCredit Amount: " + numberOfCredits
                    + "\nClass offer: " + fallSpringBoth
                    + "\n----------");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return numberOfCredits == course.numberOfCredits && Objects.equals(classIdName, course.classIdName) && Objects.equals(fallSpringBoth, course.fallSpringBoth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classIdName, numberOfCredits, fallSpringBoth);
    }

    @Override
    public String toString() {
        return "Course{" +
                "classIdName=" + classIdName +
                ", numberOfCredits=" + numberOfCredits +
                ", fallSpringBoth='" + fallSpringBoth + '\'' +
                '}';
    }
}
