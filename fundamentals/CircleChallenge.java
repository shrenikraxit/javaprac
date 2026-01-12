package fundamentals;
import java.util.Scanner;

public class CircleChallenge {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the diameter of the circle: "); 
        double diameter = input.nextDouble();
        double radius = diameter / 2.0;           

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("The area of the circle is: %.2f%n", area);
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
    }
    
}
