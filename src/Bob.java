import java.util.Scanner;

public class Bob {
    public static void main(String[]args){
        System.out.println("What would you like to tell Bob?");
        Scanner scanner = new Scanner(System.in);
        String tellBob = scanner.next();

        if(tellBob.trim().endsWith("?")){
            System.out.println("Sure");
        } else if (tellBob.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (tellBob.isEmpty()){
            System.out.println("Fine. Be that way!");
        } else{
            System.out.println("Whatever");
        }
    }
}
