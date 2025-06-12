package Control_flow_level1;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        double total = 0.0; // Initialize total sum
		        double number;      // Variable to store user input

		        // Prompt user for the first input
		        System.out.print("Enter a number (0 to stop): ");
		        number = input.nextDouble();

		        // Loop until user enters 0
		        while (number != 0) {
		            total += number; // Add input to total

		            // Ask for the next input
		            System.out.print("Enter another number (0 to stop): ");
		            number = input.nextDouble();
		        }

		        // Display the final total
		        System.out.println("The total sum is: " + total);

		        input.close();
		    }
		}

	


