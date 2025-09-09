import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("largefile.dat");
            FileOutputStream fos = new FileOutputStream("copy_unbuffered.dat");
            long start = System.nanoTime();
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            long end = System.nanoTime();
            System.out.println("Unbuffered copy time: " + (end - start) + " ns");
            fis.close();
            fos.close();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("largefile.dat"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy_buffered.dat"));
            start = System.nanoTime();
            byte[] buffer = new byte[4096];
            int length;
            while ((length = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, length);
            }
            end = System.nanoTime();
            System.out.println("Buffered copy time: " + (end - start) + " ns");
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}