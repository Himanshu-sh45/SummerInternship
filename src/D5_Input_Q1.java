import java.util.Scanner;

public class D5_Input_Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of Student: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        System.out.print("Enter his Class: ");
        int Class = sc.nextInt();
        System.out.print("Enter Section: ");
        char Section = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter Address: ");
        String Address = sc.nextLine();

        System.out.println();

        System.out.println("Name of Student: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+marks);
        System.out.println("Class: "+Class);
        System.out.println("Section: "+Section);
        System.out.println("Address: "+Address);



    }
}