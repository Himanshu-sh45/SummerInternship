package Assignment;

//Q4
//Check the string is palindrome or not.

public class D6_Q4 {

    static boolean isPalindrome(String str) {
        int start =0;
        int end = str.length()-1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "MALAYALAM";
        boolean flag = isPalindrome(str);
        if(flag) {
            System.out.println(str+" is a Palindrome.");
        }
        else {
            System.out.println(str+" is not a Palindrome.");
        }
    }
}