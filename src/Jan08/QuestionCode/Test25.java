package Jan08.QuestionCode;

class A2{
    static void method(){
        System.out.println("Class A method");
    }
}
class B2 extends A2{
    static void method(){
        System.out.println("Class B method");
    }
}
public class Test25 {
    public static void main(String[] args) {
        A2 a = new B2();
        a.method();
    }
}
