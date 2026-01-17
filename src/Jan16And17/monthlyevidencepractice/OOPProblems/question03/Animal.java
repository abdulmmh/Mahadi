package Jan16And17.monthlyevidencepractice.OOPProblems.question03;

class Animal {
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
   private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeCantBeNegative{
        if (age < 0) {
            throw new AgeCantBeNegative("Age can't be negative.");
        } else {
             this.age = age;
        }
    }
   
   
    @Override
    void sound() {
        System.out.println("Dog barks"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class AgeCantBeNegative extends Exception{

    public AgeCantBeNegative(String message) {
        super(message);
    }
    
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        
        try {
            dog.setAge(7); 
            System.out.println("Dog age is " + dog.getAge());
            
            dog.setAge(-2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}