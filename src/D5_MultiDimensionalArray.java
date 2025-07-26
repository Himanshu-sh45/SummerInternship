import java.util.Arrays;

public class D5_MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ;
        System.out.println(Arrays.deepToString(arr));

        // method 2 to initialize a 2D Array.
        int[][] arr2 = new int[3][3];
        arr2[0][0] = 11;
        arr2[0][1] = 21;
        arr2[0][2] = 31;
        arr2[1][0] = 41;
        arr2[1][1] = 51;
        arr2[1][2] = 61;
        arr2[2][0] = 71;
        arr2[2][1] = 81;
        arr2[2][2] = 91;
        System.out.println(Arrays.deepToString(arr2));

        int a = arr2[0][2];
        System.out.println(a);

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        String[][] arr3 = {{"Shahroz", "Aman", "Ankit"},{"Aayush", "Himanshu", "Vineet"}};
        System.out.println(Arrays.deepToString(arr3));

    }
}