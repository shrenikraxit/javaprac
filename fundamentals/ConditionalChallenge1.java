package fundamentals;
import java.util.Scanner;

public class ConditionalChallenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Csaea123";

        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();

        if (userPassword.equals(password)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
