import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D24 {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Hello, " + name + "!" );
        }
        catch(Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }


    }
}