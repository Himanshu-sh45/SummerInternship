import java.util.ArrayList;
import java.util.Iterator;

public class D18_Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);

        Iterator<Integer> itera = list.iterator();

        while(itera.hasNext()) {
            int number = itera.next();
            System.out.println(number);
        }

    }
}