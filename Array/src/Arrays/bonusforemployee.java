package Arrays;
import java.util.Scanner;
public class bonusforemployee {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        final int NUM_EMPLOYEES = 10;

		        double[] salary = new double[NUM_EMPLOYEES];
		        double[] yearsOfService = new double[NUM_EMPLOYEES];

		        double[] bonus = new double[NUM_EMPLOYEES];
		        double[] newSalary = new double[NUM_EMPLOYEES];

		        double totalBonus = 0.0;
		        double totalOldSalary = 0.0;
		        double totalNewSalary = 0.0;

		        for (int i = 0; i < NUM_EMPLOYEES; i++) {
		            System.out.println("Enter data for Employee " + (i + 1) + ":");

		            System.out.print("  Salary: ");
		            salary[i] = sc.nextDouble();

		            System.out.print("  Years of Service: ");
		            yearsOfService[i] = sc.nextDouble();

		            if (salary[i] <= 0 || yearsOfService[i] < 0) {
		                System.out.println("  Invalid input. Please enter positive values.\n");
		                i--; 
		                continue;
		            }
		        }

		        for (int i = 0; i < NUM_EMPLOYEES; i++) {
		            if (yearsOfService[i] > 5) {
		                bonus[i] = salary[i] * 0.05;
		            } else {
		                bonus[i] = salary[i] * 0.02;
		            }

		            newSalary[i] = salary[i] + bonus[i];

		            totalBonus += bonus[i];
		            totalOldSalary += salary[i];
		            totalNewSalary += newSalary[i];
		        }

		        // Step 6: Output
		        System.out.println("\n--- Employee Salary and Bonus Summary ---");
		        for (int i = 0; i < NUM_EMPLOYEES; i++) {
		            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
		                              (i + 1), salary[i], bonus[i], newSalary[i]);
		        }

		        System.out.println("\n--- Totals ---");
		        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
		        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
		        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

		        sc.close();
		    }
		}

	


