package fundamentals.arrays;

import java.util.Scanner;

public class TwoDTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][2];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("Enter a value for row: " + i + ", and column: " + j);
                num[i][j] = input.nextInt();
            }
        }

        printArray(num);
        input.close();
    }

    private static void printArray(int[][] array) {
        System.out.println("Array:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
