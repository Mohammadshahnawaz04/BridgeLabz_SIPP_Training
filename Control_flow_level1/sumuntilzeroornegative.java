package Control_flow_level1;
import java.util.Scanner;
public class sumuntilzeroornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        double total = 0.0; // Initialize total sum

		        while (true) {
		            // Prompt user for input
		            System.out.print("Enter a number (0 or negative to stop): ");
		            double number = input.nextDouble();

		            // Break if number is 0 or negative
		            if (number <= 0) {
		                break;
		            }

		            // Add to total
		            total += number;
		        }

		        // Display total sum
		        System.out.println("The total sum is: " + total);

		        input.close();
		    }
		}

	


