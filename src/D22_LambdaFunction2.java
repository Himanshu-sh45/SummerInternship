@FunctionalInterface
interface MyInterface {
    public void sayHello();
}

@FunctionalInterface
interface Parent {
    public void sayHello();
}

// Default Methods -> In Java, a default method is a method defined in an interface that includes a body.
// Static Methods -> In Java, an abstract method is a  method defined in an interfaced that includes a body and
// cannot be overridden or changed in the implementation class.

@FunctionalInterface
interface Child extends Parent {
    default void sayBye() {
        System.out.println("Bye");
    }
    static void greet() {
        System.out.println("Good Morning.");
    }
}

class MyClass3 implements Child {
    public void sayHello() {
        System.out.println("Hello");
    }
}

public class D22_LambdaFunction2 {

    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.sayHello();
        obj.sayBye();
//        obj.greet();
//        cannot be accessed by instance.
//        MyClass3.greet();
//        cannot be accessed by implementing class.
        Child.greet();


    }
}