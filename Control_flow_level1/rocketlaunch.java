package Control_flow_level1;
import java.util.Scanner;
public class rocketlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Take countdown starting value from the user
		        System.out.print("Enter countdown starting number: ");
		        int counter = input.nextInt();

		        // Use while loop to count down from counter to 1
		        while (counter >= 1) {
		            System.out.println(counter);
		            counter--; // Decrement the counter
		        }

		        // Simulate rocket launch
		        System.out.println("🚀 Rocket Launched!");

		        input.close();
		    }
		}

	


