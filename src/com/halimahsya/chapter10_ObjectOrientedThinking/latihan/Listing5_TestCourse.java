package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

public class Listing5_TestCourse {
    public static void main(String[] args) {
         course course1 = new course("Data Structures");
         course course2 = new course("Databese System");

        course1.addStudent("peter jones");
        course1.addStudent("kim smith");
        course1.addStudent("anne kennedy");

        course2.addStudent("peter jones");
        course2.addStudent("steve smith");

        System.out.println(" jumlah murid dalam course1 : " +
                course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println(" jumlah murid dalamcourse2: " +
                course2.getNumberOfStudents());
    }
}
