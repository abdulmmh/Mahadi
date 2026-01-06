
package Jan06.thirdTask;

import java.util.ArrayList;
import java.util.List;


public class Second implements Runnable{
    public List secondMethod(){
        List k = new ArrayList();
        for (int i = 0; i < 5; i++) {
            k.add("Hi!");
        }
        return k;
    }

    @Override
    public void run() {
       
    }
}
