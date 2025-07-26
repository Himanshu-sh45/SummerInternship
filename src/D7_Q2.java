import java.util.Arrays;
// Q2
// Rotate an Array

public class D7_Q2 {
    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void rotateArray(int[] arr, int rotation) {
        reverse(arr,0,arr.length-1);
        reverse(arr,0,rotation-1);
        reverse(arr,rotation,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotateArray(arr,2);
        System.out.println(Arrays.toString(arr));

    }
}