// Q1
// reverse a string by making recursive function

public class D7_Recursion_Q1 {

    static String reverseString(String str) {
        if(str.isEmpty()) {
            return str;
        }
        else{
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
         String str = "Hello Beautiful";
         String strRev = reverseString(str);
         System.out.println(strRev);
         
    }
}