package Control_flow_level1;
import java.util.Scanner;
public class sumofnaturalnumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Take input from the user
		        System.out.print("Enter a natural number: ");
		        int n = input.nextInt();

		        // Check if the number is a natural number (> 0)
		        if (n > 0) {
		            // Sum using while loop
		            int sumLoop = 0;
		            int i = 1;
		            while (i <= n) {
		                sumLoop += i;
		                i++;
		            }

		            // Sum using formula
		            int sumFormula = n * (n + 1) / 2;

		            // Print both results
		            System.out.println("Sum using while loop: " + sumLoop);
		            System.out.println("Sum using formula: " + sumFormula);

		            // Compare results
		            if (sumLoop == sumFormula) {
		                System.out.println("Both computations are correct and match.");
		            } else {
		                System.out.println("There is a mismatch in the computations.");
		            }
		        } else {
		            System.out.println("The number " + n + " is not a natural number.");
		        }

		        input.close();
		    }
		}

	


