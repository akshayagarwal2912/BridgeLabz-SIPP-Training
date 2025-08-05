import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            // Attempt to read from the file
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            // Catch block for IOException (Checked Exception)
            System.out.println("File not found");
        }
    }
}
