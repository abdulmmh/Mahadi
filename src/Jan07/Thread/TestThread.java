
package Jan07.Thread;


public class TestThread {
    public static void main(String[] args) {
        ThreadByClass tb = new ThreadByClass();
        
    }
    
}

class ThreadByClass extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
}

class ThreadByInterface implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi!");
        }
    }
    
}