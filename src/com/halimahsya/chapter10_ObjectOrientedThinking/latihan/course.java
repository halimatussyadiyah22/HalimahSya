package com.halimahsya.chapter10_ObjectOrientedThinking.latihan;

public class course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfSetudents;

    public course(String  courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfSetudents] = student;
        numberOfSetudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public  int getNumberOfStudents(){
        return numberOfSetudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){

    }
}
