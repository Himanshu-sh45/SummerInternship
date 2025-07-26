package Assignment;
import java.util.Arrays;
//Q2
// Create a Matrix 4*3

public class D5_Q2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        arr[0][0]=0;
        arr[0][1]=1;
        arr[0][2]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        arr[1][2]=5;
        arr[2][0]=6;
        arr[2][1]=7;
        arr[2][2]=8;
        arr[3][0]=9;
        arr[3][1]=10;
        arr[3][2]=11;

        System.out.println(Arrays.deepToString(arr));

    }
}
