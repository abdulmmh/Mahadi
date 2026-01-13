
package Jan13.collectionproblemsolving;
import java.util.*;
/**
 * Given a list:
 * [1, 2, 2, 3, 3, 3, 4]
 * Count the frequency of each element using HashMap
 */

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0,j = 65; i < arr.length; i++, j++) {
            char ch = (char) j ;
            map.put(ch, arr[i]);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
            Character key = entrySet.getKey();
            Integer value = entrySet.getValue();
             if (map.containsValue(value)) {
                    count++;
                }
            
        }
        System.out.println(count);
    }
}
