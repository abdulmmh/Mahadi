
package Jan06.firstTask;


public class ExceptionPropagation {
    public static void main(String[] args) {
        int[] obj = new int[3];
        obj[0] = 1;
        obj[1] = 0;
        try {
            System.out.println(obj[4]);
             
            
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("Array index should be within three");
        } 
        
        try {
            int a = obj[0] / obj[1];
            System.out.println(a);
        }
        catch (ArithmeticException ae) {
            System.out.println("");
//            ae.printStackTrace();
            System.out.println("Integer cannot be divide by 0");
        }
        
        try {
            String s = null; 
            System.out.println(s.length());
        }
        catch(NullPointerException ne) {
            System.out.println("");            
//            ne.printStackTrace();
            System.out.println("You cannot print a String's length  object when its value is null");
        }
        finally{
            System.out.println("");            
            System.out.println("Exception caught successfully.");
        }
    }
}
