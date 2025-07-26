package Assignment;

// Q5
// Give an integer n return True if it is a power of 2.

public class D8_Q5 {

//    static boolean powerOf2(int n) {
//        if(n==1) {
//            return true;
//        }
//        return powerOf2(n/2);
//    }

    static boolean powerOf2(int n,int p) {
        if(n==p) {
            return true;
        }
        return powerOf2(n,p*2);
    }

    public static void main(String[] args) {
        int n = 128;
        System.out.println(n+" is power of 2: "+powerOf2(n,1));

    }
}