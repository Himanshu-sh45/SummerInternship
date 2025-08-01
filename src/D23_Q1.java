import java.util.function.Predicate;

public class D23_Q1 {
    public static void main(String[] args) {
        int number = 12321;

        Predicate<Integer> isPalindrome = (Integer num) ->
                String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse().toString());

        System.out.println(isPalindrome.test(number));

    }
}
