package Jan08.QuestionCode;


interface AA{
    public void method1();
}
class One implements AA{

    @Override
    public void method1() {
        System.out.println("Class One method1");
    }
    
}
class Two implements AA{

    @Override
    public void method1() {
        System.out.println("Class Two method1");
    }
    
}
public class Test22 extends Two{
    public static void main(String[] args) {
        AA a = new Two();
        a.method1();
    }
}
