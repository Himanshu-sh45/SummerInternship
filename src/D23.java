import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class D23 {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Hello World");
        runnable.run();

        Callable<String> callable = () -> "Hello World";

        try {
            String Result = callable.call();
            System.out.println(Result);
        }
        catch(Exception instance) {

        }
        Predicate<Integer> isEven = n -> n%2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));
    }
}