
package Jan13.collectionproblemsolving;
import java.util.*;
/*
* Create a List<String> of names.
    * Check if "Mahadi" exists
       * If yes, print its index
*/

public class SearchForElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Rahim");
        list.add("Rakib");
        list.add("Sotej");
        list.add("Mahadi");
        list.add("Tasrif");
        
        String contain = "Mahadi";
        for (String list1 : list) {
            if (list1.equalsIgnoreCase(contain)) {
                System.out.println("Index: "+ list.indexOf(list1));
                break;
            }else{
                continue;
            }
        }
    }
}
