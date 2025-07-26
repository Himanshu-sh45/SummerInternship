import java.util.LinkedList;

// linked list is a connected through node to node and store as  separate objects
// advantages ->
// 1- dynamic memory allocation
// 2-> efficient insertion and deletion -> elements can be inserted or deleted from any position
// disadvantages ->
// 1-> more memory is required to store the pointer between elements
// 2-> accessing an element in the middle of the list that can be slower than in an array.

public class D19_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        list.add(1,45);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

    }
}