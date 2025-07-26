public class D6_ClassTest_Q4 {

    public static int sumEven(int count) {
        if (count == 0) {
            return 0;
        }
        return (2 * count) + sumEven(count - 1);
    }

    public static void main(String[] args) {
        int count = 5;
        int result = sumEven(count-1);
        System.out.println("Sum of first " + count + " even numbers is: " + result);
    }
}
