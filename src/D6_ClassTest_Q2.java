import java.util.Arrays;

public class D6_ClassTest_Q2 {

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {43, 47, 56, 57, 60,2, 91};
        int target = 2;
        Arrays.sort(arr);
        reverseArray(arr);

        int index = Arrays.binarySearch(arr, target);
        System.out.println("Index of "+target+" is "+index);
    }
}