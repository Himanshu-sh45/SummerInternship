abstract class Library {
    abstract void addBook(String book, String bookID, String date);
    abstract void issueBook(String book, String bookID, String date);
    abstract void returnBook(String book, String bookID, String date);
}

class MyLibrary extends Library {

    @Override
    void addBook(String book, String bookID, String date) {
        System.out.println("Adding "+book+" book.\n"+"Book ID: "+bookID+"\nDate: "+date);
        System.out.println();
    }

    @Override
    void issueBook(String book, String bookID, String date) {
        System.out.println("Issuing "+book+" book.\n"+"Book ID: "+bookID+"\nDate: "+date);
        System.out.println();
    }

    @Override
    void returnBook(String book, String bookID, String date) {
        System.out.println("Returning "+book+" book.\n"+"Book ID: "+bookID+"\nDate: "+date);
        System.out.println();
    }
}

public class D14_ClassTest2_Q1 {
    public static void main(String[] args) {
        MyLibrary lib = new MyLibrary();
        lib.addBook("Physics","P123","01-July-2025");
        lib.issueBook("Chemistry","C230","05-July-2025");
        lib.returnBook("Mathematics","M987","15-July-2025");

    }
}

