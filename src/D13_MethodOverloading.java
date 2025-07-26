class Shape1 {
    void area(float r) {
        System.out.println("Area of Circle is: "+Math.PI*r*r);
    }
    void area(int s) {
        System.out.println("Area of Square is: "+s*s);
    }
    void area(int l, int b) {
        System.out.println("Area of Rectangle is: "+l*b);
    }
    void area(int h, int a, int b) {
        System.out.println("Area of Trapezium is: "+0.5*(a+b)*h);
    }
}

public class D13_MethodOverloading {
    public static void main(String[] args) {
        Shape1 obj = new Shape1();
        obj.area(1f);
        obj.area(2);
        obj.area(3,4);
        obj.area(2,3,3);


    }
}