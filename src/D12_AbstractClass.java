abstract class Animal1 {
    private String name;
    public Animal1(String name) {
        this.name = name;
    }
    public abstract void sound();
    public String getName() {
        return name;
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Dog Bark");
    }
}

class Cat extends Animal1 {
    public Cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println("Cat");
    }
}

public class D12_AbstractClass {
    public static void main(String[] args) {

        Dog1 obj = new Dog1("John");
        String name = obj.getName();
        System.out.println(name);

        Cat objCat = new Cat("Kitty");
        String name2 = objCat.getName();
        System.out.println(name2);

    }
}