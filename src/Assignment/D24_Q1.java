package Assignment;

import java.io.*;

public class D24_Q1 {
    public static void main(String[] args) throws IOException {

        StringReader stringReader = new StringReader("Hello, this is a test.");
        BufferedReader bufferedReader = new BufferedReader(stringReader);

        System.out.print((char) bufferedReader.read());
        bufferedReader.mark(10);

        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());
        System.out.print((char) bufferedReader.read());

        bufferedReader.reset();
        System.out.print((char) bufferedReader.read());

    }
}
