package Jan16And17.monthlyevidencepractice.OOPProblems.question08;


public class Parent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public void showMessage(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    public void showChildMessage(){
        System.out.println("This is child class");
    }
}

class Main1{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.showMessage();
        
        Child c = new Child();
        c.showChildMessage();
        c.showMessage();
        
    }
}