class Animal {
    String name = "Animal";

    void eat() {
        System.out.println(name + " is eating...");
    }
}

class Dog extends Animal {
    String breed = "Dog";

    void bark() {
        System.out.println(breed + " is barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}

public class D10_MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
