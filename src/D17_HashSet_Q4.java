import java.util.HashSet;

public class D17_HashSet_Q4 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.equals(set2));

    }
}