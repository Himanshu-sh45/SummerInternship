// second largest element

public class D6_Q2 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,5};
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(largestElement < arr[i]) {
                largestElement = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++) {
            if(secondLargestElement < arr[i]) {
                if(arr[i] == largestElement) {
                    continue;
                }
                secondLargestElement = arr[i];
            }
        }

        System.out.println("Second Largest Element is: "+ secondLargestElement);
    }
}