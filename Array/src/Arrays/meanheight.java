package Arrays;
import java.util.Scanner;
public class meanheight {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        double[] heights = new double[11];

		        System.out.println("Enter the heights of 11 football players (in cm):");
		        double sum = 0.0;

		        for (int i = 0; i < heights.length; i++) {
		            System.out.print("Player " + (i + 1) + " height: ");
		            heights[i] = sc.nextDouble();
		            sum += heights[i]; 
		        }

		        double mean = sum / heights.length;

		        System.out.println("The mean height of the football players is: " + mean + " cm");

		        sc.close();
		    }
		}

	


