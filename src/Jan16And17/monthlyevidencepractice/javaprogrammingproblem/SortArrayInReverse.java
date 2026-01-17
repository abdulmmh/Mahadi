package Jan16And17.monthlyevidencepractice.javaprogrammingproblem;

import java.util.Arrays;



public class SortArrayInReverse {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 0};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                }
            }
        }
    }
}
