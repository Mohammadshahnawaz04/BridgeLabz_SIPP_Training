package Control_flow_level1;

import java.util.*;
public class largestof3number {

	public static void main(String[] args) {
			    
		Scanner sc = new Scanner(System.in);		       
				        System.out.print("Enter first number: ");
				        int number1 = sc.nextInt();
				        System.out.print("Enter second number: ");
				        int number2 = sc.nextInt();
				        System.out.print("Enter third number: ");
				        int number3 = sc.nextInt();

				        
				        boolean isLargest = (number1 > number2) && (number1 > number3);

				        
				        System.out.println("Is the first number the Largest? " + isLargest);

				        sc.close();
				    }
				

			}

	


