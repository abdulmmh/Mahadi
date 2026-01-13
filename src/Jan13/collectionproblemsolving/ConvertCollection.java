
package Jan13.collectionproblemsolving;
import java.util.*;
/**
 *Convert an ArrayList<Integer> to:
 * Array
 * HashSet
 */
public class ConvertCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 100);
            list.add(num);
        }
        System.out.println("Given ArrayList: " + list);
        // convert into an array
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = list.get(i);
        }
        
        // convert into a hashset
        System.out.println("Converted into an array: "+ Arrays.toString(arr));
        
        Set<Integer> set = new HashSet<>(list);
        
        System.out.println("Converted into an Hashset: " + set);
        
    }
}
