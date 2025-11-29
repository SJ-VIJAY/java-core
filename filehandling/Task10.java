package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//10.Ask three details to Merge Two Files into another single File?
public class Task10 {
    static Scanner sc = new Scanner(System.in);

  static void mergeDetails() throws IOException {
      System.out.println("Enter the path 1:");
      String path1 = sc.nextLine();
      System.out.println("Enter the path 2:");
      String path2 = sc.nextLine();
      System.out.println("Enter the path 3:");
      String path3 = sc.nextLine();

      FileReader fr = new FileReader(path1);
      FileReader fr1 = new FileReader(path2);
      FileWriter fw = new FileWriter(path3,true);

      int ch;
      while((ch=fr.read()) != -1){   // path 1
         fw.write(ch);
      }
      while((ch=fr1.read()) != -1){   // path 2
          fw.write(ch);
      }
       fr.close();
      fr1.close();
      fw.close();

      System.out.println("File merged successfully..");
  }

    public static void main(String[] args) throws IOException{
        mergeDetails();
        sc.close();
    }

}
