import java.util.ArrayList;

public class D19_ClassTest_Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int element : list) {
            if(min > element ) {
                min = element;
            }
        }
        System.out.println("Minimum element is: "+min);

        for(int element : list) {
            if(secondMin > element && element > min) {
                secondMin = element;
            }
        }
        System.out.println("Second Minimum element is: "+secondMin);
    }
}
