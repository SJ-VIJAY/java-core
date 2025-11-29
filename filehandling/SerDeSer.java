package filehandling;

import java.io.*;
import java.util.Scanner;


class Employee implements Serializable {
    int eid;
    String ename;
    String eroll;
    double esalary;

    public Employee(int eid, String ename, String eroll, double esalary) {
        this.eid = eid;
        this.ename = ename;
        this.eroll = eroll;
        this.esalary = esalary;
    }

    public void details() {
        System.out.println("Employee Details : ");
        System.out.println("Employee id : " + eid);
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Department : " + eroll);
        System.out.println("Employee Salary : " + esalary);
    }
}

class Student implements Serializable {
    int eid;
    String ename;

    public Student(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public void details() {
        System.out.println("Student Details : ");
        System.out.println("Student id : " + eid);
        System.out.println("Student Name : " + ename);
    }
}

public class SerDeSer {
    /*
    Streams
    CharacterStream - read or write a text
    FileWriter, FileReader, BufferedWriter, BufferedReader
    ByteStream -  read or write a byte
    FileInputStream, FileOutputStream
    DataStream - read or write Primitive data
    ObjectStream - read or write Object based
    ObjectInputStream, ObjectOutputStream
     */
    /*
    File Class(till java7) -> Path interface(advance after java7 )
    FileReader, FileWriter
    BufferedReader, BufferedWriter
    FileInputStream, FileOutputStream
    DataInputStream, DataOutputStream
    ObjectInputStream, ObjectOutputStream
    PrintWriter
     */
    public static void main(String[] args) {
  /*
        Serialization :
        It is the process of converting Object states into Byte Stream.

        DeSerialization :
        It is the process of converting Byte Stream into Object states(Java Object).
         */
       ser();
//        deser();
//        serDeser();
//        serDeser2();
//        SerDeSer obj = new SerDeSer();
//        obj.test();

//        try PrintWriter
//        PrintWriter pw = new PrintWriter();
//        pw.println(200);
//        pw.print(200);
//        pw.print(true);
    }

    private void test() {
        Class c1 = this.getClass();
        String c2 = this.getClass().getSimpleName();
        System.out.println(c1);
        System.out.println(c2);
    }

    private static void ser() {
        /*
        Serialization :
        It is the process of converting Object states into Byte Stream.
 */
        try {
            String path = "E:\\sample\\dummy\\sample1.txt";
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(new File("E:\\sample\\dummy")));
            Employee e1 = new Employee(1, "person1", "backend developer", 1236);
            Employee e2 = new Employee(2, "person2", "full stack developer", 12346);
            oos.writeObject(e1);
            oos.writeObject(e2);
            System.out.println("Objects stored in the given path");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    private static void deser() {
    /*
     DeSerialization :
        It is the process of converting Byte Stream into Object states(Java Object).

     */
        try {
            String path = "E:\\sample\\dummy\\sample1.txt";
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
//            ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(new File("E:\\sample\\dummy")));
//            Object obj =ois.readObject();
            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();
            e1.details();
            e2.details();
//            Employee e3 = (Employee)ois.readObject();
//            we cannot read more than two object because in file we have two objects only
            System.out.println("Objects read successfully");
        } catch (IOException ioe) {
            System.out.println(ioe);
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        }
    }

    private static void serDeser() {
        try {
            String path = "E:\\sample\\dummy\\empstd.txt";
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Employee e1 = new Employee(101, "emp name1", "java dev", 12345);
            Student s1 = new Student(1001, "std name1");
            oos.writeObject(e1);
            oos.writeObject(s1);
            System.out.println("Serialization Done");
            //deserial
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee read_e1 = (Employee) ois.readObject();
            Student read_s2 = (Student) ois.readObject();
            read_e1.details();
            read_s2.details();
            System.out.println("DeSerialization Done");
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (ClassNotFoundException c) {
            System.out.println(c);
        } catch (ClassCastException cce) {
            System.out.println(cce);
        }
    }

    private static void serDeser2() {
        try {
            String path = "E:\\sample\\dummy\\empstd.txt";
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Employee e1 = new Employee(101, "emp name1", "java dev", 12345);
            Student s1 = new Student(1001, "std name1");
            oos.writeObject(e1);
            oos.writeObject(s1);
            System.out.println("Serialization Done");
            //deserial
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Fully Qualified ClassName : package with ClassName
//          java.util.Scanner sc = new java.util.Scanner(System.in);
//            Class c1 = ois.getClass();
//            Class c2 = ois.readObject().getClass();
//            String c3 = ois.readObject().getClass().getSimpleName();
//            System.out.println(c1);
//            System.out.println(c2);
//            System.out.println(c3);
            Object class1 = ois.readObject();
            Object class2 = ois.readObject();
            Student read_e1 = null;
            if (class1 instanceof Student){
                //type cast
                read_e1 =(Student) class1;
                System.out.println("a");
            }
            if (class2 instanceof Student){
                //type cast
                read_e1 =(Student) class2;
                System.out.println("b");
            }
//            Student read_s2 =(Student) ois.readObject();
            read_e1.details();
//            read_s2.details();
            System.out.println("DeSerialization Done");
        } catch (IOException ioe) {
            System.out.println(ioe);
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        } catch (ClassCastException cce) {
            System.out.println(cce);
        }
    }
    private static void dataIO(){
        try {
            String path = new String("");
            File file = new File(path);
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);
            //writing primitive data we have 8 methods
            dos.writeInt(10);
            dos.writeByte((byte)10);
            //for String we have writeUTF()
            dos.writeUTF("string data");
            dos.flush();//written data's are stored in file
            System.out.println("Data stored successfully");
            //use DataInputStream to read primitive data
        }catch (IOException ioe){
            System.out.println(ioe);
 }
}
}