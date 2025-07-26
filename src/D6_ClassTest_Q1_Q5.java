public class D6_ClassTest_Q1_Q5 {
    public static void main(String[] args) {

        // Question 1
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        for(int i=0;i<arr.length;i++) {
            if(target == arr[i]) {
                System.out.println("Yes array contains target element.");
                break;
            }
        }

        // Question 5
        // Print the table of 7.

        int n=7;
        for(int i=1;i<=10;i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }



    }
}