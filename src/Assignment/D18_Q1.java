package Assignment;

public class D18_Q1 {
    public static void main(String[] args) {
        int n=5;
        char c = 'A';
        for(int i=0;i<n;i++) {
            for(int j=n-i;j>1;j--) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print(c);
                if(c<'Z') {
                    c++;
                }
                else {
                    c='A';
                }
            }
            System.out.println();
        }



    }
}