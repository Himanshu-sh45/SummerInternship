package Assignment;
import java.util.Arrays;
//Q6
// Java Array Program to add two matrices.

public class D5_Q6 {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{9,8,7},{6,5,4},{3,2,1}};

        for(int i=0;i<arr1.length;i++) {
            if(arr1.length != arr2.length) {
                System.out.println("Array must have equal dimension for addition.");
                return;
            }
            if(arr1[i].length != arr2[i].length) {
                System.out.println("Array must have equal dimension for addition.");
                return;
            }
        }

        int[][] addArr = new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++) {
            for(int j=0;j<arr1[i].length;j++) {
                addArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(addArr));
    }
}