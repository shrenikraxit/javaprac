package fundamentals;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: "); 
    String name = input.nextLine();           
    System.out.println("Hello, " + name + "!");               

    System.out.print("Enter your age: "); 
    int age = input.nextInt();           
    System.out.println("You are " + age + " years old.");

    System.out.println("Enter your age");
    String ageString = input.nextLine();
    int ageInt = Integer.parseInt(ageString);
    System.out.println("You are " + ageInt + " years old.");
    System.out.println("In 1 years, you will be " + (ageInt + 1) + " years old.");
    }
}
