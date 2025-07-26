public class D5_CommandLine {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("usage: java commandLine <name> <age>");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("hello, "+ "! you are"+ age+" years oldz");
    }
}