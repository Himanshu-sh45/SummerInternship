abstract class Shape2 {
    public abstract double area();
}

class Circle2 extends Shape2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class D14_ClassTest2_Q2 {
    public static void main(String[] args) {
        Circle2 c = new Circle2(5.0);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.area());
    }
}
