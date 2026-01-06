
package Jan06.secondTask;

import Jan06.thirdTask.Trainee;
import Jan06.secondTask.Trainees;
import Jan06.secondTask.GetTrainees;
import java.util.HashMap;
import java.util.Map;


public class Test {
    public static void main(String[] args) {
        Trainees t = new GetTrainees();
        Map<Integer, Trainee> traineee = t.getTrainees();
        
        for (Map.Entry<Integer, Trainee> entry : traineee.entrySet()) {
            System.out.println("Key = " + entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
