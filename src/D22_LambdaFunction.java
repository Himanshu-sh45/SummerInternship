@FunctionalInterface
interface MathOperations {
    int operation(int a,int b);
}

interface AdvancedOperation extends MathOperations {
    default void printResult(int results) {
        System.out.println("result: "+results);
    }
}

public class D22_LambdaFunction {

    public static void main(String[] args) {

        AdvancedOperation addition = (a, b) -> a + b;

        int result = addition.operation(10, 5);
        addition.printResult(result);
    }
}