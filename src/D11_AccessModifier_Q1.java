// Access Modifiers

class BankAccount {
    private int privateVar;
    public BankAccount(int privateVar) {
        this.privateVar = privateVar;
    }
    public int getPrivateVar() {
        return privateVar;
    }
    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    public int publicVar = 10;
    protected int protectedVar = 12;
    int defaultVar = 13;

    public void publicMethod() {
        System.out.println("Public Method");
    }
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    void defaultMethod() {
        System.out.println("Default Method");
    }
}

public class D11_AccessModifier_Q1 {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(1);
        System.out.println(obj.getPrivateVar());

        obj.setPrivateVar(13);
        System.out.println(obj.getPrivateVar());

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();

        System.out.println(obj.publicVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);



    }
}