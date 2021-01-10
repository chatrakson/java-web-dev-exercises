package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student me = new Student();

        me.setStudent("Chat", 1, 1, 4.0);

        System.out.println(me.getStudent());

        me.addGrade(1, 3.0);

        System.out.println(me.getStudent());

        // --------

        System.out.println("------------");

        Course english = new Course();

        Integer[] englishClassesId = {100, 200, 300};
        String[] englishClassesName = {"English 101", "English Mid level", "English Finals"};

        english.setCourse(englishClassesId, englishClassesName, 3, "Both");

//        english.getCourse();

        // --------

        System.out.println("------------");

        Teacher newTeacher = new Teacher();

        newTeacher.setTeacher("Chat", "Rakson", "English", 1.5);

//        System.out.println(newTeacher.getTeacher());
    }
}
