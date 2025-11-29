package filehandling;

import java.io.*;

class Employee1 implements Serializable{
    String name;
    int id;
    String company;

    public Employee1(String name,int id,String company){
        this.name = name;
        this.id = id;
        this.company = company;

    }
     public  void details(){
         System.out.println("Employee name: "+name);
         System.out.println("Employee id: "+id);
         System.out.println("Employee company: "+company);
     }
}

public class Serial {

   private static void serial() {
       try {
           String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 58 file handle data stream object stream\\vijay\\1.txt";
           FileOutputStream fos = new FileOutputStream(path);
           ObjectOutputStream oos = new ObjectOutputStream(fos);

           Employee1 e1 = new Employee1("Will Smith",1001,"Wipro");
           Employee1 e2 = new Employee1("Jason Smith",1002,"Flex");
           oos.writeObject(e1);
           oos.writeObject(e2);

           System.out.println("Object write was successfully done.. ");

       } catch (Exception e) {
           System.out.println(e);
       }
   }
    private static void deSerial() {
        try {
            String path = "C:\\Users\\Admin\\OneDrive\\Desktop\\Java\\Jul\\Day 58 file handle data stream object stream\\vijay\\1.txt";
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois= new ObjectInputStream(fis);

            Employee1 e1 =  (Employee1) ois.readObject();
            Employee1 e2 =  (Employee1) ois.readObject();
            System.out.println("Object read was successfully done.. ");

            System.out.println("Employee 1 details....:");
            e1.details();
            System.out.println("\n");
            System.out.println("Employee 2 details....:");
            e2.details();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       // serial();
        //deSerial();


    }
}
