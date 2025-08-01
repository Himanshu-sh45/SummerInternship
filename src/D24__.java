import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D24__ {
    public static void main(String[] args) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully to Output.txt.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}