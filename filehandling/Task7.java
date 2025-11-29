package filehandling;

import java.io.FileWriter;

import java.util.Scanner;

//7.Ask file path and update (append text to a file) the user given String?
public class Task7 {
   static  Scanner sc = new Scanner(System.in);

   static void filePath() {
       System.out.println("Enter the File Path: ");
       String path = sc.nextLine();
       System.out.println("Enter text to append: ");
       String str =sc.nextLine();
try {
    FileWriter fi = new FileWriter(path,true);
    fi.write("\n"+str);
    fi.flush();
    System.out.println("Given text appended successfully");
}
catch (Exception e){
    System.out.println(e+"");
}
   }

    public static void main(String[] args) {
        filePath();
        sc.close();
    }
}
