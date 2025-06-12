package Control_flow_level1;
import java.util.Scanner;
public class numbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Taking input from user
		        System.out.print("Enter a number: ");
		        int number = input.nextInt();

		        // Check if the number is positive, negative, or zero
		        if (number > 0) {
		            System.out.println("The number is positive.");
		        } else if (number < 0) {
		            System.out.println("The number is negative.");
		        } else {
		            System.out.println("The number is zero.");
		        }

		        input.close();
		    }
		}

	


