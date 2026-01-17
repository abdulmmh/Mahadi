
package Jan16And17.classpractice;
import java.util.Arrays;

public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{45, 34, 5}, {23, 54, 39}, {12, 7, 89}};
        System.out.println("Given Array: " + Arrays.deepToString(arr2D));
     
        for (int i = 0; i < arr2D.length; i++) {
            sorting2DArrayElement(arr2D[i]);
        }
        
        System.out.println("Sorted Array: " + Arrays.deepToString(arr2D));
       
    }
    
    static void sorting2DArrayElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
