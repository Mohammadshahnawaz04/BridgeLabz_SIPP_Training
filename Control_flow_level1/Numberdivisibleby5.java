package Control_flow_level1;
import java.util.*;

public class Numberdivisibleby5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num % 5 == 0) {
            System.out.println("Number is divisible by 5: " + num);
        } else {
            System.out.println("Number is not divisible by 5.");
        }
        
        sc.close();
    }
}



