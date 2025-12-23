package shallowandDeepCopy;

class Department{
    int deId;
    String deName;

    public Department(int deId, String deName) {
        this.deId = deId;
        this.deName = deName;
    }
    void display(){
        System.out.println("Department Name: "+ deName);
        System.out.println("Department Id: "+ deId);
    }
}
class Student implements Cloneable{
    String name;
    int id;
    Department dep;

    public Student(String name, int id,Department dep) {
        this.name = name;
        this.id = id;
        this.dep = dep;
    }
    void display(){
        System.out.println("Student Name: "+ name);
        System.out.println("Student Id: "+ id);
        dep.display();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Department de = new Department(9991,"Maths");
        Student s1 = new Student("Vijay",12,de);
        de.deName = "java";
        s1.display();
        Student s2 = (Student) s1.clone();
        s2.display();


    }
}
