
public class Test20 {
    public void display(int x, double y){
        System.out.println(x + y);
    }
    public double display(int p, double q){
        return p + q;
    }
    public static void main(String args[]) {
        Test20 test = new Test20();
        test.display(4, 5.0);
        System.out.println(test.display(4, 5.0));
    }
}
