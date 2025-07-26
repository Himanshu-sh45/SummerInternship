public class D3_Strings_Q1 {
    public static void main(String[] args) {

        String str  = "Prakash";
        // Method 1
        String strRev = "";
        for(int i=str.length()-1;i>=0;i--){
            strRev += str.charAt(i);
        }
        System.out.println(strRev);

        // Method 2 (Using StringBuilder)
        StringBuilder strRev2 = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--) {
            strRev2.append(str.charAt(i));
        }
        System.out.println(strRev2);

    }
}