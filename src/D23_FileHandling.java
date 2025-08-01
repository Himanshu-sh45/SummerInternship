import java.io.*;

//import java.util.Scanner;
//import java.io.File;
//import java.io.IOException;
//import java.io.FilterWriter;

//import java.io.FileReader;
//import java.io.BufferedReader;

public class D23_FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("Example.txt");
            if(file.createNewFile()) {
                System.out.println("file created: " + file.getName());
            }
            else {
                System.out.println("file is already existed.");
            }
        }
        catch(IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }

        String fileName = "example.txt";
        String content = "Hello Beautiful World";
        try(FileWriter writer = new FileWriter(fileName);) {
            writer.write(content);
            System.out.println("file created and write successfully");
        }
        catch(IOException e) {
            System.out.println("Error writing a file: " + e.getMessage());
//            File file1 = new File("example.txt");
//            if(file1.exists()) {
//                System.out.println("Already existed.");
//            }
//            else {
//                System.out.println("file doesn't exist but you can create it.");
            }

        try(FileReader reader = new FileReader(fileName)) {
            int character;
            System.out.println("file contents");
            while((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        }
        catch(IOException e) {
            System.out.println("Error reading file:"+ e.getMessage());
        }

        

    }
}