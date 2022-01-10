package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter some letters.");
        String userResponse = scanner.nextLine();
        System.out.printf("You entered: %s ", userResponse);
        return userResponse;
    }


    public boolean yesNo(){
        System.out.println("Enter yes or no.");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }

    }
    public int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d. \n", min, max);
        int userNum = scanner.nextInt();
        if (userNum > max || userNum < min){
            return getInt(min,max);
        }
        return userNum;
    }

    public int getInt(){
        System.out.println("Please enter in a number that is a whole number.");
        int userNum = scanner.nextInt();
        System.out.printf("The whole number you entered is: " + userNum);
        return userNum;
    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter in a number between %f and %f. \n",min,max);
        double userNum = scanner.nextDouble();
        if(userNum > max || userNum < min){
            return getDouble(min,max);
        }
        return userNum;
    }

    public double getDouble(){
        System.out.println("Please enter a number.");
        double userDouble = scanner.nextDouble();
        System.out.print("The number you entered is: " + userDouble);
        return userDouble;
    }



}
