import java.util.*;
//Q1
// how to remove duplicate elements

public class D7_Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }

        int[] arrayWithoutDuplicates = new int[count];
        for(int k =0;k<count;k++) {
            arrayWithoutDuplicates[k]= temp[k];
        }
        System.out.println("Array without Duplicates: "+Arrays.toString(arrayWithoutDuplicates));
    }
}