import java.util.Scanner;

class EmailChallenge {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter word 1: "); 
    String w1 = input.next();                       

    System.out.print("Enter word 2: "); 
    String w2 = input.next();           

    System.out.println("Enter number 1 ");
    int num1 = input.nextInt();

    System.out.println("Enter number 2 ");
    int num2 = input.nextInt();

    if (num1 + num2 < 100) {
        int numfinal = num1 + num2;
        System.out.println("Your email address is: " + w1 + "." + w2 + numfinal + "@gmail.com");
        return;

    }

    else {}
     System.out.println("Please enter numbers that add up to less than 100.");
     System.out.println("ReEnter1 your numbers:");
        int rnum1 = input.nextInt();
        int rnum2 = input.nextInt();
    int rnumfinal = rnum1 + rnum2;
    System.out.println("Your email address is: " + w1 + "." + w2 + rnumfinal + "@gmail.com");
    }
}
