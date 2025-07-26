// Average of an Array

public class D6_Q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum=0;
        for( int number : arr ) {
            sum+=number;
        }
        double average = (double)sum/arr.length;
        System.out.println("Average : "+average);

    }
}