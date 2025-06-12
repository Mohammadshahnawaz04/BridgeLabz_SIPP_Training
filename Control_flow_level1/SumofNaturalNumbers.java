package Control_flow_level1;
import java.util.Scanner;
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = input.nextInt();

		       
		        if (number > 0) {
		            
		            int sum = number * (number + 1) / 2;
		            System.out.println("The sum of " + number + " natural numbers is " + sum);
		        } else {
		            System.out.println("The number " + number + " is not a natural number.");
		        }

		        input.close();
		    }
		}

	


