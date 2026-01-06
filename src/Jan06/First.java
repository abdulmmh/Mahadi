
package Jan06;

import java.util.ArrayList;
import java.util.List;


public class First extends Thread{
    public List firstMethod(){
        List l = new ArrayList();
        for (int i = 0; i < 5; i++) {
            l.add(i);
        }
        return l;
    }
}
