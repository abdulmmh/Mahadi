package Jan16And17.monthlyevidencepractice.javaprogrammingproblem;

import java.util.Scanner;


public class SumUntilInputNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter numbers (enter a negative number to stop):");
        
        int num = input.nextInt();
        int sum = 0;
        
        while (num >= 0) {            
            sum += num;
            num = input.nextInt();
        }
        System.out.println("Total: " + sum);
        input.close();
    }
}
