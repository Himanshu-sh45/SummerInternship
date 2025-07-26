class CollegeMember {
    String name;
    String id;

    void setDetails(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class President extends CollegeMember {
    void show() {
        System.out.println("I am a President.");
    }
}

class ViceChancellor extends CollegeMember {
    void show() {
        System.out.println("I am a Vice Chancellor.");
    }
}

class Dean extends CollegeMember {
    void show() {
        System.out.println("I am a Dean.");
    }
}

class ClassCoordinator extends CollegeMember {
    void show() {
        System.out.println("I am a Class Coordinator.");
    }
}

public class D14_ClassTest2_Q3 {
    public static void main(String[] args) {

        President p = new President();
        p.setDetails("Dr. A. P. J. Kalam", "P001");
        System.out.println("President Details:");
        p.showDetails();
        p.show();

        System.out.println();


        ViceChancellor vc = new ViceChancellor();
        vc.setDetails("Dr. S. Radhakrishnan", "VC001");
        System.out.println("Vice Chancellor Details:");
        vc.showDetails();
        vc.show();

        System.out.println();


        Dean d = new Dean();
        d.setDetails("Prof. Anshika Garg", "D001");
        System.out.println("Dean Details:");
        d.showDetails();
        d.show();

        System.out.println();

        ClassCoordinator c = new ClassCoordinator();
        c.setDetails("Prof. Sakib","C001");
        System.out.println("Class Coordinator details: ");
        c.showDetails();
        c.show();
    }
}
