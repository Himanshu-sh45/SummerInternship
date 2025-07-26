class MyClass1 {
    private int a;
    MyClass1() {
        a = 10;
    }
    MyClass1(int a) {
        this.a = a;
    }
    MyClass1( MyClass1 obj) {
        this.a = obj.a;
    }
    int getValue() {
        return a;
    }
}

public class D14_ClassTest_Q4 {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1();
        int x = obj1.getValue();
        System.out.println(x);

        MyClass1 obj2 = new MyClass1(2);
        int y = obj2.getValue();
        System.out.println(y);

        MyClass1 obj3 = new MyClass1(obj2);
        int z = obj3.getValue();
        System.out.println(z);

    }
}
