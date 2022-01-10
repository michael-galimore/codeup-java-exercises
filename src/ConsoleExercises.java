import java.util.Scanner;

public class ConsoleExercises {
    public static void  main(String[] args){
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %f%n", pi);


//        Scanner Class
//      1.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

//        System.out.println("Please enter an integer.");
//        int userNum = scanner.nextInt();
//        System.out.printf("The number you entered is %s%n", userNum);
//        If an integer is not entered a mismatch exception occurs.

//      2.
//        System.out.println("Enter three words");
//        String userWord = scanner.next();
//        String userWord1 = scanner.next();
//        String userWord2 = scanner.next();
//        System.out.printf("The words that you entered are: %n%s, %n%s, %n%s.", userWord, userWord1, userWord2);
//      What happens if you enter less than 3 words?
//      It does not print the words and waits for the third word to be entered.
//      What happens if you enter more than 3 words?
//      The code only prints the 3 words.

//        3.
//        System.out.println("Please enter a sentence");
//        String userSent = scanner.nextLine();
//        System.out.format("Your sentence is: %s", userSent);
//        do you capture all the words?
//        Yes I captured all the words because I used the nextLine method from the lecture. You would capture all the words because of the whitespace created by the space bar when you separate the words.
//        4. I used the nextLine method first.


//      Calculate the perimeter and area of room.

//        1. Prompt the user to enter values of length and width of room.
        System.out.println("Please list the length of your room");
        double userLength = Double.parseDouble(scanner.nextLine());
        System.out.println("Please list the width of your room");
        double userWidth = Double.parseDouble(scanner.nextLine());
//        2. Display the area and perimeter of that classroom.
//
//The area of a rectangle is equal to the length times the width,
        double userArea = userLength * userWidth;

//       the perimeter of a rectangle is equal to 2 times the length plus 2 times the width
        double userPerimeter = userLength*2 + userWidth*2;
        System.out.println("The area of your room is: " + userArea);
        System.out.println("The perimeter of your room is: " + userPerimeter);


//code used in class
//        System.out.println("Please list the length of your room");
//        double length = Double.parseDouble(scanner.nextLine());
//        System.out.println("Please list the width of your room");
//        double width = Double.parseDouble(scanner.nextLine());
////        double area = width * length;
//        double perimeter = (width * 2) + (length * 2);
//        System.out.println("Area: " + area);
//        System.out.println("Perimeter: " + perimeter);

    }
}
