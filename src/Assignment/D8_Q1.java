package Assignment;

// Q1
// Tail Recursion method

public class D8_Q1 {

    static void naturalNumber(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        naturalNumber(--n);
    }

    public static void main(String[] args) {
        naturalNumber(10);

    }
}