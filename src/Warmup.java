import java.util.Scanner;

public class Warmup {
        public static void main (String[] args){
            System.out.println("Java is statically typed, while Javascript is dynamically typed.");


            Scanner scanner = new Scanner(System.in);
            System.out.println("What did you have for breakfast?");

            String userBreakfast = scanner.nextLine();
            System.out.printf("Eww... you had %s? You need some bacon in your life kid.", userBreakfast);
        }
    }

