package grades;

import java.util.ArrayList;

public abstract class Student {

    //    It should have private properties for the student's name, and grades.
    private String studentName;
    private ArrayList<Integer> studentGrades;


    //The student class should have a constructor that sets name property, and
    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGrades = new ArrayList<>();

    }


    public String getName(){
        return studentName;
    }

    public void addGrade(double grade){

    }


//    public double getGradeAverage(){
//        int [] st
//
//    }












    public static void main(String[] args){

//The grades property should be an ArrayList of integers.
     ArrayList<Integer> grades = new ArrayList<Integer>();







}


}