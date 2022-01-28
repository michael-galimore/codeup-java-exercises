package grades;

import java.util.ArrayList;

public class Student {

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

    public void addGrade(int grade){
        studentGrades.add(grade);

    }


    public double getGradeAverage(){
        double total = 0;
       for (Integer studentGrade : studentGrades) {
           total = total + studentGrade;

        }
        double average = total/ studentGrades.size();
       return average;
    }

    public static void main(String[] args){

//The grades property should be an ArrayList of integers.
     Student s1 = new Student("kevin");
     s1.addGrade(88);
     s1.addGrade(89);
     s1.addGrade(100);
     s1.addGrade(70);
        System.out.println(s1.getGradeAverage());







}


}