import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.text.FieldPosition;

public class D24___ {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("BinaryFile.bin")) {
            byte[] data = {1, 2, 3, 4, 5};
            fos.write(data);

        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
