package Arrays;
import java.util.Scanner;
public class reversearray {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();

		        int temp = number;
		        int count = 0;

		        while (temp > 0) {
		            count++;
		            temp /= 10;
		        }

		        int[] digits = new int[count];
		        temp = number;
		        for (int i = count - 1; i >= 0; i--) {
		            digits[i] = temp % 10;
		            temp /= 10;
		        }

		        int[] reversedDigits = new int[count];
		        for (int i = 0; i < count; i++) {
		            reversedDigits[i] = digits[count - 1 - i];
		        }

		        System.out.print("Reversed number: ");
		        for (int digit : reversedDigits) {
		            System.out.print(digit);
		        }

		        sc.close();
		    }
		}

	


