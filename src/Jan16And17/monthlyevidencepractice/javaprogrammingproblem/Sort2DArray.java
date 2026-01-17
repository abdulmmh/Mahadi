package Jan16And17.monthlyevidencepractice.javaprogrammingproblem;

import java.util.*;


public class Sort2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 3, 2},{6, 5, 4},{8, 7, 9}};
        
        int cols = arr2D[0].length;
        int rows = arr2D.length;
        int[] arr = new int[cols * rows];
        
        int index = 0;
        for (int[] row : arr2D) {
            for (int value : row) {
               arr[index++] = value; 
            }
        }
        
        sort(arr);
        
        index = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = arr[index++]; 
            }
        }
        
        /*
        int[][] sorted2DArr = new int[rows][cols];
        for (int i = 0; i < sorted2DArr.length; i++) {
            for (int j = 0; j < sorted2DArr[i].length; j++) {
                sorted2DArr[i][j] = arr[index++];
            }
        }
        */
        System.out.println("Sorted Array: " + Arrays.deepToString(arr2D));
    }
    
    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
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
