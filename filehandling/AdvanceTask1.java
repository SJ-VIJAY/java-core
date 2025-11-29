package filehandling;

import java.io.File;
import java.util.Scanner;

//1.Ask File path to delete a file like : image / video / doc / pdf / txt etc...
public class AdvanceTask1 {
   static Scanner sc = new Scanner(System.in);

   static void deleteFile() {
      System.out.println("Enter the file path:");
      String path = sc.nextLine();
      File fi = new File(path);
      if (fi.exists() && fi.isFile()) {
         System.out.println("File found..File name is: "+fi.getName());
         System.out.println("Are you sure to delete a file ?? (yes/no): ");
         String select = sc.nextLine();
         if(select.equalsIgnoreCase("yes")) {
            if (fi.delete()) {
               System.out.println("File delete was successfully done.");
            }
            else{
                  System.out.println("File found but delete failed");
               }

         } else {
         System.out.println("File delete was canceled...");
      }

      } else {
         System.out.println("Enter the correct path");
      }
   }


   public static void main(String[] args) {
      deleteFile();

   }
}
