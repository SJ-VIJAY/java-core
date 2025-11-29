package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) {

         copyFile();
    }
        static void copyFile(){
            String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\vi.txt";
            String path1 = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\vi2.txt";
            try {
                FileInputStream fi = new FileInputStream(path);
                FileOutputStream fo = new FileOutputStream(path1);
               int data;
                while ((data = fi.read())!=-1) {
                    fo.write(data);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);

            }finally {
                System.out.println("File copy is successful");
            }
        }

}
