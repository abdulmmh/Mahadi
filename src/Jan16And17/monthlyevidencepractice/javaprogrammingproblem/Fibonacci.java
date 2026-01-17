package Jan16And17.monthlyevidencepractice.javaprogrammingproblem;

import java.util.*;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you wanna check? ");
        int num = input.nextInt();
        
        List<Integer> list = new ArrayList<>();
        if (num < 1) System.out.println("Wrong input!");
        else{
        if (num >= 1) list.add(0);
        if (num >= 2) list.add(1);
        
        for (int i = 2; i < num; i++) {
            int nextNum = list.get(i - 1) + list.get(i - 2);
            list.add(nextNum);
        }  
        System.out.println("Fibonacci series up to " + num + " terms is " + list);
        }
        input.close();
    }
}
