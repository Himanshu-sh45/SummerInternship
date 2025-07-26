class MyClass2 {
    public int returnValue(int x) {
        return x;
    }
}

public class D4_Function_Q3 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        int value = obj.returnValue(2);
        System.out.println(value);
    }
}