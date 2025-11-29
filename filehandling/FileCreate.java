package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {

    static void fileWrite() throws IOException{
        FileWriter fw = new FileWriter("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\new\\some.txt");
        fw.write("java is the programming language");
        fw.close();  // because we want to close resource
        //fw.flush();
    }
    static void fileReader() throws IOException{
        FileReader fr = new   FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\new\\some.txt");
        int c;
        while((c=fr.read())!=-1) {
         char a =(char) c;
         System.out.print(a);
        }


    }

    static void file() throws IOException {
        File f = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\new");
        f.mkdir();
        File f1 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\new\\some.txt");
        f1.createNewFile();
        File f2 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 56 file handling\\new\\image1.jpg");
        f2.createNewFile();

    }


    public static void main(String[] args) throws IOException {
        file();
        fileWrite();
        fileReader();
    }
}
