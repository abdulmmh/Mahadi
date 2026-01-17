package Jan16And17.monthlyevidencepractice.javaprogrammingproblem;

import java.util.*;


public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many? ");
        int n = input.nextInt();
        
         if (n <= 0) {
            System.out.println("Invalid input!");
            input.close();
            return;
        }
        
        System.out.print("Enter " + n + " numbers: ");
        int num = input.nextInt();
        int max = num, min = num;
        for (int i = 0; i < n - 1; i++) {
             num = input.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
        
        input.close();
    }
}
