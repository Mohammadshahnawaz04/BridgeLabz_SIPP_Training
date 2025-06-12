package Control_flow_level1;
import java.util.Scanner;
public class votingelegibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Taking age input from user
		        System.out.print("Enter the person's age: ");
		        int age = input.nextInt();

		        // Check if the person is eligible to vote
		        if (age >= 18) {
		            System.out.println("The person's age is " + age + " and can vote.");
		        } else {
		            System.out.println("The person's age is " + age + " and cannot vote.");
		        }

		        input.close();
		    }
		}

	


