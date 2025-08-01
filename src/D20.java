// Q1 How HashMap is differed from TreeMap.
// Q2 What is the purpose of first key and last key methods.
// Q3 What is the difference between put and putIfAbsent method.

// Assignment
// Suppose you need to store a map of employs ids , employ names, and you want to iterate over
// employ in sorted order. would you use a treemap and hashmap?

import java.util.HashMap;
import java.util.TreeMap;

public class D20 {
    public static void main(String[] args) {

//        Q2
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Banana", 2);
        treeMap.put("Apple", 5);
        treeMap.put("Cherry", 3);

        System.out.println("TreeMap: " + treeMap);

        String firstKey = treeMap.firstKey();
        String lastKey = treeMap.lastKey();

        System.out.println("First Key: " + firstKey);
        System.out.println("Last Key: " + lastKey);

//        Q3
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "Apple");
        map.put("a", "Avocado");

        map.putIfAbsent("b", "Banana");
        map.putIfAbsent("b", "Blueberry");

        System.out.println(map);


    }
}
