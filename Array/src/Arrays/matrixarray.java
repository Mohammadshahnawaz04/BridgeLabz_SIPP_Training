package Arrays;
import java.util.Scanner;
public class matrixarray {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter number of rows: ");
		        int rows = scanner.nextInt();

		        System.out.print("Enter number of columns: ");
		        int columns = scanner.nextInt();

		        int[][] matrix = new int[rows][columns];

		        System.out.println("Enter elements of the matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print("Element at [" + i + "][" + j + "]: ");
		                matrix[i][j] = scanner.nextInt();
		            }
		        }

		        int[] oneDArray = new int[rows * columns];
		        int index = 0;

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                oneDArray[index] = matrix[i][j];
		                index++;
		            }
		        }

		        System.out.println("\n1D Array:");
		        for (int i = 0; i < oneDArray.length; i++) {
		            System.out.println("Element at index " + i + ": " + oneDArray[i]);
		        }

		        scanner.close();
		    }
		}

	


