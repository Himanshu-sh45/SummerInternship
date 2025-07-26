public class D4_HW_Q1 {

    public static int reverse(int n) {
        int rev=0;
        while(n>0) {
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int reverse = reverse(n);
        return n == reverse;
    }

    public static void main(String[] args) {
        int n = 12321;
        boolean ans = isPalindrome(n);
        System.out.println(ans);

    }
}