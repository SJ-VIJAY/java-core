package shallowandDeepCopy;
class Department1 implements Cloneable{
    int deId;
    String deName;

    public Department1 (int deId, String deName) {
        this.deId = deId;
        this.deName = deName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    void display(){
        System.out.println("Department Name: "+ deName);
        System.out.println("Department Id: "+ deId);
    }
}
class Student1 implements Cloneable{
    String name;
    int id;
    Department1 de1;

    public Student1(String name, int id,Department1 de1) {
        this.name = name;
        this.id = id;
        this.de1 = de1;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student1 ob = (Student1) super.clone();
        ob.de1 = (Department1)ob.de1.clone();
        return ob;
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Id: " + id);
        de1.display();
    }
}
public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Department1 de1 = new Department1(1234,"Developer");
        Student1 s1 = new Student1("vicky",12,de1);
        Student1 s2 = (Student1) s1.clone();
        de1.deName = "Tester";
        s2.display();
        s1.display();

    }
}
