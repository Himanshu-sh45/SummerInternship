import java.util.LinkedList;

class CustomHashSet {

    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private LinkedList<String>[] buckets;
    private int size;

    public CustomHashSet() {
        buckets = new LinkedList[INITIAL_CAPACITY];
        size = 0;
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public boolean add(String key) {
        if (contains(key)) return false;

        if ((double)(size + 1) / buckets.length > LOAD_FACTOR) {
            resize();
        }

        int index = getIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        buckets[index].add(key);
        size++;
        return true;
    }

    public boolean remove(String key) {
        int index = getIndex(key);
        LinkedList<String> bucket = buckets[index];

        if (bucket != null && bucket.remove(key)) {
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(String key) {
        int index = getIndex(key);
        LinkedList<String> bucket = buckets[index];
        return bucket != null && bucket.contains(key);
    }

    public int size() {
        return size;
    }

    private void resize() {
        LinkedList<String>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];
        size = 0;

        for (LinkedList<String> bucket : oldBuckets) {
            if (bucket != null) {
                for (String key : bucket) {
                    add(key); // rehash
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (buckets[i] != null) {
                for (String key : buckets[i]) {
                    System.out.print(key + " ");
                }
            }
            System.out.println();
        }
    }
}

public class D17_HashSet_Q5 {
    public static void main(String[] args) {
        CustomHashSet mySet = new CustomHashSet();

        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");

        System.out.println("Contains 'banana'? " + mySet.contains("banana"));  // true
        System.out.println("Contains 'grape'? " + mySet.contains("grape"));    // false

        mySet.remove("banana");

        System.out.println("Contains 'banana' after removal? " + mySet.contains("banana"));  // false
        System.out.println("Size: " + mySet.size());

        mySet.print();  // Optional
    }
}