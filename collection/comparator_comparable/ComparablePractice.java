package collection.comparator$comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    String role;
    double salary;

    public Employee(int id,String name,String role,double salary){
        this.id= id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    @Override
    public String toString(){
      return "Employee{" +
              " id=" + id +
                " name= " + name + '\'' +
                " role= " + role + '\''+
                " salary= " + salary +'\''+
                '}'+'\n';
    }

    @Override
    public int compareTo(Employee em) {
//        if(this.id > em.id){
//          return 1;
//        } else if (this.id < em.id) {
//          return  -1;
//        }
//        else{
//            return  0;
//        }
       //return Integer.compare(this.id ,em.id); // (Ascending)integer wrapper class compare method
        //return Double.compare(em.salary,this.salary);//(Descending)
        //return this.id - em.id;
        return this.name.compareTo(em.name);
    }
}
public class ComparablePractice {
    public static void main(String[] args) {
        m1();


    }
       static void m1() {
            ArrayList<Employee> al = new ArrayList();
            Employee e1 = new Employee(122,"Vijay","Developer",20000);
            Employee e2 = new Employee(112,"Gokul","Developer",40000);
            Employee e3 = new Employee(102,"Vicky","Developer",10000);
            Employee e4 = new Employee(142,"Vinu","Developer",30000);
            Employee e5 = new Employee(132,"Tamizh","Developer",50000);

            al.add(e1);al.add(e2);al.add(e3);al.add(e4);al.add(e5);

            System.out.println("Before Sorting......");
           System.out.println(al);
           Collections.sort(al);
           System.out.println(al);

        }

}
