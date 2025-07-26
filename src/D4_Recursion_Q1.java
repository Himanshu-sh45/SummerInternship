public class D4_Recursion_Q1 {

    public static int sumOfNaturalNumber(int n) {
        if(n==1) {
            return 1;
        }
        return n + sumOfNaturalNumber(n-1);
    }

    public static void main(String[] args) {
        int sum = sumOfNaturalNumber(5);
        System.out.println(sum);
    }
}