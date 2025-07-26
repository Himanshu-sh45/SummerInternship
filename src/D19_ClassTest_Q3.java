import java.util.ArrayList;

public class D19_ClassTest_Q3 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Guava");
        fruit.add("Pineapple");
        fruit.add("Pear");
        fruit.add(null);

        System.out.println(fruit);

        fruit.set(1,"Banana");
        System.out.println(fruit);

        fruit.remove("Pear");
        System.out.println(fruit);

        if(fruit.contains("Guava")) {
            System.out.println("fruits contains required element.");
        }

        if(fruit.contains(null)) {
            System.out.println("fruits contains null.");
        }

    }
}