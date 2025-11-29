package filehandling;

import java.io.File;

import java.util.Scanner;

// 4.Ask path and filename then delete a file?
public class Task4 {
    static Scanner sc = new Scanner(System.in);

     static  void deleteFile() {
         System.out.println("Enter the path name: ");
         String path = sc.nextLine();
         File fi =new File(path);
        if(fi.exists()){
            fi.delete();
            System.out.println("File was deleted successfully");
        }
        else{
            System.out.println("File already deleted");
        }
     }
    public static void main(String[] args)  {

        deleteFile();
        sc.close();
     }

}
