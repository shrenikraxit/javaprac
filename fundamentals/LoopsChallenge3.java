package fundamentals;
public class LoopsChallenge3 {

}
public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int answer = (int) (Math.random() * 3) + 1;
    int guess = 0;
    
    while (guess != answer) {
        System.out.print("Guess a number between 1 and 3: ");
        guess = scanner.nextInt();
        
        if (guess == answer) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Wrong answer, try again.");
        }
    }
    
    scanner.close();
}