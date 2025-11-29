package filehandling;
import java.util.Scanner;
import java.io.File;
//12.Check file permissions (read, write, execute)?


public class Task12 {
    static Scanner sc = new Scanner(System.in);
     static void filePermission() {

         System.out.println("Enter file path:");
         String path = sc.nextLine();

         File fi = new File(path);

         if (fi.exists()) {
             System.out.println(" File exists");
         }else {
             System.out.println("File does not exists");
         }

         System.out.println("File Permissions to access:");
         System.out.println("Read a file: " +fi.canRead());
         System.out.println("Write a file: " +fi.canWrite());
         System.out.println("Execute a file: " +fi.canExecute());

     }


    public static void main(String[] args) {
         filePermission();
         sc.close();
        }

}
