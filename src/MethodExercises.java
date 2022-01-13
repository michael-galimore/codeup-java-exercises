import java.util.Scanner;

public class MethodExercises {
    public static int add(int num, int num1){
        return num + num1;
    }

    public static int sub(int num, int num1){
        if(num < num1){
            return sub(num1, num);

        }else {
            return num - num1;
        }
    }

    public static int multi(int num, int num1){
        return num * num1;
    }

    public static int div(int num, int num1) {
        if (num < num1) {
            return div(num, num1);
        } else {
            return num / num1;
        }
    }



//    Part 2
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a number between 1 and 10");
        int userNum = scanner.nextInt();
        if (userNum > max || userNum < min) {
            return getInteger(min, max);
        }
        return userNum;
    }


// Factorial
        public static void factorial() {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");

            String continueOn;

            do {
                long userFactorial = 1;
                int userNumber = getInteger(1, 10);
                System.out.printf("You chose %d \n", userNumber);
                for (int i = 1; i <= userNumber; i++){
                    userFactorial *= i;
                }
                System.out.println(userFactorial);
                System.out.println("Would you like to contine? yes/no?");
                continueOn = scanner.next();
            } while (continueOn.equalsIgnoreCase("yes"));

//Dice Game


        }

    public static void rollDice(int num) {
        int dice1 = (int) (Math.random() * (num - 1) + 1);
        int dice2 = (int) (Math.random() * (num - 1) + 1);
        System.out.printf("Dice 1 rolled %d, Dice 2 rolled %d%n", dice1, dice2);
    }






    public static void main(String[] args){
        System.out.println(add(9,40));
        System.out.println(sub(20,5));
        System.out.println(multi(13,7));
        System.out.println(div(300,10));
        getInteger(1,10);
        factorial();


        boolean confirm = true;
            Scanner scanner = new Scanner(System.in);
        while (confirm) {
            System.out.println("How many sides?");
            int sides = scanner.nextInt();
            rollDice(sides);
            System.out.println("Would you like to go again? (yes/no)");
            String userConfirm = scanner.next();
            confirm = userConfirm.equalsIgnoreCase("yes");
        }


    }
}
