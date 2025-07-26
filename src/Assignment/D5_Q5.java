package Assignment;

import java.util.Arrays;
//Q5
//Compare 2D array if they are equal or not.

public class D5_Q5 {
    static boolean are2DArrayEqual(int[][] arr1, int[][] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i].length != arr2[i].length) {
                return false;
            }
            for(int j=0;j<arr1[i].length;j++) {
                if(arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        // method 1
        boolean isEqual = Arrays.deepEquals(arr1, arr2);
        System.out.println("Arrays are equal: "+isEqual);

        //method2
        boolean isEqual2 = are2DArrayEqual(arr1,arr2);
        System.out.println("Arrays are equal: "+isEqual2);

    }
}