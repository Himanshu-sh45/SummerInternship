import java.util.HashSet;

public class D17_HashSet_Q6 {
    public static int countDistinct(int[] data) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : data) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] largeDataset = {1, 2, 3, 2, 1, 4, 5, 5, 6};
        System.out.println("Number of distinct elements: " + countDistinct(largeDataset));
    }
}
