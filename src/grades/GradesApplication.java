package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        boolean running = true;
        do {
            HashMap<String, Student> students = new HashMap<>();

            Student s1 = new Student("kevin");
            students.put("kevin", s1);
            s1.addGrade(99);
            s1.addGrade(88);
            s1.addGrade(100);


            Student s2 = new Student("kobe");
            s2.addGrade(100);
            s2.addGrade(99);
            s2.addGrade(100);
            students.put("kobe", s2);


            Student s3 = new Student("steph");
            students.put("steph", s3);
            s3.addGrade(92);
            s3.addGrade(92);
            s3.addGrade(98);
            students.put("steph", s3);

            Student s4 = new Student("lebron");
            students.put("lebron", s4);
            s4.addGrade(96);
            s4.addGrade(97);
            s4.addGrade(100);


            System.out.println("Welcome \n\n" + "Here are the GitHub usernames of our students:\n\n" + students + "\n\nWhat student would you like to see more information on?");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
//                student name, username, average
            if (userInput.equals("kevin")) {
                System.out.println("Username: " + s1.getName() + "\n" + "GitHub Username: " + students.get("kevin") + "\n" + "Grade average: " + s1.getGradeAverage());

            } else if (userInput.equals("kobe")) {
                System.out.println("Username: " + s2.getName() + "\n" + "GitHub Username: " + students.get("kobe") + "\n" + "Grade average: " + s2.getGradeAverage());

            } else if (userInput.equals("steph")) {
                System.out.println("Username: " + s3.getName() + "\n" + "GitHub Username: " + students.get("steph") + "\n" + "Grade average: " + s3.getGradeAverage());

            } else if (userInput.equals("lebron")) {
                System.out.println("Username: " + s4.getName() + "\n" + "GitHub Username: " + students.get("lebron") + "\n" + "Grade average: " + s4.getGradeAverage());
            } else {
                System.out.println("User does not exist");
                Scanner sc1 = new Scanner(System.in);
                String query = sc.nextLine();
                if(query.equalsIgnoreCase("yes")|| query.equalsIgnoreCase("y")){
                    running = true;
                }else if (query.equalsIgnoreCase("no" ) || query.equalsIgnoreCase("n"));
                running = false;
            }
        }while(running);
    }
}