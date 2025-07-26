package Assignment;

//Q1
// Check the largest Element in the array.

public class D5_Q1 {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,6,-1,-2};
        int largestElement = arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++) {
            if(largestElement < arr[i]) {
                largestElement = arr[i];
                index=i;
            }
        }
        System.out.println("Largest Element is: "+largestElement+" at index: "+index);
    }
}