package Arrays;
import java.util.*;

public class factorsofnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take the input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Step 2: Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Loop through from 1 to number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If array is full, double its size
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

                // Add factor to array
                factors[index] = i;
                index++;
            }
        }

        // Step 5: Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}



