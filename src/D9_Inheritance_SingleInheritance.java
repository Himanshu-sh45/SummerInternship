class utuUniversity {
    int feeStructure = 55000 ;
}
class shivalik extends utuUniversity {
    int x = 45;
}

public class D9_Inheritance_SingleInheritance {
    public static void main(String[] args) {

        utuUniversity u1 = new utuUniversity();
        System.out.println(u1.feeStructure);

        shivalik s1 = new shivalik();
        System.out.println(s1.feeStructure);
        System.out.println(s1.x);

    }
}