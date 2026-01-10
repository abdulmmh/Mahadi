package Jan08.QuestionCode;

class Base{

    int value = 0;
    public Base() {
        addValue();
        // Even inside a parent constructor, overridden methods are called from the child class.
    }
    
    void addValue(){
        value += 10;
    }
    
    int getValue(){
        return value;
    }
}

class Derived extends Base{

    public Derived() {
        addValue();
    }
    void addValue(){
        value += 20;
    }
}
public class Test24 {
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println(b.getValue());
    }
}
