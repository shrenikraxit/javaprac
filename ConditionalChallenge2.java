import java.util.Scanner;

public class ConditionalChallenge2 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number % 2 != 1) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    
}
}
