interface Shape {
    double area();
    double parameter();
//    default void printDetails() {
//        System.out.println("Shape Details: ");
//    }
}

interface Details {
    default void printDetails() {
        System.out.println("Shape Details: ");
    }
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI*radius*radius;
    }
    public double parameter() {
        return 2*Math.PI*radius;
    }
}

class Rectangle implements Shape {
    private double length,breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
    public double parameter() {
        return 2*(length + breadth);
    }
}

class Square implements Shape, Details {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double area() {
        return side*side;
    }
    public double parameter() {
        return 4*side;
    }
}

public class D13_Interface {
    public static void main(String[] args) {

        Circle objCircle = new Circle(1);
        double area = objCircle.area();
        double parameter = objCircle.parameter();
        System.out.println("Area and Parameter of circle are: "+area+" and "+parameter+" .");

        Rectangle objRectangle = new Rectangle(4,3);
        double areaRectangle = objRectangle.area();
        double parameterRectangle = objRectangle.parameter();
        System.out.println("Area and Parameter of Rectangle are: "+areaRectangle+" and "+parameterRectangle+" .");

        Square objSquare = new Square(1);
        double areaSquare = objSquare.area();
        double parameterSquare = objSquare.parameter();
        System.out.println("Area and Parameter of Square are: "+areaSquare+" and "+parameterSquare+" .");
        objSquare.printDetails();

    }
}