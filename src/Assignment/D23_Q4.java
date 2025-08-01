package Assignment;

import java.util.concurrent.Callable;

public class D23_Q4 {
    public static void main(String[] args) throws Exception {
        int x = 4;

        Callable<Integer> compute = () -> 3 * x * x + 2 * x + 5;

        int result = compute.call();

        System.out.println("Result of 3x^2 + 2x + 5 where x = " + x + " is: " + result);
    }
}
