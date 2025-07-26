class Himanshu {
    int x;
    void myMethod() {
        System.out.println("Hello World");
    }

    String name;
    int age;
    Himanshu(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Addition {
    int x,y;
    // constructor
    Addition(int x, int y) {
        this.x=x;
        this.y=y;
    }
    void sum() {
        System.out.println(x+y);
    }
}

public class D8_OOPS {
    public static void main(String[] args) {
        Himanshu myObj = new Himanshu("Himanshu",21);
        myObj.x = 12;
        System.out.println(myObj.x);
        myObj.myMethod();
        System.out.println(myObj.name);
        System.out.println(myObj.age);

        Addition myObj1 = new Addition(5,5);
        myObj1.sum();

    }
}