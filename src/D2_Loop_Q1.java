public class D2_Loop_Q1 {
    public static void main(String[] args) {
        int a =5;
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        System.out.println("Factorial: "+factorial);
    }
}