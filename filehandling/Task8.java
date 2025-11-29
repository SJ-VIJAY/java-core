package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 8.Ask both paths to copy text from one file to another?
public class Task8 {
   static Scanner sc = new Scanner(System.in);

   static void copyFile() throws IOException  {
       System.out.println("Enter the copy file path:");
       String path =sc.nextLine();
       System.out.println("Enter the paste file path:");
       String path1 =sc.nextLine();

     FileReader fr = new FileReader(path);
     FileWriter fw = new FileWriter(path1);


         int ch;
         while ((ch = fr.read()) != -1) {
             fw.write(ch);
         }
         fr.close();
         fw.close();
         System.out.println("File text copy successFull..");

   }

    public static void main(String[] args) throws IOException {
        copyFile();
        sc.close();
    }
}
