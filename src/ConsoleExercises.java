import java.util.Scanner;

public class ConsoleExercises {
    public static void  main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %f%n", pi);


//        Scanner Class
//      1.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number.");
//        int userNum = scanner.nextInt();
//        System.out.printf("The number you entered is %s%n", userNum);
//        If an integer is not entered a mismatch exception occurs.

//      2.
//        System.out.println("Enter three words");
//        String userWord = scanner.next();
//        String userWord1 = scanner.next();
//        String userWord2 = scanner.next();
//        System.out.printf("The words that you entered are: %s, %s, %s.", userWord, userWord1, userWord2);
//      What happens if you enter less than 3 words?
//      It does not print the words and waits for the third word to be entered.
//      What happens if you enter more than 3 words?
//      The code only prints the 3 words.

//        3.
//        System.out.println("Please enter a sentence");
//        String userSent = scanner.nextLine();
//        System.out.format("Your sentence is: %s", userSent);
//        do you capture all the words?
//        Yes I captured all the words because I used the nextLine method from the lecture.
//        4. I used the nextLine method first.


//      Calculate the perimeter and area of room.

//        1. Prompt the user to enter values of length and width of room.
        System.out.println("Please list the length of your room");
        System.out.println("Please list the width of your room");
        String userLength = scanner.nextLine();
        String userWidth = scanner.nextLine();
        float perimeter = Float.parseFloat(userLength+userWidth);
//        String userPerimeter = userLength + userWidth;
        System.out.format("The perimeter of your room is: %d", perimeter);


    }
}
