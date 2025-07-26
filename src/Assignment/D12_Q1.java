package Assignment;

abstract class Car1 {

    abstract void start();
    abstract void accelerate();
    abstract void brake();

    public void displayInfo() {
        System.out.println("This is a car.");
    }
}

class HondaCar extends Car1 {

    @Override
    void start() {
        System.out.println("Honda car starting .");
    }

    @Override
    void accelerate() {
        System.out.println("Honda car is accelerating.");
    }

    @Override
    void brake() {
        System.out.println("Honda car is braking.");
    }

    void playMusic() {
        System.out.println("Playing music in Honda car.");
    }
}

public class D12_Q1 {
    public static void main(String[] args) {
        HondaCar myCar = new HondaCar();

        myCar.displayInfo();
        myCar.start();
        myCar.accelerate();
        myCar.brake();

        myCar.playMusic();
    }
}
