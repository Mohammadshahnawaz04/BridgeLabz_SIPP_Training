package Arrays;
import java.util.Scanner;
public class validage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] ages = new int[10];
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the age of 10 students:");
		        for (int i = 0; i < ages.length; i++) {
		            System.out.print("Enter age for student " + (i + 1) + ": ");
		            ages[i] = sc.nextInt();
		        }
		        System.out.println("\nVoting Eligibility Results:");
		        for (int i = 0; i < ages.length; i++) {
		            int age = ages[i];
		            if (age < 0) {
		                System.out.println("Student " + (i + 1) + ": Invalid age entered.");
		            } else if (age >= 18) {
		                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
		            } else {
		                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
		            }
		        }
		    }
		}

	


