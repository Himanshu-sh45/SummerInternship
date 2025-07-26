public class D2_Conditional_Q5 {
    public static void main(String[] args) {
                int ayush = 21;
                int mudit = 19;
                int shahroz = 22;
                int ankit = 20;

                // Find the oldest
                if (ayush >= mudit && ayush >= shahroz && ayush >= ankit) {
                    System.out.println("Ayush is the oldest.");
                } else if (mudit >= ayush && mudit >= shahroz && mudit >= ankit) {
                    System.out.println("Mudit is the oldest.");
                } else if (shahroz >= ayush && shahroz >= mudit && shahroz >= ankit) {
                    System.out.println("Shahroz is the oldest.");
                } else {
                    System.out.println("Ankit is the oldest.");
                }

                // Find the youngest
                if (ayush <= mudit && ayush <= shahroz && ayush <= ankit) {
                    System.out.println("Ayush is the youngest.");
                } else if (mudit <= ayush && mudit <= shahroz && mudit <= ankit) {
                    System.out.println("Mudit is the youngest.");
                } else if (shahroz <= ayush && shahroz <= mudit && shahroz <= ankit) {
                    System.out.println("Shahroz is the youngest.");
                } else {
                    System.out.println("Ankit is the youngest.");
                }
    }
}