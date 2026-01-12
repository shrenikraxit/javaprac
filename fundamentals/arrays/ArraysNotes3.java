package fundamentals.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysNotes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceList = new ArrayList<>();
        System.out.println("Enter prices (type 'done' when finished):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                priceList.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Please enter a valid integer or 'done'.");
            }
        }

        int[] price = priceList.stream().mapToInt(i -> i).toArray();

        if (price.length % 2 == 0) {
            // Even length: average of two middle numbers
            int mid1 = price[price.length / 2 - 1];
            int mid2 = price[price.length / 2];
            double median = (mid1 + mid2) / 2.0;
            System.out.println(median);
        } else {
            // Odd length: middle number
            int median = price[price.length / 2];
            System.out.println(median);
        }
    }
}

while (scanner.hasNext()) {
    if (scanner.hasNextInt()) {
        priceList.add(scanner.nextInt());
    } else if (scanner.next().equalsIgnoreCase("done")) {
        break;
    } else {
        System.out.println("Please enter a valid integer or 'done'.");
    }
}

int[] price = priceList.stream().mapToInt(i -> i).toArray();