import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File inputFile = new File("source.txt");
            if (!inputFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }
            fis = new FileInputStream(inputFile);
            fos = new FileOutputStream("destination.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}