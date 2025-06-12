package Control_flow_level1;
import java.util.Scanner;
public class factorialcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Take integer input from user
		        System.out.print("Enter a positive integer: ");
		        int number = input.nextInt();

		        // Check if the input is a positive integer
		        if (number >= 0) {
		            long factorial = 1; // Use long to handle large results
		            int i = 1;

		            // Calculate factorial using while loop
		            while (i <= number) {
		                factorial *= i;
		                i++;
		            }

		            // Display the result
		            System.out.println("The factorial of " + number + " is: " + factorial);
		        } else {
		            System.out.println("Please enter a non-negative integer.");
		        }

		        input.close();
		    }
		}

	


