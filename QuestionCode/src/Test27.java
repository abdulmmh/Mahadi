class A3{
    int i = 10;
    public void printValue(){
        System.out.println("Value-A");
    }
}
class B3 extends A3{
    int i = 12;
    public void printValue(){
        System.out.println("Value-B");
    }
}
public class Test27 {
    public static void main(String[] args) {
        A3 a = new B3();
        a.printValue();
        System.out.println(a.i);
    }
}
