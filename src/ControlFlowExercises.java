import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        1.
//        a. While
//        Create an integer variable i with a value of 5.
//        int i = 5;
//        Create a While loop that runs so long as i is less than or equal to 15
//        while (i <= 15) {
//        System.out.println(i);
//        i++;
//        }

//        b.
//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        int m = 0;
        do{
            System.out.println(m); /*Follow each number with a new line.*/
            m+=2;
        }
         while(m <= 100);


//        Alter your loop to count backwards by 5's from 100 to -10.
        int d = 100;
        do{
            System.out.println(d);
            d-=5;
        }
        while(d >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
//
        int square = 2;
        do{
            System.out.println(square);
          square = (int)Math.pow(square,2);
        }
        while(square < 1000000);

//        For
        for(int mdg = 2; mdg <= 1000000; mdg*=2){
            System.out.println(mdg);
        }

//          Fizzbuzz


            for(int e = 1; e <= 100; e++){
                System.out.println(e);
                if(e % 3 == 0){
                    System.out.format("Fizz %s%n ", e);
                }  else if (e % 5 == 0){
                    System.out.format("Buzz %s %n ", e);
                } if(e % 3 == 0 && e % 5 == 0){
                    System.out.format("FizzBuzz %s%n ", e);
                }
            }

//              3.
        boolean decision = true;
        while (decision) {

            System.out.println("Please enter in a whole number");
            int userNum = scanner.nextInt();
            System.out.println("numbers" + "|" + "squared" + "|" + "cubed");
            System.out.println("-------" + "|" + "-------" + "|" + "-----");
            for (int i = 1; i <= userNum; i++) {
                int userSq = (int) Math.pow(i, 2);
                int userCubed = (int) Math.pow(i, 3);
                int count = userNum;
                System.out.println(i + "     " + " |" + userSq + "     " + " |" + userCubed);
            }
            System.out.println("Would you like to continue? Enter true for yes and false for no");
            decision = scanner.nextBoolean();
        }

//       4.
        System.out.println("Please enter numerical grade in between 0-100.");
        byte userGrade = scanner.nextByte();
        if(userGrade <= 100 && userGrade >= 88){
            System.out.println("You got an A");
        } else if (userGrade <= 87 && userGrade >= 80 ){
            System.out.println("You got a B");
        } else if (userGrade <= 79 && userGrade >= 67){
            System.out.println("You got a C");
        } else if (userGrade <= 66 && userGrade >= 60){
            System.out.println("You got a D");
        } else if (userGrade <= 59 && userGrade >= 0){
            System.out.println("You got a F");
        }





    }
    }
