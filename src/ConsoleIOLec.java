import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args){
        String name = "Mike";
        String lastName = "G";
        int myFavoriteNumber = 13;
        System.out.printf("Hello my name is %s, %s.%nMy favorite number is %f", name, lastName, myFavoriteNumber);


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your fav color?");
        String userInput = scanner.nextLine();
        System.out.printf("Your fav color is: %s", userInput);




    }
}
