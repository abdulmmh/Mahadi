class A5{
    public void printName(){
        System.out.println("Value-A");
    }
}
class B5 extends A5{
    public void printName(){
        System.out.println("Name-B");
    }
}
public class Test30 {
    public static void main(String[] args) {
        B5 b = new B5();
        b.printName();
    }
}
