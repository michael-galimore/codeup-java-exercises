import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1-100");
        int generatedNum = (int) ((Math.random() * (100 - 1)) + 1);

        boolean guessing = false;
        do {
            int userNum = MethodsExercises.getInteger(1,100);
            if (generatedNum == userNum) {
                System.out.println("GOOD GUESS!");
                guessing = true;
            } else if (userNum > generatedNum){
                System.out.println("LOWER");

            } else if (userNum < generatedNum ){
                System.out.println("HIGHER");

            }
        }while(!guessing);
    }

}
