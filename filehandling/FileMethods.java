package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileMethods {

   static void  fileCreate()  {
     File fi = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1\\new2");
     // fi.mkdir();
     // fi.mkdirs();
       File f2 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1\\note.txt");
      // f2.createNewFile();
       File f3 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1\\note1.txt");

//       try {
//           if (f3.createNewFile()) {
//               System.out.println("File was created successfully");
//           }else{
//               System.out.println("File already exists");
//           }
//       }catch (Exception e){
//           System.out.println("exception: "+e);
//       }
       try {
           if (f3.delete()) {
               System.out.println("File delete successfully");
           }else{
               System.out.println("File already deleted");
           }
       }catch (Exception e){
           System.out.println("exception: "+e);
       }
   }
   static void readAndWrite(){
    File f4 = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1\\note.txt");
       System.out.println("Read files: "+f4.canRead()); //return boolean
       System.out.println("File write access: "+f4.canWrite());// return boolean
       System.out.println("File execution: "+f4.canExecute());
   }
   static void getMethods(){
       String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1\\note.txt";
       File f5 = new File(path);
       System.out.println("File name: "+f5.getName());
       System.out.println("File parent: "+f5.getParent());
       System.out.println("File path: "+f5.getPath());
       System.out.println("absolute file path: "+f5.getAbsoluteFile());
   }
   static  void someMethods(){
       String path1 = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1\\note.txt";
       File f6 = new File(path1);
       String[] s = f6.list();
       System.out.println("List return: "+Arrays.toString(s));
       File[] file = f6.listFiles();
       System.out.println(Arrays.toString(file));

       // is methods
       System.out.println("is file name: "+f6.isFile());

       String path2 = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 57 file class and methods\\new1";
       File f7 = new File(path2);

       System.out.println("Is Directory: "+f7.isDirectory());
       System.out.println(new Date(f7.lastModified()));

       File f8 = new File("Vijay");
       

   }

    public static void main(String[] args) throws IOException{
       // fileCreate();
       // readAndWrite();
        // getMethods();
        someMethods();




    }

}
