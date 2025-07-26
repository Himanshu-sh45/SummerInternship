import java.util.Arrays;

public class D4_Arrays {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int []arr1 = new int[5];
        arr1[0] = 3;
        arr1[1] = 2;
        arr1[2] = 1;
        arr1[3] = 0;
        arr1[4] = -1;

        for(int i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }

        System.out.println(Arrays.toString(arr1));

        int index = Arrays.binarySearch(arr,3);
        System.out.println(index);

        int[] arr3 = new int[6];
        Arrays.fill(arr3, 12);
        System.out.println(Arrays.toString(arr3));

        int[] copy = Arrays.copyOf(arr1 , arr1.length-1 );
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.equals(arr1, copy));

        int[] copy2 = Arrays.copyOfRange(arr1,0,3);
        System.out.println(Arrays.toString(copy2));

        int[] arr4 = new int[5];
        Arrays.setAll(arr4,i-> i*2);
        System.out.println(Arrays.toString(arr4));

    }
}