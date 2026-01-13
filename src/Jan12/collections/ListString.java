
package Jan12.collections;
import java.util.*;

/*
* Given a List<String> with duplicate values:
* ["Java", "Python", "Java", "C", "Python"]
* Remove duplicates
* Maintain insertion order
*/
public class ListString {
    public static void main(String[] args) {
        List<String> pLang = new ArrayList<>();
        pLang.add("Java");
        pLang.add("Python");
        pLang.add("Java");
        pLang.add("C");
        pLang.add("Python");
        
        System.out.println(pLang);
        
        // Remove duplicates
        Set<String> set = new LinkedHashSet<>(pLang);
        pLang.clear();
        pLang.addAll(set);
        
        System.out.println(pLang);
         
    }
}
