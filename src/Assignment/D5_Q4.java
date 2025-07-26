package Assignment;

//Q4
// check the minimum value in an array.

public class D5_Q4 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        int min = arr[0];
        int minIndex = -1;
        for(int i=0;i<arr.length;i++) {
            if(min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("The minimum element in the array is "+min+" at index "+minIndex);

    }
}