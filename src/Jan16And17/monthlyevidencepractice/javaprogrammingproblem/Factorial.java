package Jan16And17.monthlyevidencepractice.javaprogrammingproblem;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long factorial = 1;
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial *= i; 
        }
        
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
