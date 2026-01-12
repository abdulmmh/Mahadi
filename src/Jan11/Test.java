
package Jan11;


public class Test extends Car{
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
//
//interface Car{
//    public static void run(){
//        System.out.println("Car is running.");
//    }
//}

class Car{
   Engine engine = new Engine();
    void run(){
        System.out.println("Car is running.");
    }
}

class Engine {
    void working(){
        System.out.println("Engine is working fine.");
    }
}