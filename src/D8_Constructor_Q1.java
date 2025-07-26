class Car {
    String modelName;
    int modelYear;
    String color;
    int average;

    Car(String modelName, int modelYear, String color, int average) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.average = average;
    }

    Car() {
        this.modelName = "Creta";
        this.modelYear = 2024;
        this.color = "White";
        this.average = 13;
    }
}


public class D8_Constructor_Q1 {
    public static void main(String[] args) {
        Car scorpioN = new Car("ScorpioN", 2025,"black",8);
        System.out.println(scorpioN.modelName);
        System.out.println(scorpioN.modelYear);
        System.out.println(scorpioN.color);
        System.out.println(scorpioN.average);

        System.out.println();

        Car creta = new Car();
        System.out.println(creta.modelName);
        System.out.println(creta.modelYear);
        System.out.println(creta.color);
        System.out.println(creta.average);

    }
}