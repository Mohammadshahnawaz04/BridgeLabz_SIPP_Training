package Control_flow_level1;
import java.util.Scanner;
public class seasoncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner input = new Scanner(System.in);

		        // Input month and day from user
		        System.out.print("Enter month (1 to 12): ");
		        int month = input.nextInt();

		        System.out.print("Enter day: ");
		        int day = input.nextInt();

		        boolean isSpring = false;

		        // Check if the date is within the spring season (March 20 - June 20)
		        if ((month == 3 && day >= 20 && day <= 31) ||
		            (month == 4 && day >= 1 && day <= 30) ||
		            (month == 5 && day >= 1 && day <= 31) ||
		            (month == 6 && day >= 1 && day <= 20)) {
		            isSpring = true;
		        }

		        if (isSpring) {
		            System.out.println("It's a Spring Season");
		        } else {
		            System.out.println("Not a Spring Season");
		        }

		        input.close();
		    }
		}

	


