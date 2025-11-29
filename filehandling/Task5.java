package filehandling;

import java.io.File;
import java.util.Scanner;

// 5.Ask filename and return the file details (name, path, size, permissions)?
public class Task5 {
   static Scanner sc = new Scanner(System.in);

   static void fileName(){
       System.out.println("Enter file path and name: ");
       String path = sc.nextLine();
       File fi = new File(path);
       if (fi.exists()){
           System.out.println("File Name: "+fi.getName());
           System.out.println("File Path: "+fi.getPath());
           System.out.println("File size: "+fi.length());
           System.out.println("Read + write: "+fi.canRead()+" "+fi.canWrite());
       }
       else{
           System.out.println("Enter the correct file name");
       }

   }

    public static void main(String[] args) {
        fileName();
        sc.close();
    }

}
