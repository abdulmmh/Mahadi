class A4{
    public  void printValue(){
        System.out.println("Value-A");
    }
}
class B4 extends A4{
    public void printName(){
        System.out.println("Name-B");
    }
}
class C extends A4{
    public void printName(){
        System.out.println("Name-C");
    }
}

public class Test29 {
    public static void main(String[] args) {
        B4 b = new B4();
        C c = new C();
        newPrint(b);
        newPrint(c);
    }
    public static void newPrint(A4 a){
        a.printValue();
    }
}
