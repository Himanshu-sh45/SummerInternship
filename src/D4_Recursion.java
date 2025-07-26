public class D4_Recursion {

    public static int factorial(int a){
        if(a==0) {
            return 1;
        }
        return a*factorial(a-1);
    }

    public static void main(String[] args) {
        int fact = factorial(4);
        System.out.println(fact);


    }
}