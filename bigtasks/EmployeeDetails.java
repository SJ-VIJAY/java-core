package bigtasks;

//Remove duplicate Object from HashSet, Object should be Employee type.
// It contains fields.

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee{
   private int id;
   private String name;
   private String department;
   private double salary;
   private String company;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public Employee(int id, String name, String department, double salary, String company) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee " +
                "id=" + id +
                ", name='" + name +
                ", department='" + department  +
                ", salary=" + salary +
                ", company='" + company;

    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee em =(Employee) obj;
        return em.id == id &&
                Objects.equals(em.name,name) &&
                Objects.equals(em.department,department) &&
                Objects.equals(em.salary,salary) &&
                Objects.equals(em.company,company);

    }
    @Override
    public int hashCode() {
        return Objects.hash(id,name,department,salary,company);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Set<Employee> hs = new HashSet<>();
        hs.add(new Employee(101,"Vijay","Backend",25000,"Tcs"));
        hs.add(new Employee(101,"Vinu","Fullstack",30000,"Wipro"));
        hs.add(new Employee(102,"Vinu","Fullstack",30000,"Wipro"));
        hs.add(new Employee(103,"Gokul","Hr",35000,"Flex"));
        hs.add(new Employee(104,"Parthi","Backend",31000,"Oracle"));
        hs.add(new Employee(104,"Parthi","Backend",31000,"Oracle"));
        hs.add(new Employee(105,"Tamizh","Production Support",28000,"Hcl"));

        System.out.println("after removing the duplicates ");
        System.out.println();
        for(Employee em : hs){
            System.out.println(em);
        }

    }
}
