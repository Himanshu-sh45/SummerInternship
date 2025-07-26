abstract class RBI {
//    int interestRate = 6;
//    public RBI(int interestRate) {
//        this.interestRate = interestRate;
//    }
    public abstract double getInterestRate();
}

class SBI extends RBI {
    public double getInterestRate() {
        return 6.5;
    }
}

class PNB extends RBI {
    public double getInterestRate() {
        return 6.75;
    }
}

public class D12_AbstractClass_Q1 {
    public static void main(String[] args) {
        SBI bank1 = new SBI();
        PNB bank2 = new PNB();

        System.out.println("SBI Interest Rate: " + bank1.getInterestRate() + "%");
        System.out.println("PNB Interest Rate: " + bank2.getInterestRate() + "%");
    }
}