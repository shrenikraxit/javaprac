import java.util.Scanner;


public class ConditionalChallenge3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your grade: ");
    int grade = scanner.nextInt();

    if (grade >= 90 && grade <= 100) {
        System.out.println("Grade: A");
    } else if (grade >= 80 && grade < 90) {
        System.out.println("Grade: B");
    } else if (grade >= 70 && grade < 80) {
        System.out.println("Grade: C");
    } else if (grade >= 60 && grade < 70) {
        System.out.println("Grade: D");
    } else if (grade < 60) {
        System.out.println("Grade: F");
    }
    
    scanner.close();
}
}