class MyClass {
    public int method1(int a) {
        return a+1;
    }
}

public class D4_Functions {

    static void myMethod() {
        System.out.println("Hello World");
    }

    static int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        myMethod();
        System.out.println(sum(1,2));

        MyClass obj1 = new MyClass();
        int a = obj1.method1(2);

    }
}