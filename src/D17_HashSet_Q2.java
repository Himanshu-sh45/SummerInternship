import java.util.HashSet;

public class D17_HashSet_Q2 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        HashSet<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println("Difference (set1 - set2): " + difference);
    }
}
