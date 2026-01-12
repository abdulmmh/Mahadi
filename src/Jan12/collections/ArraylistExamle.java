
package Jan12.collections;
import java.util.*;
/*
 * Create an ArrayList<Integer> and:
        * Add 10 integers
        * Print all elements using:
                >= for-each loop
                >= Iterator

        * Remove all even numbers
*/

public class ArraylistExamle {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();  
         for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
         // Printing value with For-each loop
        for (Integer list1 : list) {
            System.out.println(list1);
        }
        
        // Printing value with Iterator
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.println(next);
        }
        
        // Removing even value
        Iterator<Integer> iterator = list.iterator();
         for (; iterator.hasNext();) {
            Integer next = iterator.next();
             if (next % 2 == 0) {
                 iterator.remove();
             }     
        }
        
         for (Integer list1 : list) {
             System.out.println(list1);
        }
         
    }
}
