import java.util.Scanner;

public class DoubleChallenge {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter num 1: ");
    double num1 = input.nextDouble();
    System.out.print("Enter num 2: ");
    double num2 = input.nextDouble();
    
    System.out.println("The doubled numbers are: " + num1 + " and " + num2);
    
    input.close(); // Close the scanner to avoid resource leak
    }

}
