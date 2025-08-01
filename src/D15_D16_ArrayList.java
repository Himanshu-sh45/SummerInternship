import java.util.ArrayList;

public class D15_D16_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(11);
        l1.add(12);
        l1.add(13);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.addAll(0,l1);

        for(int element : l1) {
            System.out.println(element);
        }

        System.out.println();

        for(int element: l2) {
            System.out.println(element);
        }

        System.out.println(l1.get(1));


    }
}