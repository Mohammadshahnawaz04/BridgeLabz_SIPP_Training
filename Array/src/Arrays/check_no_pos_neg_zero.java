package Arrays;
import java.util.Scanner;
public class check_no_pos_neg_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        int[] numbers = new int[5];

		       
		        System.out.println("Enter 5 numbers:");
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.print("Number " + (i + 1) + ": ");
		            numbers[i] = sc.nextInt();
		        }

		        System.out.println("\nAnalysis of numbers:");
		        for (int i = 0; i < numbers.length; i++) {
		            int num = numbers[i];
		            System.out.print("Number " + num + " is ");

		            if (num > 0) {
		                if (num % 2 == 0) {
		                    System.out.println("Positive and Even");
		                } else {
		                    System.out.println("Positive and Odd");
		                }
		            } else if (num < 0) {
		                System.out.println("Negative");
		            } else {
		                System.out.println("Zero");
		            }
		        }

		        int first = numbers[0];
		        int last = numbers[4];
		        System.out.println("\nComparison of first and last elements:");
		        if (first == last) {
		            System.out.println("First and Last elements are Equal");
		        } else if (first > last) {
		            System.out.println("First element is Greater than Last");
		        } else {
		            System.out.println("First element is Less than Last");
		        }

		        sc.close();
		    }
		}

	


