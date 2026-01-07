
package Jan06.secondTask;

import Jan06.secondTask.Trainees;
import Jan06.secondTask.GetTrainees;
import java.util.HashMap;
import java.util.Map;


public class Test {
    public static void main(String[] args) {
        Trainees t = new GetTrainees();
        Map<Integer, Trainee> traineee = t.getTrainees();
        
        System.out.println(traineee.toString());

    }
}
