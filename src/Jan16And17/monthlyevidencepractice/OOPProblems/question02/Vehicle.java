package Jan16And17.monthlyevidencepractice.OOPProblems.question02;

public class Vehicle {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) throws SpeedIsNegative {
        if (speed < 0) {
            throw new SpeedIsNegative("Speed can't be negative");
        }
        else this.speed = speed;
    }
    
    
    public void vehicleRun(){
        System.out.println("Vehicle is running");
    } 
}

class Car extends Vehicle{

    @Override
    public void vehicleRun() {
        System.out.println("Car is running"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class SpeedIsNegative extends Exception{

    public SpeedIsNegative(String message) {
        super(message);
    }
    
}


class Main2{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.vehicleRun();
        
        Car c = new Car();
        c.vehicleRun();
        
        try {
            c.setSpeed(45.04);
            System.out.println("Current speed of car is : " + c.getSpeed());
            
            c.setSpeed(-78.07);
            System.out.println("Current speed of car is : " + c.getSpeed());
        } catch (SpeedIsNegative ex) {
            System.out.println(ex.getMessage());
        }  
    }
}