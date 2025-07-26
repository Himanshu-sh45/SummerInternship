public class D2_Conditional_Q3 {
    public static void main(String[] args) {
        int marks = 70;
        if(marks>=90 && marks <=100){
            System.out.println("Excellent");
        }
        else if (marks>=80 && marks<90 ) {
            System.out.println("Very Good");
        }
        else if(marks>=70 && marks<80) {
            System.out.println("Good");
        }
        else if(marks>=60 && marks<70) {
            System.out.println("Average");
        }
        else if(marks>=33 && marks<60) {
            System.out.println("Below Average");
        }
        else {
            System.out.println("Fail");
        }
    }
}