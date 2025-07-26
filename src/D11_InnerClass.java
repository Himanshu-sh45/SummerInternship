class Outer {
    int x=5;
    static int y =4;
    class Inner {
        void show() {
            System.out.println(x);
        }
    }
    static class Inner2 {
        void show2() {
            System.out.println(y);
        }
    }
}

public class D11_InnerClass {
    public static void main(String[] args) {

        Outer objOuter = new Outer();
        System.out.println(objOuter.x);

        Outer.Inner objInner = objOuter.new Inner();
        objInner.show();

        Outer.Inner2 objInner2 = new Outer.Inner2();
        objInner2.show2();


    }
}