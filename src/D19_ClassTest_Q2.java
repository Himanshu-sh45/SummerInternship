import java.util.ArrayList;
import java.util.HashSet;

public class D19_ClassTest_Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list);

        HashSet<Integer> set = new HashSet<>(list);

        list.clear();
        list.addAll(0,set);
        System.out.println(list);

    }
}
