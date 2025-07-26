class copyConstructor {
    String name;
    int age;

    copyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    copyConstructor(copyConstructor car) {
        this.name = car.name;
        this.age = car.age;
    }

}


public class D8_CopyConstructor {
    public static void main(String[] args) {
        copyConstructor obj1 = new copyConstructor("Ford",4);

        copyConstructor obj2 = new copyConstructor(obj1);
        System.out.println(obj2.name);
        System.out.println(obj2.age);

    }
}
