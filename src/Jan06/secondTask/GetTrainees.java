
package Jan06.secondTask;


import Jan06.secondTask.Address;
import java.util.HashMap;
import java.util.Map;


public class GetTrainees implements Trainees{
    @Override
    public Map<Integer, Trainee> getTrainees() {
        Map<Integer, Trainee> traineee = new HashMap<>();
        traineee.put(1, new Trainee(1001, new Address(1219, "Rampura")));
        traineee.put(2, new Trainee(1002, new Address(1246, "Mirpur")));
        traineee.put(3, new Trainee(1003, new Address(1209, "Paltan")));

        return traineee;
    }
    
    
    
    
}

 interface Trainees{
     Map<Integer, Trainee> getTrainees();
}